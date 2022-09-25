package collectionEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraylistEx {

	public static void main(String[] args) {
		//object using polymorphism
		List<Integer> list=new ArrayList<Integer>();
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("nikhil");
		String s1=list2.get(0);

//	list.add(34);
//	list.add(56);
//	list.add(34);
//	list.add(45);
//	//list.add(null);
//	System.out.println(list);
//	System.out.println(list.size());
//	list.add(77);
//	list.add(99);
//	System.out.println("After adding: "+list);
//	System.out.println("size after adding: "+list.size());
	
	//non generic-can store any type of objects in the collection.
	ArrayList alist=new ArrayList();  //Object type type
	alist.add(67);
	alist.add(12.34);
	alist.add("string");
	String s=(String)alist.get(1);
	
	
	
	
	
	// use for loop
	//System.out.println("arrayList using for loop");//way 2
	//for(int i=0;i<list.size();i++)
	//{
		//System.out.println(list.get(i));
	//}
	
	//using for each loop iterate arraylist
	//System.out.println("using for each loop iterate arraylist"); //way 3
	
	//for(Integer in: list)
	//{
		//System.out.println(in);
	//}
	
	//using while loop iterate arraylist
	//System.out.println("while loop iterate arraylist");
	//int count=0;
	//while(count<list.size()) //while(list.size()>count
	//{
		//System.out.println(list.get(count));
		//count++;
	    //}
	
	//iterate using iterator
	System.out.println("iterate using iterator");
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	//sort arraylist in ascending order
	Collections.sort(list);
	System.out.println("after sorting the values are:");
	System.out.println(list);
	
	//sort arraylist in descending order
	Collections.sort(list, Collections.reverseOrder());
	System.out.println("after sorting in descending order the values are:");
	System.out.println(list);
	
	list.add(2, 100);
	System.out.println(list);
	
	list.remove(2);
	System.out.println(list);
	
	//copy all arraylist to another
	ArrayList<Integer> des=new  ArrayList<Integer>();
	des.addAll(list);
	System.out.println("copied list : "+ des);
	 
	//sorting the sublist
	List<Integer> sublist1=list.subList(2,  4);
	System.out.println(sublist1);
	
	//another way
	ArrayList<Integer>sublist2=new ArrayList<Integer>(list.subList(1, 3));
	System.out.println(sublist2);
	//search element
	System.out.println(list.contains(34));
	list.clear();
	System.out.println(list);
	
	}
	
}

/*
 * advantages of generic:
 * 1.type sefety- you can hold only a single type of objects in generics. it doesn't
 * allow to store other objects.
 * 
 * 2.type casting is not required: there is no need to typecast the object.
 * 
 * 3.compile-time checking: it is checking at compile time so problem will not occure at runtime.
 */


