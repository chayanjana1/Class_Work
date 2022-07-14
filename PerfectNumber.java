//Write a program check the number perfect or not.

package basicprogram;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int number,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check perfect or not?");
		number=sc.nextInt();//6
		
		for(i=1;i<number;i++)//6%2=0==0t
		{
			if(number%i==0)
			{
				sum=sum+i;//sum=1+2=3 sum=3
				//sum+=i;
			}
		}//loop end

		if(number==sum) //6==6 t
			System.out.println(number+ " is a perfect number");
		else
			System.out.println(number+ "is not a perfect number ");
		
	}

}
