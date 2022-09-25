package collectionEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class UserArrayList {

	public static void main(String[] args) {
		ArrayList<User> userlist=new ArrayList<User>();
		
		//User u1=new User(101, "chayan", "durgapur");
		//User u2=new User(102, "dam", "kolkata");
		//User u3=new User(103, "ram", "howrah");
		
		//userlist.add(u1);
		//userlist.add(u2);
		//userlist.add(u3);
		
		//Annonymous object
		userlist.add(new User(101, "chayan", "durgapur"));
		userlist.add(new User(102, "soma", "kolkata"));
		userlist.add(new User(103, "ram", "howrah"));
		
		//print the elements
		for(User u:userlist)
		{
			System.out.println("Id: "+u.getId());
			System.out.println("Id: "+u.getName());
			System.out.println("Id: "+u.getAddress());
			System.out.println("==========================");
		}
		
		Collections.sort(userlist);
		
		System.out.println("After sorting the values are: ");
		
		System.out.println(userlist);
		for(User u:userlist)
		{
			System.out.println("Id: "+u.getId());
			System.out.println("Id: "+u.getName());
			System.out.println("Id: "+u.getAddress());
			System.out.println("==========================");
		}
	}

}
