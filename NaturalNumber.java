//WAP to calculate sum of natural number from 1 to n.

package basicprogram;
import java.util.*;
public class NaturalNumber {

	public static void main(String[] args) {
		
			int range,i,sum=0;//initialize sum as 0
			Scanner sc=new Scanner(System.in); //createing object of scanner class
			System.out.println("enter the range: ");
			range=sc.nextInt();//take input from user
			//for loop
			for(i=1;i<=range;i++)//i is counter variable
			{
				sum+=i;
			}
			System.out.println("Sum of "+range+" natural number: "+sum);
	}

}
