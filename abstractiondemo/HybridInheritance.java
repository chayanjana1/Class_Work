package abstractiondemo;
interface GP
{
	void fun();
	}
interface A1 extends GP
{
	void print();
	}
interface B extends GP
{
	void print();
	}
class Child1 implements A1,B
{

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("Interface is fun");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("This is interface function");
	}
	}
public class HybridInheritance {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Child1 ch=new Child1();
			ch.fun();
			ch.print();

	}

}
