package exceptionhandling;
import java.util.Scanner;

class TaxCalculator
{
	public void calculateTax(String empName,boolean isindian,double empSal)
	{
		double taxamount;
		if(isindian==false)
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		else if(empName==null || empName.isEmpty())
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		else if(empSal>=100000&&isindian==true)
			taxamount=empSal*(double)8/(double)100;
		else if(empSal>=50000&&empSal<100000&&isindian==true)
			taxamount=empSal*(double)6/(double)100;
		else if(empSal>=30000&&empSal<50000&&isindian==true)
			taxamount=empSal*(double)5/(double)100;
		else if(empSal>=10000&&empSal<30000&&isindian==true)
			taxamount=empSal*(double)4/(double)100;
		else
			throw new TaxNotEligibleException("The employee does not need to pay tax");
	System.out.println("you have to pay "+taxamount+" amount tax");
	System.out.println("Emp name: "+empName);
	}
	}
public class CalculatorSimulator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		String empName=sc.nextLine();
		System.out.println("Enter the Salary: ");
		double empsal=sc.nextDouble();
		System.out.println("Are you indian or not: ");
		boolean isindian=sc.nextBoolean();
		TaxCalculator tax=new TaxCalculator();
		try {
		tax.calculateTax(empName, isindian, empsal);
		}catch(CountryNotValidException e)
		{
			System.out.println(e.getMessage());
		}
		catch(EmployeeNameInvalidException e)
		{
			System.out.println(e.getMessage());
		}
		catch(TaxNotEligibleException e)
		{
			System.out.println(e.getMessage());
			
		}
		
		
	}

}
