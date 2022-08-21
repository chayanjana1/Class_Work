package arrayexample;
import java.util.Scanner;
public class DuplicateElementsArray {

	public static void main(String[] args) {
		int arr[],size,i,count=0,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
		size=sc.nextInt();
		//initialize the array
		arr=new int[size];
		System.out.println("enter"+ size+"elements in an array:");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		//print the array elements:
		System.out.println("Array elements are:");
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		//find duplicate elements in array
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j]) //arr[1]==arr[5] 4==4
				{
					count++; //count=0+1=1+1=2
					break;
				}
		}
		}
		//print total no of duplicate elements
		System.out.println("total no of duplicate elements are: "+ count);
		
	}

}
