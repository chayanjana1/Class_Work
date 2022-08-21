package arrayexample;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		//declare three array
				int arr1[][],arr2[][],arr3[][];
				int row,col,i,j;
				//ask user for row and coloumn 
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the rows: ");
				row=sc.nextInt();
				System.out.println("enter the columns: ");
				col=sc.nextInt();
				//create three array of size give by the user 
				arr1=new int[row][col];
				arr2=new int[row][col];
				arr3=new int[row][col];
				//input elements of 1st matrix
				System.out.println("enter the 1st matix: ");
				for(i=0;i<row;i++)
				{
					for(j=0;j<col;j++)
					{
						arr1[i][j]=sc.nextInt();
						
					}
				}
				System.out.println("enter the 2nd matix: ");
				for(i=0;i<row;i++)
				{
					for(j=0;j<col;j++)
					{
						arr2[i][j]=sc.nextInt();
						
					}
				}
				
				for(i=0;i<row;i++)
				{
					for(j=0;j<col;j++)
					{
						arr3[i][j]=arr1[i][j]+arr2[i][j];
						
					}
				}
				System.out.println("After adding two matrix: ");
				for(i=0;i<row;i++)
				{
					for(j=0;j<col;j++)
					{
						System.out.print(" "+arr3[i][j]);
						
					}
					System.out.println();
				}

	}

}
