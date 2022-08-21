package arrayexample;

public class TestArray {
	public static int[] get()
	{
		int arr[]= {3,56,45,34};
		//return new int[] {10,20,40};
		return arr;
	}
	static void minElement(int ar[])
	{
		int min=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(min>ar[i])
				min=ar[i];
		}
		System.out.println("min value: "+min);
	}

	public static void main(String[] args) {
		//int a[]= {33,6,3,1,70};
		// minElement(a); //passing array to method
		//passing anonymous array to method
		minElement(new int[] {33,6,3,1,70});
		int a[]=get();
		for(int var:a)
		{
			System.out.println(var);
		}
	}

}
