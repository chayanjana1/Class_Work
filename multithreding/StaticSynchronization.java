package multithreding;
class PrintData3{
	static synchronized void multiplication(int n)
	{
		System.out.println("out of synchronize Block");
		synchronized (PrintData3.class) {
			
		
	
		for(int i=1;i<=5;i++)
		{
			 System.out.println(n*i);
			 try {
				 Thread.sleep(400);
			 }catch(Exception e)
			 {
				 System.out.println(e);
			 }
		}
		}
	
		System.out.println("Rest of code which is not synchronized");
		}
}
	class Sum1{
	static synchronized void sumOfNaturalNumber(int n)
	{
		synchronized (Sum1.class) {
		int sum=(n*(n+1))/2;
		System.out.println(sum);
		try {
			 Thread.sleep(400);
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}
	}

}
public class StaticSynchronization {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread()
		{
			public void run()
			{
				
				PrintData3.multiplication(5);
				
			}
		};
		Thread t2=new Thread()
		{
			public void run()
			{
				
				PrintData3.multiplication(100);
				
			}
		};
		Thread t3=new Thread()
		{
			public void run()
			{
				
				Sum1.sumOfNaturalNumber(10);
				
			}
		};
		Thread t4=new Thread()
		{
			public void run()
			{
				
				Sum1.sumOfNaturalNumber(50);
				
			}
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}

