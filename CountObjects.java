package Oopsdemo;

public class CountObjects {
static int count=0;
public CountObjects()
{
	count++;
	System.out.println(count);
}
	public static void main(String[] args) {
		CountObjects obj1=new CountObjects();
		CountObjects obj2=new CountObjects();
		CountObjects obj3=new CountObjects();
		CountObjects obj4=new CountObjects();
	}

}
