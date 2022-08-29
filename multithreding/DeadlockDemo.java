package multithreding;

public class DeadlockDemo {

	public static void main(String[] args) {
	final String resource1="paper";
	final String resource2="pen";
	
	//Thread 1:Chayan lock resource1:paper
	
	Thread chayan=new Thread()
			{
		
		public void run()
		{
			synchronized (resource1) {
				System.out.println("Chayan locked Resource1:paper");
				
				try {
					Thread.sleep(100);
				}catch (Exception e) {
					System.out.println(e);
					
				}
				//Chayan  is trying to lock resource 2:pen
				
				synchronized (resource2) {
					System.out.println("wanted to locked Resource 2:pen ");
				}
				
			}
		}
			};
			//Thread 2:Chandan lock resourse2:pen
			Thread chandan=new Thread()
					{
				
				public void run()
				{
					synchronized (resource2) {
						System.out.println("chandan locked Resource 2: pen");
						
						try {
							
							Thread.sleep(100);
						}catch (Exception e) {
							System.out.println(e);
						}
						//Thread 1:chandan is trying to lock resource 1:paper
						
						synchronized (resource1) {
							System.out.println("wanted to locked Resource 1: paper");
						}
					}
				}
					};
					
					chayan.start();
					chandan.start();
	}

}
