package java8features;

import java.util.ArrayList;

public class LamdaDemoEx {

	public static void main(String[] args) {
		//ArrayList<String> list=new ArrayList<String>();
//		list.add("chayan");
//		list.add("nil");
//		list.add("bis");
//		list.add("sha");
//		list.add("abhi");
//		
//		//for(String s:list) {System.out.println(s);}
//		
//		
//		list.forEach(
//				(s)->System.out.println(s)
//				);
//		
		Runnable r=new Runnable() {

			@Override
			public void run() {
				System.out.println("thread is running");
				
			}
			
		};
		Thread t1=new Thread(r);
		t1.start();
		
		//with lambda
		Runnable r2=()->
		{
			System.out.println("thread2 is running");
		};
		Thread t2=new Thread(r2);
		t2.start();
	}

}
