package Oopsdemo;
/*Write a program to implement below scenario:

Create a Bike class having properties like engine, wheel, name and methods like start move break stop.
Create two subclass of bikes and create the bike object as per user requirement (input). If that particular type of bike is available assign that bike to a rider. Rider should have name and license number and rider will ride the bike.
Display all the details including Car Engine details wheel details along with rider details. And also all the behavi

And also all the behavior (Methods ) of user given bike.*/

// Base Class Vehicle
import java.util.Scanner;

class Bike1
{
	String engine;
	String name;
	final int wheel=2;
	String avil="avilable";
	Bike1(String engine,String name)
	{
		this.engine=engine;
		this.name=name;
	}
	
	
	}
class User1 extends Bike1
{
	User1(String engine, String name) {
		super(engine, name);
		// TODO Auto-generated constructor stub
	}
	String UserName;
	Long lNo;
	void userdetails(String UserName,Long lNo)
	{
		this.UserName=UserName;
		this.lNo=lNo;
		
	}
	void assignRider()
	{
		System.out.println(name+" is assign to "+UserName);
		System.out.println("Bike name: "+name+"\n Engine: "+engine+"\nWheel: "+wheel+"\n RiderName: "+UserName+"\n Lisence No: "+lNo+"\nAvilability: "+avil);
	}
	}

public class Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose the Bike category");
		String name=sc.next();
		System.out.println("Enter the engine name: ");
		String engine=sc.next();
		System.out.println("Enter your name: ");
		String UserName=sc.next();
		System.out.println("Enter Lisence No: ");
		Long lNo=sc.nextLong();
		User1 us=new User1(engine,name);
		us.userdetails(UserName,lNo);
		us.assignRider();
		
	}

}