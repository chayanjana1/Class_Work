package arrayexample;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		//compile time initialization
		//int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int row,col;
		int arr[][];;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row and column");
		row=sc.nextInt();
		col=sc.nextInt();
		arr=new int[row][col];
		System.out.println("enter "+row+ "x"+ col + "matrix value:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
		}}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//getting class name of array
		//Class c=arr.getClass();
		//String name=c.getName();
		//System.out.println("array class name: "+ name);

	}

}
