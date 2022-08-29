package multithreding;

//shared object
class PD
{
	static synchronized void multiplication(int n)
	{    
		 
	     System.out.println("outside synchronizated block");
		 
		  for(int i=1;i<=5;i++)
		   {
			System.out.println(n*i);
		
			try
			  {
				Thread.sleep(400);
			  } catch(Exception e) {
				  System.out.println(e);
			     }
		     } //end of for
		  System.out.println("rest of code which is not Synchronized");   
	}//end of synchronized
	 
 }
public class SynchronizationDemo2 {

	public static void main(String[] args) {
		//only one object of printdata class
				//PrintData pd=new PrintData();
				
				//two thread object which will share above object
				Thread t1=new Thread()
				  {
					  public void run()
					   {
						  PD.multiplication(5);
					   }
				  };
				Thread t2=new Thread()
				{
					public void run()
					   {
						PD.multiplication(100);
					   }
				};
				Thread t3=new Thread()
				{
					public void run()
					   {
						PD.multiplication(12);
					   }
				};
				Thread t4=new Thread()
				{
					public void run()
					   {
						PD.multiplication(5000);
					   }
				};
				t1.start();
				t2.start();
				t3.start();
				t4.start();
			}

		}
	


