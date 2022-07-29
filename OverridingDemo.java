package basicprogram;




class ParentBank1
{
	public void loanInterest()
	{
		System.out.println("%9 interest");
	}
}
class ChildSbi extends ParentBank1
{
	public void loanInterest()
	{
		System.out.println("5% interest");
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
		ChildSbi sbi=new ChildSbi();
		sbi.loanInterest();
	}

}


