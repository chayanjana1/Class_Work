package multithreding;

class Account
{
	int accBalance=10000;
	
	synchronized void withdraw(int amount)
	{
		System.out.print("start withdrawing");
		if(this.accBalance<amount)
		{
			System.out.println("less balance: waiting for deposite");
			try {
				wait();
			}catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		
		this.accBalance=accBalance-amount;
		System.out.println(amount+ "is withdraw has done successfully");
	}
	synchronized void deposite(int amount)
	{
		System.out.println("starting deposit");
		this.accBalance=accBalance+amount;
		System.out.println(amount +"is deposite completed");
		notify();
		
	}
	//display balance
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		Account acc=new Account();//only one lock
		new Thread() {
			public void run()
			{
				acc.withdraw(15000);
			}
		}.start();
		
		new Thread()
		{
			public void run() {
				acc.deposite(20000);
			}
		}.start();

	}

}
