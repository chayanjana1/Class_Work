//write a program to count number of digits in a number?

package basicprogram;

import java.util.Scanner;

public class CountNum {

	public static void main(String[] args) {
		//Declare variable
		int count=0,num,temp;
		 Scanner sc = new Scanner(System.in);// create object of Scanner
	      System.out.print("Enter number:");        
	      num=sc.nextInt();
	      //storing value in temp for future use
	      temp=num;
	      for(;num>0;)
	      {
	    	  //counting no of digits
	    	  count++;
	    	  num = num/10;
	      }
	      System.out.println("total digits of "+ count);

	}

}
