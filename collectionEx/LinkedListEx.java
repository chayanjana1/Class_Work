package collectionEx;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
	//polymorphic object
		LinkedList<String> names=new LinkedList<String>();
		
		//LinkedList<Integer> llist=new LinkedList<Integer>();
	
		names.add("chayan");
		names.add("nil");
		names.add("soumen");
		names.add("banti");
		
		System.out.println(names);
		
		for(String s: names)
		{
			System.out.println(s);
		}
		System.out.println("using while loop");
		int count=0;
		while(count<names.size())
		{
			System.out.println(names.get(count));
			count++;
		}
		System.out.println("using iterator");
		Iterator itr=names.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    //adding operation
	    names.addFirst("first");
	    names.addLast("last");
	    names.add(2, "chandan");
	    System.out.println(names);
	    
	    //remove operation
	    names.removeFirst();
	    names.removeLast();
	    names.remove(1);
	    names.remove("nil");
	    System.out.println(names);
	    
	    //set and get the data
	    names.set(1,  "shawin pradhan");
	    String name=names.get(1);
	    System.out.println(names);
	    System.out.println(names);
	   // names.clear();
	  //  System.out.println(names);
	    
	    //list Iterator
	    ListIterator listit=names.listIterator();
	    System.out.println("forward direction");
	    while(listit.hasNext())
	    {
	    	System.out.println(listit.next());
	    }
	    System.out.println("backward direction");
	    
	    while(listit.hasPrevious())
	    {
	    	System.out.println(listit.previous());
	    }
	    //iterate a linkedlist in reverse order
	    //Returns an iterator over the elements in the deque in
	    //reversesequential order. The elements will be returned in 
	    //order fromlast (tail) to first (head).
	    Iterator it=names.descendingIterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	    
		}

}
