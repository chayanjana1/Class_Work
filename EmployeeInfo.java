/*
 * create class employee,declare variable empId,empName,basicSalary.,
 * designation declare methods setData() to set the employee information. 
 * create method getAppraisal() method to calculate the incremenet appraisal.
 * if any employee served minimum 1year,provide 10% increment. declare calculateTA() to calculate travel allowance. 
 * if that employee designation is manager then 3000 ta else 1000 ta will be provided.
 */

package Oopsdemo;
import java.util.*;
class Employee{
	int empid;
	String empName,designation;
	float empSalary;
	int empdoj;
	public void setData(int id,String name,String desig,float salary,int doj)
	{
		empid=id;
		empName=name;
		designation=desig;
		empSalary=salary;
		empdoj=doj;
	}
	public float getApprisal()
	{
		if(2022-empdoj>1) {
		float Salary=empSalary+(empSalary*0.1f);
		return Salary;
		}
		else
		return empSalary;
	}
	public int TA()
	{
		int ta=0;
		if(designation.equals("manager")||designation.equals("Manager"))
			ta=3000;
		else
			ta=1000;
		return ta;
		
	}
	public void display()
	{
		System.out.println("Emp Id: "+empid);
		System.out.println("Emp Name: "+empName);
		System.out.println("Emp Designation: "+designation);
		System.out.println("Emp Date of joining: "+empdoj);
		float salary=getApprisal();
		System.out.println("Emp Salary: "+salary);
		int travel=TA();
		System.out.println("Emp Travel: "+travel);
	}
	
}
public class EmployeeInfo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Emp id: ");
		int id=sc.nextInt();
		System.out.println("Enter the Emp Name: ");
		String name=sc.next();
		System.out.println("Enter the Emp Designation: ");
		String desig=sc.next();
		System.out.println("Enter the Emp Salary: ");
		float salary=sc.nextFloat();
		System.out.println("Enter the Date of joining: ");
		int joining=sc.nextInt();
		Employee emp=new Employee();
		emp.setData(id,name,desig,salary,joining);
		emp.display();
		

	}

}
