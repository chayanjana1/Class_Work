//write a program to count no of odd number from 1 to n.

package basicprogram;
import java.util.*;
public class NumberOfOddNumbers {

	public static void main(String[] args) {
		int n;//declare a variable n for range
		int count=0;//counter variable
		Scanner sc=new Scanner(System.in);// creating object of Scanner class
		System.out.println("Enter the Number: ");
		n=sc.nextInt();//take input from user and store the value in the variable 
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)//check for odd number
			{
				System.out.print(" "+i);
				count++;//count number of odd numbers with in a range
		}
			}
		System.out.println("\nNumber odd between 1 to "+n+" is: "+count);//output
	}


}

