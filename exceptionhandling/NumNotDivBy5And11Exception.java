package exceptionhandling;
import java.util.Scanner;

public class NumNotDivBy5And11Exception {
	public static void NumberNotDivideBy5And11Exception(int n)
	{
		try {
		if(n%5==0 && n%11==0)
			throw new NumberValidation("Number is divide by 5 and 11");
		else 
			System.out.println("number is not divisible by 5 and 11");
	}catch(NumberValidation e)
		{
		System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		NumberNotDivideBy5And11Exception(num);
		

	}

}
