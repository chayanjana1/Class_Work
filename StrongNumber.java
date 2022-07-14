//WAP check a number strong number or not.
package basicprogram;
import java.util.*;
public class StrongNumber {

	public static void main(String[] args) {
		int n,i;
		int fact_n,lastdig;
		Scanner sc = new Scanner(System.in); //crearteing object of scanner class
		System.out.print("\nEnter the number : " );
		n = sc.nextInt();
		int total = 0;
		int temp_n = n;//store actual number for future use
		while(n != 0)
		{
		i = 1;
		fact_n = 1;
		lastdig = n % 10;
		//calculate Strong number
		while(i <= lastdig)
		{
		fact_n = fact_n * i;
		i++;
		}
		total = total + fact_n;
		n = n / 10;
		}
		if(total == temp_n)
	// checking actual number is matched with sum or not
		System.out.println(temp_n + " is a strong number\n");
		else
		System.out.println(temp_n + " is not a strong number\n");
		System.out.println();

	}

}
