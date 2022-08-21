package arrayexample;
import java.util.Scanner;
public class SearchElement {

	public static void main(String[] args) {
	int size,search,arr[],i;
	boolean flag=false;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of an array:");
	size=sc.nextInt();
	//instancetiate array
	arr=new int[size];
	//initialize array
	System.out.println("enter "+size+" elements in an array");
	for(i=0;i<size;i++) 
		
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element you want to searching for:");
		search=sc.nextInt();
		//found the elements
		for(i=0;i<size;i++)
		{
			if(arr[i]==search)
			{
				//pos=i;
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("data found at"+(i+1)+" positon");
		}
		else
			System.out.println("Data not found");
	}
	}

		