package arrayexample;
import java.util.Scanner;
public class NegativeArrayItems {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
			int Size, i;	
			sc = new Scanner(System.in);
			
			System.out.print("\nPlease Enter the NEG Array size  : ");
			Size = sc.nextInt();
			int[] Neg_arr = new int[Size];
			
			System.out.format("\nEnter NEG Array %d elements : ", Size);
			for(i = 0; i < Size; i++) 
			{
				Neg_arr[i] = sc.nextInt();
			}
			
			NegativeElement(Neg_arr, Size);
			
		}
		public static void NegativeElement(int[] Neg_arr, int size ) {
			int i;
			
			System.out.print("\nList of Negative Numbers in NEG Array : ");
			for(i = 0; i < size; i++) 
			{
				if(Neg_arr[i] < 0) {
					System.out.format("%d  ", Neg_arr[i]);
				}
			}

	}

}
