package Oopsdemo;
class Student1{
	//instance variable
	int id;
	String name,address;
	long phno;
	/*public void setData(int i,String n,String ad,long ph)
	{
		id=i;
		name=n;
		address=ad;
		phno=ph;
		
	}
	public void getData()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Phone No: "+phno);
	}*/
	public Student1(int i,String n,String ad,long ph)
	{
		id=i;
		name=n;
		address=ad;
		phno=ph;
		
	}
	public void getData()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Phone No: "+phno);
	}
}
public class ClassDemo1 {

	public static void main(String[] args) {
		//Student1 cha=new Student1();
				//Assigning value using instance of a class(not secure)
				/*
				 cha.id=41545;
				cha.name="Chayan Jana";
				cha.address="Durgapur";
				cha.phno=6946226;
				System.out.println("ID: "+cha.id);
				System.out.println("Name: "+cha.name);
				System.out.println("Address: "+cha.address);
				System.out.println("Ph: "+cha.phno);*/
				//Assigning value using method
				/*nil.setData(41545, "chayan", "durgapur",6976426 );
				nil.getData()*/;
				//Assigning value using constructor(secure)
				Student1 std=new Student1(12212,"Chayan","Durgapur",68213945);
				std.getData();

	}

}
