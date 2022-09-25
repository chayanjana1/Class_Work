package java8features;

interface parent
{
	
default	void hi() {}
	
}


@FunctionalInterface
interface message extends parent
{
	void say();
	
	default void msg() {
		System.out.println("default with method body");
	}
	//can contain any number of Object class method
	int hashCode();
	String toString();
	boolean equals(Object obj);
}
public class FuntionalInterfaceDemo implements message{
	@Override
	public void say() {
		System.out.println("saying hello");
	}
	public static void main(String[] args) {
	
		FuntionalInterfaceDemo demo=new FuntionalInterfaceDemo();
		demo.msg();
		demo.say();
	}
}	

	

// functional interface-an interface that contains exactly one abstract method is known as 
//functional interface.it can have any numbers of default, static method 
//but can contain only one abstarct method. it can also declear of object
//class

//it also known as single abstract method interface or sam interface. it helps to 
//achieve functional programming approch
//invalid functional interface-- A functional interface can  extends another interface 
//only when it does not have any abstrct method