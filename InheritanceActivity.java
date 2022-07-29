package Oopsdemo;
/*
 * @Author Chayan Jana
 */

class Employee3// create a class Employee3
{
	// instance variable of the class Employee3
	long employeeId;
	String  employeeName;
	String employeeAddress;
	Long   employeePhone;
	double basicSalary;
	double specialAllowance=250.80;
	double Hra=1000.50;
	// overloaded constructor in the employee3 class, which takes the below constructor parameters and initializes them to their respective instance variables
	Employee3(long id,String name,String address,long phone,double basicsalary)
	{
		employeeId=id;
		employeeName=name;
		employeeAddress=address;
		employeePhone=phone;
		basicSalary=basicsalary;
	}
/*
 * method called calculateTransportAllowance in Employee class which should 
calculate the transport allowance by calculating 10% (default allowance) of the salary	
 */
	public double calculateTransportAllowence()
	{
		 double transportallowence=(double)10/100*basicSalary;
		// System.out.println("Transport Allownce: "+transportallowence);
		 return transportallowence;
		 
	}
	//a method calculateSalary in which the basic salary is calculated
	public void  calculateSalary()
	{
		double ta=this.calculateTransportAllowence();
		double salary=ta+basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary *
				
				Hra/100);
		System.out.println("Salary: "+salary);
		
	}
	}
// sub class Manager  with base class Employee3
class Manager extends Employee3
{
	
	Manager(long id, String name, String address, long phone,double basicSalary) {
		super(id, name, address, phone, basicSalary);
		super.basicSalary=basicSalary;
	}
	/*
	 * For a manager, the transportation allowance is 15% of the basic salary. So override the 
	calculateTransportAllowance method in Manager class which should calculate the 
	transport allowance as 15% of the base salary.
	 */
	public double  calculateTransportAllowence()
	{
		 double transportallowence=(double)15/100*basicSalary;
		 //System.out.println("basic salary: "+basicSalary);
		 //System.out.println("Transport Allownce: "+transportallowence);
		 return transportallowence;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Manager [employeeId=");
		builder.append(employeeId);
		builder.append(", employeeName=");
		builder.append(employeeName);
		builder.append(", employeeAddress=");
		builder.append(employeeAddress);
		builder.append(", employeePhone=");
		builder.append(employeePhone);
		builder.append(", basicSalary=");
		builder.append(basicSalary);
		builder.append("]");
		return builder.toString();
	}
	

	}
// sub class Trainee with base class Employee
class Traniee extends Employee3{

	Traniee(long id, String name, String address, long phone,double basicSalary) {
		super(id, name, address, phone, basicSalary);
		super.basicSalary=basicSalary;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Traniee [employeeId=");
		builder.append(employeeId);
		builder.append(", employeeName=");
		builder.append(employeeName);
		builder.append(", employeeAddress=");
		builder.append(employeeAddress);
		builder.append(", employeePhone=");
		builder.append(employeePhone);
		builder.append(", basicSalary=");
		builder.append(basicSalary);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
//Create a class “InheritanceActivity” with a main method
public class InheritanceActivity {

	public static void main(String[] args) {
//Create an instance of Manager class by calling the overloaded constructor with the below parameters,
	Manager mg=new Manager(25645,"Jam","Kolkata",5658955l,65000);
System.out.println(mg);

double tra=mg.calculateTransportAllowence();//Invoke the calculateTransportAllowance for the manager in the main method
System.out.println("transport Allowence:"+tra);
mg.calculateSalary();//Invoke the calculateSalary method of the manager object
//Create an instance of Trainee class by calling the overloaded constructor with the below parameters
Traniee tn=new Traniee(25645,"Jack","Durgapur",568945l,50000);
System.out.println(tn);
tra=tn.calculateTransportAllowence();//Invoke the calculateTransportAllowance for the trainee class in the main method 
System.out.println("transportAllowence:"+tra);
tn.calculateSalary();//Invoke the calculateSalary method of the trainee object
}
}