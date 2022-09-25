package collectionEx;

import java.util.ArrayList;
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
	    
	    if(names.contains("shawin pradhan"))
	    {
	    	System.out.println("data present");
	    }
	    else
	    	System.out.println("data not present");
	    	
	       names.add("sanjib");
	    	System.out.println(names);
	    	System.out.println("last index of nill :"+names.lastIndexOf("sanjib"));
	    	
	    	//insert elements at the front of the list
	    	names.push("roy");
	    	names.push("amit");
	    	
	    	System.out.println(names);
	    	
	    	//remove and return the first element of the list.
	    	System.out.println("Element popped: "+ names.pop());
	    	System.out.println(names);
	    	
	    	
	    	//poll()- retrieves and remove the head(first element) of the list.
	    	System.out.println("Element popped: "+ names.poll());
	    	System.out.println(names);
	    	
	    	//pollFirst()-retrieves and remove the first element of the list,return null if the list is empty.
	    	
	    	System.out.println("Element popped: "+names.pollFirst());
	    	System.out.println(names);
	    	
//pollLast()-retrieves and remove the last element of the list,return null if the list is empty.
	    	
	    	System.out.println("Element popped: "+names.pollLast());
	    	System.out.println(names);
	   
	    //convert linkedlist to arraylist
	    	
	    	List<String> list=new ArrayList<String>(names);
	    	System.out.println("converting linkedlist to arraylist");
	    	for(String str: list)
	    	{
	    		System.out.println(str);
	    	}
	    	
	    	//convert linkedlist to array
	    	String[] array=names.toArray(new String[names.size()]);
	    	
	    	System.out.println("converting linkedlist to array");
	    	for(int i=0;i<array.length;i++)
	    	{
	    		System.out.println(array[i]);
	    	}
	    
	    }
	    
		}


