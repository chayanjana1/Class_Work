package collectionEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, Employee> empMap=new HashMap<Integer, Employee>();
	    
		//creating employee objects
		Employee emp1=new Employee(101, "chayan");
		Employee emp2=new Employee(102, "soumen");
		Employee emp3=new Employee(103, "riya");
		Employee emp4=new Employee(104, "nil");
	 
				
		//storing employee infor in hashmap
		
		empMap.put(emp1.getEmpId(), emp1);
		empMap.put(emp2.getEmpId(), emp2);
		empMap.put(emp3.getEmpId(), emp3);
		empMap.put(emp4.getEmpId(), emp4);
	 
		
		//way 2 to reduce boiler plate code
		//empMap.put(1, new Employee(101, "chayan"));
		//empMap.put(2, new Employee(102, "soumen"));
		//empMap.put(3, new Employee(103, "riya"));
		//empMap.put(4, new Employee(104, "nil"));
		
		
		//display
		//Set<Map.Entry<Integer, Employee>> employees=empMap.entrySet();
		
		//for(Map.Entry em:employees )
			//	{
			//System.out.println("key: "+ em.getKey());
		//	Employee employe=(Employee) em.getValue();
		//	employe.display();
			//	}
		
		//Iterator
		Iterator itr=empMap.keySet().iterator();
	    
		while(itr.hasNext())
		{
			Employee emp=empMap.get(itr.next());
			emp.display();
		}
	
	}

}
