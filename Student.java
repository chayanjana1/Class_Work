package Oopsdemo;
class StudentClass {
	int id;
	String name,address;
	long phone;
	public void setData(int i,String n, String add, long ph) {
		id =i;
		name=n;
		address=add;
		phone=ph;
	}
	public void getData() {
		System.out.println("Id: "+id+" Name: "+name+
				" Address: "+address+" Phone No: "+phone);
	}
}
public class Student {

	public static void main(String[] args) {
		//class/object instantiation
				StudentClass st = new StudentClass();
				st.setData(101, "Chayan Jana", "Kolkata",624895);
				st.getData();
				System.out.println(st);

	}

}
