//Honor Pledge:
//
//I pledge that I have neither given nor
//recieved any help on this assignment
//
//jascho
import java.io.*;
import java.lang.String;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Driver
{
	public static void main(String [] args)
	{
		//creates a array for each of the four classes
		
		PharmacyManager[] pM= new PharmacyManager[1];
		StaffPharmacist[] sP= new StaffPharmacist[1];
		SeniorTechnician[] seT=new SeniorTechnician[1];
		StaffTechnician[] stT=new StaffTechnician[1];
		int hours=-1;

		//creates a scammer for input, sets input to 0 and prints off a menu
		Scanner s=new Scanner(System.in);
		String input="0";
		System.out.println("1. Load students (from file)");
		System.out.println("2. Exit program");
		System.out.println("Enter your Selection");

		//allowing user to input their choice and if they choose 1 it will try to load the file and depending on the leading number will create one of the four classes and if the file is not there it will catch the error 
		input=s.nextLine();
		if (input.equals("1")||input.equals("one"))
		{
			try
			{
				File list = new File("employees.txt");
				Scanner a=new Scanner(list);
				while(a.hasNextLine())
				{
					String line=a.nextLine();
					String[] array=line.split(",");
					
					if (array[0].equals("1"))
					{

						pM[0]=new PharmacyManager(array);
					}
					else if (array[0].equals("2"))
					{
						sP[0]=new StaffPharmacist(array);
					}
					else if (array[0].equals("3"))
					{
						seT[0]=new SeniorTechnician(array);
					}
					else if (array[0].equals("4"))
					{
						stT[0]=new StaffTechnician(array);
					}
				}
			}
		
			catch(FileNotFoundException e)
			{
				System.out.println("File not found, close program and download file.");
			}
		
			//prints out the second menu screen,and  asks for user input

			while (!input.equals("4")&&!input.equals("four"))
			{

				System.out.println("1. Print Employee Information");
				System.out.println("2. Enter Hours Worked");
				System.out.println("3. Calculate Paychecks");
				System.out.println("4. Exit Program");
				System.out.println("Enter your selection.");

				//takes the next input and if it is one it prints out the Data of each employee
				input=s.nextLine();			
				if (input.equals("1")||input.equals("one"))
				{
					System.out.println(pM[0].getData());
					System.out.println(sP[0].getData());
					System.out.println(seT[0].getData());
					System.out.println(stT[0].getData());
				}

				//if the input is two it will ask the user how many hours the employees worked and will pass that and their pay to each employee to calculate it.
				else if (input.equals("2")||input.equals("two"))
				{
					System.out.println("How many hours did the Pharmacy Manager work?");
					try
					{
						hours=s.nextInt();
						s.nextLine();
						pM[0].calculatePay(hours,50);

						System.out.println("How many hours did the Staff Pharmacist work?");
						hours=s.nextInt();
						s.nextLine();
						sP[0].calculatePay(hours,40);

						System.out.println("How many hours did the Senior Technician work?");
						hours=s.nextInt();
						s.nextLine();
						seT[0].calculatePay(hours,25);
						
						System.out.println("How many hours did the Staff Technician work?");
						hours=s.nextInt();
						s.nextLine();
						stT[0].calculatePay(hours,20);
						System.out.println("Pay calculated.");	
					}
					catch(InputMismatchException e)
					{
						System.out.println("Please input a number.");
					}
				}

				//if the input is three then it will check to make sure they inputed a number from choice 2 and if they did it will print out the employees id number and pay 
				else if (input.equals("3")||input.equals("three"))
				{
					if (hours!=-1)
					{
						System.out.println(pM[0].getPay());
						System.out.println(sP[0].getPay());
						System.out.println(seT[0].getPay());
						System.out.println(stT[0].getPay());
					}

					//if they did not input anything from choice two it will ask them to do that before they try to print out their pay
					else if(hours==-1)
					{
						System.out.println("Please enter in the hours worked before you print out the paychecks.");
					}
				}

				//closes the program
				else if (input.equals("4")||input.equals("four"))
				{
					System.out.println("Logged out.");
				}

				//if they enter something else it will print out this error message
				else
				{
					System.out.println("I do not know what you want me to do.");
				}	
			}
		}
		
		//if the user inputs a two in the first menu it will close the program
		else if (input.equals("2")||input.equals("two"))
		{
			System.out.println("Logged out.");

		}

		//if they enter  something else it will print out this error message
		else
		{
			System.out.println("I do not know what you want me to do.");
		}
		
	}
}

