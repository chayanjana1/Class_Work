package multithreding;
class PrintData2{
	
	void multiplication(int n)//method not synchronized
	{
		System.out.println("out of synchronize Block");
		synchronized(this)
		{
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
		}//end of for
}// end of block
public class SynchronizeBlock {

	public static void main(String[] args) {
		
		PrintData2 pd=new PrintData2();
		Thread t1=new Thread()
		{
			public void run()
			{
				pd.multiplication(5);
			}
		};
		Thread t2=new Thread()
		{
			public void run()
			{
				pd.multiplication(100);
			}
		};
		t1.start();
		t2.start();
	}

}
	


