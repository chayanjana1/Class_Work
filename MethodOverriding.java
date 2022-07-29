package Oopsdemo;
class ParentBank
{
	public void loanInterest()
	{
		System.out.println("9% interest");
	}
	}
class Childsbi extends ParentBank
{
	public void loanInterest()
	{
		System.out.println("7.75% interest");
	}
	}
class ChildAxis extends ParentBank
{
	public void loanInterest()
	{
		System.out.println("9% interest");
	}
	}
class ChildHdfc extends ParentBank
{
	public void loanInterest()
	{
		System.out.println("12% interest");
	}
	}
public class MethodOverriding {

	public static void main(String[] args) {
		//Childsbi sbi=new Childsbi();
		ParentBank pb;
		pb=new Childsbi();//upcasting
		//sbi.loanInterest();
		
		pb.loanInterest();
		pb=new ChildAxis();
		pb.loanInterest();
		pb=new ChildHdfc();
		pb.loanInterest();
		
		
	}

}



