package multithreding;
class PrintData1{
	synchronized void multiplication(int n)
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
}

public class Annoymus {

	public static void main(String[] args) {
		
		//only on object PrintData class 
PrintData1 pd=new PrintData1();
//Anonymous class
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