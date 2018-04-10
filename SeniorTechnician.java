//Honor Pledge:
//
//I pledge that I have neither given nor 
//recieved any help on this assignment
//
//jascho
import java.lang.String;
import java.util.Scanner;
public class SeniorTechnician extends StaffTechnician
{
	//attributes of a SeniorTechnician
	double Rate=25;
	protected boolean ServiceAward=true;
	int Time=0;
	double Pay=0.0;
	//overloaded constructor
	public SeniorTechnician (String[] data)
	{
		super(data);
	}
	public String getData()
	{
		String s="ID:%-12s Name:%-10s %-20s Rate: %-2s Degree: %-7s Has Service Award: %-4s";
		return String.format(s,EmployeeId,FirstName,LastName,Rate,Degree,ServiceAward);
	}

	//calculates the pay using the employee method
	public void calculatePay(int hours,double Rate)
	{
		super.calculatePay(hours,Rate);
	}

	//returns the employee id and pay using the employee method
	public String getPay()
	{
		 return super.getPay();
	}
}
