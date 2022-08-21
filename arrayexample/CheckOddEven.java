package arrayexample;

public class CheckOddEven {

	public static void main(String[] args) {
		int even=0;
		int odd=0;
		int arr[]= {1,5,8,6,9,10};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}//end of loop
		System.out.println("Odd Count "+odd);
		System.out.println("Even Count"+even);

	}

}
