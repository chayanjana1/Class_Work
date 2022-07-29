package Oopsdemo;
class user2{
	int id;
	String Name;
	String address;
	/*public void getdata(int id,String Name,String address)
	{
		this.id=id;
		this.Name=Name;
		this.address=address;
	}*/
	public user2(int id,String Name,String address) {
		this.id=id;
		this.Name=Name;
		this.address=address;
	}
	public void display()
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+Name);
		
		System.out.println("Address: "+address);
		
	}
	
}
class employe2 extends user2
{
	double salary;
	String designation;
	/*public void getdataEmp(int id,String Name,String address,double salary,String designation)
	{
		super.display(id,Name,address);
		this.salary=salary;
		this.designation=designation;
	}*/
	public employe2(int id,String Name,String address,double salary,String designation)
	{
		super(id,Name,address);
		this.salary=salary;
		this.designation=designation;
	}
	public void setDataEmp()
	{
		super.display();
		
			System.out.println("salary: "+salary);
			System.out.println("designation: "+designation);
			
	
			
		
		
	}

}
public class SingleInheritanceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employe2 emp=new employe2(101,"Chayan","Kolkata",50000, "Engineer");
		//emp.getdata();
		//emp.getdataEmp(101,"Chayan","Kolkata",50000, "Engineer");
		//emp.setData();
		emp.setDataEmp();
	}

}