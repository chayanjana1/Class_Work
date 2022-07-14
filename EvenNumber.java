package basicprogram;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range:");
		n=sc.nextInt();
		System.out.println("The even numbers in between 1 to"+n + "are:");
		for(i=1;i<=n;i=i+2)
		{
			//if(i%2==0)
				System.out.println(i);
		}

	}

}
