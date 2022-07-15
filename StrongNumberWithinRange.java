package basicprogram;

public class StrongNumberWithinRange {

	public static void main(String[] args) {
		for(int num=1;num<=500;num++) {
			int sum=0;
			int temp=num;
			while(temp!=0)
			{
				int rem=temp%10;
				int fact=1;
				for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum+=fact;
			temp=temp/10;
			}
			if(sum==num)
			System.out.print(" "+num);
				

	}

}
}