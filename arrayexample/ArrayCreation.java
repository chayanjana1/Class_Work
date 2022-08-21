package arrayexample;

import java.util.Scanner;

public class ArrayCreation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		// compile time
		int arr[]= {2,3,4,5,6};
		
		//print the array elements
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("enter 5 elements in an array:");
		//run time
		int arr2[]=new int[5];
		//assign value from user
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		System.out.println("Array elements are:");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
// for each loop
		System.out.println("printing using for each loop");
		for(int var:arr2)
		{
			System.out.println(var);
		}
	}

}
