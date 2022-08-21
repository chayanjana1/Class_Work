package exceptionhandling;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		//int a,b,c;
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter two digit");
		//a=sc.nextInt();
		//b=sc.nextInt();
		//int arr[]=new int[5];
		//String str=null;
		String str="hi";
		try {
			//arr[7]=89;
		//c=a/b;//try internally throw exception(ArithmaticException) object if exception occured
		//System.out.println("result: "+ arr[7]);
			int i=Integer.parseInt(str);
			System.out.println(str.length());
		}//catch(NullPointerException e)
		catch(NumberFormatException e)
		{
			System.out.println("you can't convert string to integer");
			//System.out.println("Exception occured: "+e.getMessage());
		//System.out.println(e);
			//e.printStackTrace();
		//System.out.println("index out of bound");
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("rest of code");
		int a=10,b=30;
		System.out.println("addition value:"+ (a+b));
	}

}
