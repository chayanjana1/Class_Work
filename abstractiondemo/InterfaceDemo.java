package abstractiondemo;
interface 	Printable
{
	int x=100;
	void display();
	void draw();
	void fun();
}
interface Drawable extends Printable
{
	void draw();
}

interface sayable
{
	void say();
}
class Print implements Printable
{

	@Override
	public void display() {
		System.out.println("display the message");
		
		
	}
	

	@Override
	public void fun() {
		System.out.println("fun learning");
}


	@Override
	public void draw() {
		System.out.println("draw something");
		
	}
	
}
class message implements Drawable,sayable
{

	@Override
	public void display() {
		System.out.println("hello world");
	}

	@Override
	public void fun() {
		System.out.println("hi, I am doing fun");
		
	}

	@Override
	public void draw() {
		System.out.println("drawing circle");
		
	}

	@Override
	public void say() {
		System.out.println("hello world");
		
	}

	
		
	}
	

public class InterfaceDemo {

	public static void main(String[] args) {
		//you can't instantiate interface,but you can create referance variable
		Printable p=new Print();
		p.display();
		p.fun();
		p.draw();
		message msg=new message();
		msg.display();
		msg.fun();
		msg.draw();
		msg.say();
	}
}

