package multithreding;
class Account2
{
	int accBalance=10000;
	 synchronized void withdraw(int amount) {
		// TODO Auto-generated method stub
		 
System.out.println("Start withdrawing:");
if(this.accBalance<amount)
{
	System.out.println("Less balance:waiting for deposite");
	try {
		wait();
	}catch(InterruptedException e)
	{
		System.out.println(e);
	}
	}
this.accBalance=accBalance-amount;
System.out.println(amount+" is withdrawn successfully");
//System.out.println("your acc balance is: "+this.accBalance);

	}
synchronized void deposite(int amount)
{
	System.out.println("starting deposite");
	this.accBalance=accBalance+amount;
	System.out.println(amount+" is deposite complete");
	//notify();
	notifyAll();
	}
synchronized void display() throws Exception
{
	
	
	try {
		wait();
	}catch(InterruptedException e)
	{
		System.out.println(e);
	}
	System.out.print("Fecthing your account balance");
	for(int c=0;c<=5;c++)
	{
		Thread.sleep(1000);
		
		System.out.print(".");
	}
	
	System.out.println("\nYour present account balance is: "+this.accBalance);
	}
	}

public class InterThreadCommunication2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account2 acc=new Account2();
		new Thread()
		{
			public void run()
			{
				acc.withdraw(15000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				try {
					acc.display();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				acc.deposite(20000);
			}
		}.start();
		
	}

}

