package basicprogram;
import java.util.Scanner;
public class StarPattern1 {
 public static void main(String[] args) {
	 int i,j,n;
	 System.out.println("Enter the number of rows: ");
	 Scanner sc=new Scanner(System.in);
	 n=sc.nextInt();
	 for(i=1;i<=n;i++)
	 {
		 for(j=1;j<=(n+1)-i;j++)
		 {
			 System.out.print("*");
		 } 
			 System.out.println();
		 }
	 }
 }

