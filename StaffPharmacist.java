//Honor Pledge:
//
//I pledge that I have neither given nor
//received any help on this assignment
//
//jascho
import java.lang.String;
import java.util.Scanner;
public class StaffPharmacist extends Employee
{
	//attributes of a StaffPharmacists
	protected boolean Licensed=true;
	double Rate=40;
	int Time=0;
	double Pay=0.0;
	//overloaded constructor
	public StaffPharmacist (String[] data)
	{
		super(data);
	}
	public String getData()
	{
		String s="ID:%-12s Name:%-10s %-20s Rate: %-2s Lincensed: %-4s";
		return String.format(s,EmployeeId,FirstName,LastName,Rate,Licensed);
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
