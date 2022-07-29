package Oopsdemo;
class Employe
{
	int id;
	String name,city,country,state,designation;
	long phno,salary;
	//constructor chainning
	public Employe(int id,String name,String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public Employe(int id,String name,String city,String country,String state)
	{
		this(id,name,city);
		this.country=country;
		this.state=state;
	}
	
	public Employe(int id,String name,String city,String country,String state,long phno,long salary,String designation)
	{
		this(id,name,city,country,state);
		this.phno=phno;
		this.salary=salary;
		this.designation=designation;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", city=" + city + ", country=" + country + ", state=" + state
				+ ", designation=" + designation + ", phno=" + phno + ", salary=" + salary + ", getClass()="
	+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	
		
		
		
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @return the phno
	 */
	public long getPhno() {
		return phno;
	}
	/**
	 * @return the salary
	 */
	public long getSalary() {
		return salary;
	}
	
	}	

public class ConstructorOverloading {

	public static void main(String[] args) {
		Employe em1=new Employe(101, "ram", "durgapur");
		System.out.println(em1);
Employe em2=new Employe(102, "abc", "kolkata","india","wb",5422842l,20000,"developer");
	System.out.println(em2);

	
	}

}
