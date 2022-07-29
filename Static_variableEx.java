package Oopsdemo;

import java.util.Scanner;

class Std
{
	int id;
	String name,address;
	long phno;
	static String instName="Anudip";//static variable
	//static block
	static {
		//instName="Anudip Foundation";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter institution name:");
	instName=sc.nextLine();
	}
	public  Std(int i,String n,String add,long ph)
	{
		id=i;
		name=n;
		address=add;
		phno=ph;
		
	}
	public static void changeInstName()
	{
		instName="Anudip Foundation for Welfare";
	}
	public void getData()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Phone No: "+phno);
		System.out.println("Institute name: "+instName);
	}
	
}

public class Static_variableEx {

	public static void main(String[] args) {
		
		Std std=new Std(12212,"Chayan","Durgapur",7003872448l);
		std.getData();
		Std.changeInstName();
		Std std1=new Std(45564,"Binoy","Bankura",9433489176l);
		std1.getData();
Std.changeInstName();
	}

}