//Honor Pledge:
//
//I pledge that I have neither given nor 
//received any help on this assignment
//
//jascho
import java.lang.String;
import java.util.Scanner;
public class PharmacyManager extends StaffPharmacist
{

	//attributes of a PharmacyManager
	private boolean Leadership=true;
	double Rate=50;
	int Time=0;
	double Pay=0.0;
	//overloaded constructor
	public PharmacyManager(String[] data )
	{
		super(data);
	}
	public String getData()
	{
		String s="ID:%-12s Name:%-10s %-20s Rate: %-2s Lincensed: %-4s Has Leadership: %-4s";
		return String.format(s,EmployeeId,FirstName,LastName,Rate,Licensed, Leadership);
	}

	//calculates the pay using the Employees method
	public void calculatePay(int hours,double Rate)
	{
		super.calculatePay(hours,Rate);
	}

	//returns the pay and employee id using the employee method
	public String getPay()
	{
		return super.getPay();
	}
}
