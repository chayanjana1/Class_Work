package collectionEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		//HashSet<String> hset=new HashSet<String>();
		
		//System.out.println(hset.hashCode());
		
	//	hset.add("apple");
	//	hset.add("orange");
	//	hset.add("kiwi");
		//hset.add("banana");
		//hset.add("orange");
		//hset.add(null);
		
		//System.out.println(hset);
		//hset.add("water melon");
		//Iterator it=hset.iterator();
		
		//hset.add("water melon");
		
		//while(it.hasNext())
		//{
		//	System.out.println(it.next());
		//}
		//creating an array 
	//	System.out.println("creating an array");
	//	String array[]=new String[hset.size()];
		//hset.toArray(array);
		//for(String s:array)
		//{
			//System.out.println(s);
		//}
		//creating an array List
		//ArrayList<String> alist=new ArrayList<String>(hset);
		//TreeSet<String> tset=new TreeSet<String>(hset);
//		tset.add(56);
//		tset.add(6);
//		tset.add(16);
//		tset.add(66);
	//	System.out.println(tset);
	
	LinkedHashSet<Integer> lset=new LinkedHashSet<Integer>();
	lset.add(23);
	lset.add(33);
	lset.add(43);
	lset.add(53);
	
	System.out.println(lset);
	
	}
		
}
