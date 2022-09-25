package collectionEx;



class Personn extends Object{
	int id;
	String name;
	int salary;
	
	public Personn(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Personn [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	/*
	 @Override
	public boolean equals(Object obj)
	{
		//if both objects has same referance
		
		//if(this==obj)
			//return true;
		
		//if parameter is null or both are not same class
		//if(obj==null || this.getClass()!=obj.getClass())
		//return false;
		//compare using data members
		
		Personn p=(Personn)obj;
		return this.id==p.id
				&& this.name==p.name
				&& this.salary==p.salary;
				
	}
	*/
	
	public boolean equals(Object obj)
	{
		Personn p=(Personn)obj;
		if(this.getName().equalsIgnoreCase(p.getName()))
			return true;
		else
			return false;
	}
	@Override
	public int hashCode()
	{
		//return this.name.length()%10;
		return this.id%10;
	}

}



public class EqualsAndHashCodeImpl {

	public static void main(String[] args) {
		// String st1="welcome";
		// String st2="welcome";
		//System.out.println(str1==str2);
		// System.out.println(st1.equals(st2));
		
		Personn p1=new Personn(101,"nil",30000);
		Personn p2=new Personn(102,"nil",30000);
		Personn p3=p1;
		if(p1.hashCode()==p2.hashCode())
		{
			System.out.println(p1.hashCode());
		}
		else
		System.out.println("not equal");
	System.out.println(p1.hashCode());
	System.out.println(p2.hashCode());
	}

}
//Student s1=new Student(101,"nil",10);
//Student s2=new Student(102,"sou",20);
//s1.equals(s2);

