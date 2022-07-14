/// Java Program to Print Odd Numbers from 1 to N using For loop

package basicprogram;
import java.util.Scanner;
public class OddNum {
	
	public static void main(String[] args) {
		
		// Declare variable
				int number, i;
				Scanner sc = new Scanner(System.in);// create object of Scanner
				
				
				System.out.print(" Please Enter any Number : ");
				number = sc.nextInt();	
				
				for(i = 1; i <= number; i++)
				{
					if(i % 2 != 0)
					{
						System.out.print(i +"\t"); 
					}
				}	
			}
}
