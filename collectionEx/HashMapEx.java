package collectionEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapEx {

	public static void main(String[] args) {
		//HashMap<Integer, String> hmap=new HashMap<Integer, String>();
	   // hmap.put(101, "chayan"); //101 chayan
	  //  hmap.put(105, "chandan");
	  //  hmap.put(102, "sanjib");
	  //  hmap.put(107, "pallab");
	    
	  //  System.out.println(hmap);
	    
	   // Set set=hmap.entrySet();
	   // Iterator itr=set.iterator(); 
	  //  Iterator itr=hmap.entrySet().iterator();
	    
	    //Map.Entry interface provides certain methods to access the entry in the
	    //Map.by gaining access to the entry of the Map we can easily manipulate
	    //them.Map.Entry is generic and defined in java.util package
	    
	    
	//    while(itr.hasNext())
	//    {
	  //  	Map.Entry mentry=(Map.Entry)itr.next();
	  //  	System.out.println("key: "+mentry.getKey());
	  //  	System.out.println("value: "+mentry.getValue());
	  //  }
	    
	    //get values based on key
	 //   String val=hmap.get(102);
	  //  System.out.println("value mapped with key: "+val);
	
	    //remove value based on key
	  //  hmap.remove(103);
	    
	   // System.out.println(hmap);
	   // System.out.println("after removing key 103");
	    
	    //for(Map.Entry me:hmap.entrySet());
	    //{
	    	
			//System.out.println("key: "+me.getKey());
	    	//System.out.println("value: "+me.getValue());	
	    //}
	    //sorting HashMap based on key
	    
	 // Map<Integer, String> tmap=new TreeMap<Integer, String>(hmap);
	
	//  System.out.println("after sorted the elements are: ");
	//  for(Map.Entry me:tmap.entrySet())
	//  {
	//	  System.out.println("key: "+me.getKey());
	   // 	System.out.println("value: "+me.getValue());	
	 // }
	//System.out.println("size of hashmap: "+ hmap.size());
	//clear() is Empty()
	
	//check value existance
	//System.out.println("Key present: "+hmap.containsKey(110));
	
	//check value existance
	//System.out.println("Key present: "+hmap.containsValue("shaqib"));
	
	LinkedHashMap<String, String> lmap=new LinkedHashMap<String, String>();
	lmap.put("f1", "apple");
	lmap.put("f2", "orange");
	lmap.put("f3", "banana");
	
	System.out.println(lmap);
	
	}

}
