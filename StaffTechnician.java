//Honor Pledge:
//
//I pledge that I have neither given nor
//received any help on this assignment
//
//jascho
import java.lang.String;
import java.util.Scanner;
public class StaffTechnician extends Employee
{
	//attributes of a StaffTechnician
	double Rate=20;
	protected boolean Degree=true;
	int Time=0;
	double Pay=0.0;
	//overloaded constructor
	public StaffTechnician (String[] data)
	{
		super(data);
	}
	public String getData()
	{
		String s="ID:%-12s Name:%-10s %-20s Rate: %-2s Degree: %-4s";
		return String.format(s,EmployeeId,FirstName,LastName,Rate,Degree);
	}

	//calculates the pay using the employee method
	public void calculatePay(int hours,double Rate)
	{
		super.calculatePay(hours,Rate);
	}

	//returns the employee id and the pay using the employee method
	public String getPay()
	{
		return super.getPay();
	}
}
