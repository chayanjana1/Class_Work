package multithreding;

public class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is running");
	}
		
	
	public static void main(String[] args) {
		MyThread mt=new MyThread();
		Thread t1=new Thread(mt, "my Thread");
		t1.start();

	}	
		
	}


