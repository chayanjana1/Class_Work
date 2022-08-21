package arrayexample;

import java.util.Scanner;
public class CheckOddEven1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the required size of the array :");
	    int size = sc.nextInt();
	    int arr[] = new int [size];
		int sum=0, even=0,odd=0;
		System.out.println("Enter the Numbers: ");
		//for(int i=0;i<arr.length;i++){
		//    arr[i]=a.nextInt();
		for(int var:arr) {
			var=sc.nextInt();
			sum+=var;
			if(var%2==1) odd++;
			else even++;
		}
		System.out.println("Sum is :"+sum);
		System.out.println("Odd Numbers: "+odd);
		System.out.println("Even Numbers: "+even);
	}

}
