package basicprogram;

import java.util.Scanner;

public class AmstrongNumberWithInARange {

	public static void main(String[] args) {
		for(int i=1;i<=500;i++)
		{
			int count=0;
			int ams=0; 
			int n=i;
			int temp=n;
			while(n!=0)//iterate while loop until n become 0
			{
				n=n/10;
				count++;//counter variable
			}
		while(temp!=0)
		{
			int rem=temp%10;
			ams+=Math.pow(rem,count);
			temp=temp/10;
		}
		if(ams==i)
		System.out.print(" "+i);

	}

}
}