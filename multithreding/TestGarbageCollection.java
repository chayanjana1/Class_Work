package multithreding;

public class TestGarbageCollection {
	public void finalize()
	{
		System.out.println("all objects are collected for garbage collection");
	}
	
	public static void main(String[] args) {
		
		TestGarbageCollection t1=new TestGarbageCollection();
		TestGarbageCollection t2=new TestGarbageCollection();
		t1=null;
		t2=null;
		System.gc();
		System.out.println("all are unreferenced");
}
}