//write a program to print product of two digit.//
import java.util.Scanner;
public class Product{
	static void productNum(int x,int y){//user defind method
		int product=x*y;//caculate product of two numbers
			System.out.println("Product of "+x+" and "+y+":"+product);
//display result

}
public static void main(String args[]){//main method
   Scanner scan=new Scanner(System.in);
//create a scanner instance for receives input
// from the user - input from keyboard
		System.out.print("Enter the value to num1: ");
			int num1=scan.nextInt();
System.out.print("Enter the value to num2: ");
    int num2=scan.nextInt();
		productNum(num1,num2);//calling the method


		}

}