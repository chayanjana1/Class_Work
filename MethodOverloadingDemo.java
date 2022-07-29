package Oopsdemo;
class Addition
{
	public  void add(int a)
	{
		System.out.println("Addition value of one parameter: "+(a+10));
	}
	public void add(int a,int b,int c)
	{
		System.out.println("Addition value of parameter:"+(a+b+c));
	}
	public void add(int a,double b)
	{
		System.out.println("Addition value of parameter(int,double):"+(a+b));	
	}
	public void add(double b, int a)
	{
		System.out.println("Addition value of parameter(double,int):"+(b+a));
	}
}
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		Addition a=new Addition();
		a.add(12.3, 12);
		a.add(100);
		a.add(89, 50.8);
		a.add(12, 30, 40);
	}

}
