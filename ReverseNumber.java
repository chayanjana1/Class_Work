package basicprogram;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		int n,rem,reverse=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to reverse");
		n=sc.nextInt();
		temp=n;
		while(n>0) //while(n!=o)
		{
			
			rem=n%10; //1
			reverse=reverse*10+rem; //432*10=4320+1=4321
			n=n/10;
		}
System.out.println("reverse of :"+temp +" is :"+reverse);

if(temp==reverse)
	System.out.println("palindrome number");
else
	System.out.println("not a palindrome number");
	}

}
