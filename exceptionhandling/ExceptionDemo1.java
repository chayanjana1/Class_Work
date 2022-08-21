package exceptionhandling;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		//try with resource
		//Scanner sc=new Scanner(System.in);
		try (Scanner sc=new Scanner(System.in)){
			
			try {
			int a=30,b=10;
			System.out.println(a/b);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		System.out.println("rest of code");
		//int a=10,b=30;
		int arr[]=new int[5];
		arr[4]=90;
		//System.out.println("addition value: "+ (a+b));
		System.out.println("addition value: "+arr[4]);
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Exception: array index is out of bound");
	
	}
		finally {
			//sc.close();
			System.out.println("finally block always excute");
		}
	}   
}
