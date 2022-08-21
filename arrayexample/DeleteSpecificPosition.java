package arrayexample;
import java.util.Scanner;
public class DeleteSpecificPosition {

	public static void main(String[] args) {
		int arr[]=new int[20];
		int size,i,pos;
		Scanner sc=new Scanner(System.in);
System.out.println("Enter size of an array");
size=sc.nextInt();
System.out.println("Enter "+size+" element in an array");
for(i=0; i<size ;i++)
{
	arr[i]=sc.nextInt();
}
System.out.println("Enter Position for Delete");
pos=sc.nextInt();
//Checking position is valid or not
if(pos>size || pos<0)
{
	System.out.println("Invalid Position");
}
else
{
	for(i=pos-1; i<=size; i++)
	{
		arr[i]=arr[i+1];
	}
	//deleting element at given position and decrement size
	size--;
	//print array after insert operation
	System.out.println("Array elements after Deletion");
	for(i=0; i<size;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
	}

}
