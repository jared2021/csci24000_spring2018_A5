//Honor Pledge:
//
//I pledge that I have neither given nor 
//recieved any help on this assignment
//
//jascho
import java.lang.String;
public class Employee
{
	
	//attributes of a Employee
	protected int EmployeeId;
	protected String FirstName;
	protected String LastName;
	protected double Rate;
	protected double Pay;
	protected int Time;
	//normal constructor
	public Employee(String[] data)
	{	
		EmployeeId=Integer.parseInt(data[1]);
		FirstName=data[2];
		LastName=data[3];
	}
	

	//calculates the pay 
	public  void calculatePay(int hours, double Rate)
	{
		Time=hours;
		this.Rate=Rate;
		this.Pay= this.Time * this.Rate;
	}
	
	//returns the employees id and their pay
	public String getPay()
	{
		String p="ID:%-12d Pay:%-8f";
		return String.format(p,EmployeeId,Pay);
	}
}
