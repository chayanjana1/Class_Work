// Write a program to print multiplication table of a given number.

package basicprogram;
import java.util.Scanner;
public class MulTable {

	public static void main(String[] args) {
		        Scanner s = new Scanner(System.in);// create object of Scanner
			      System.out.print("Enter number:");        
			      int n=s.nextInt();
		        for(int i=1; i <= 10; i++)
		        {
		            System.out.println(n+" * "+i+" = "+n*i);
		        }
		    }

}
	


