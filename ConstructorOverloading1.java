package Oopsdemo;

class Employee2
{
	int id;
	String name,city,country,state,designation;
	long phno,salary;
	//constructor chaining
	public Employee2(int id,String name,String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public Employee2(int id,String name,String city,String country,String state)
	{
		this(id, name, city);
		this.country=country;
		this.state=state;
		
	}
	public Employee2(int id,String name,String city,String country,String state,
			long phno,long salary,String designation)
	{
		this(id,name,city,country,state);
		this.phno=phno;
		this.salary=salary;
		this.designation=designation;
	}
	/*@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", city=" + city + ", country=" + country + ", state=" + state
				+ ", designation=" + designation + ", phno=" + phno + ", salary=" + salary + "]";
	}*/
	/*@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee2 [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", city=");
		builder.append(city);
		builder.append(", country=");
		builder.append(country);
		builder.append(", state=");
		builder.append(state);
		builder.append(", designation=");
		builder.append(designation);
		builder.append(", phno=");
		builder.append(phno);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}*/
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public String getState() {
		return state;
	}
	public String getDesignation() {
		return designation;
	}
	public long getPhno() {
		return phno;
	}
	public long getSalary() {
		return salary;
	}
	
	
	
	
	
	
	
	
}

public class ConstructorOverloading1 {

	public static void main(String[] args) {
Employee2 emp1=new Employee2(101,"Chayan","kolkata");
System.out.println(emp1.getId()+" "+emp1.getName()+" "+emp1.getCity());
Employee2 emp2=new Employee2(101,"Chayan","kolkata","India","wb",7003872448l,20000l,"manager");
System.out.println(emp2.getId()+" "+emp2.getName()+" "+emp2.getCity()+" "+emp2.getCountry()+" "+emp2.getState()+" "+emp2.getPhno()+" "+emp2.getSalary()+" "+emp2.getDesignation());


	}
	

}
		
