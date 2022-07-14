//wap to calculate factorial number from 1 to n.

package basicprogram;
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		int num,i,fact=1;//initialize sum as 0
		Scanner sc=new Scanner(System.in); //createing object of scanner class
		System.out.println("enter the range: ");
		num=sc.nextInt();//
		for(i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("Factorial of "+num+" is "+fact);

	}

}
