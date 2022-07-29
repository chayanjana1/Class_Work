package Oopsdemo;
class Mi
{
	public void miphones()
	{
		System.out.println("There are two Type of MI phones");
	}
}
//Hirarchical Inheritence
class Redmi extends Mi
{
	public void redmi()
	{
		System.out.println("1.RedMi");
	}
	public void features()
	{
		System.out.println("Features of redmi: ");
	}
}
//Hirarchical Inheritance
class Poco extends Mi
{
	public void poco()
	{
		System.out.println("2.poco");
	}
}
class RedmiNote9 extends Redmi //multilevel Inheritance
{
	public void redminotes9() {
		System.out.println("Redmi Note9 Has Camera: 48MP Ram:6 GB,ROM:128 GB");
		
	}
}

public class Multilevel_hirarchical {

	public static void main(String[] args) {
		Redmi rm=new Redmi();
		rm.miphones();
		rm.redmi();
		Poco pc=new Poco();
		pc.poco();
		RedmiNote9 rmn=new RedmiNote9();
		rmn.features();
		rmn.redminotes9();
		
	}

}
