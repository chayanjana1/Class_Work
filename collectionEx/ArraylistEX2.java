package collectionEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistEX2 {

	public static void main(String[] args) {
		ArrayList<String> list2=new ArrayList<String>();
	list2.add("apple");
	list2.add("orange");
	list2.add("banana");
	list2.add("kiwi");
	Collections.sort(list2);
	System.out.println("after sorting: "+ list2);
	//list2.remove(1);
	//list2.remove("kiwi");
	
	list2.set(2, "banana fruit");
	
	System.out.println("after updating 2nd position value: "+list2);
	System.out.println(list2.contains("apple"));
	
	//converting arraylist to array
	
	String arr[]=new String[list2.size()];
	for(int i=0;i<list2.size();i++)
	{
		arr[i]=list2.get(i);
	}
	
	System.out.println("arraylist: "+list2);
	System.out.println("Array elements:");
	for(String s: arr)
	{
		System.out.println(s);
	}
	//convert array to arraylist
	String names[]= {"chayan","pallab","nilanjan","amit"};
	ArrayList<String> alist=new ArrayList<String>(Arrays.asList(names));
		alist.add("shaqib");
		alist.add("islam");
		
		System.out.println("after converting array to arrayList");
		for(String str: alist)
		{
			System.out.println(str);
		}
			
	}
	
}
