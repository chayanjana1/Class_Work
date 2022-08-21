package abstractiondemo;
// we can't create instance but we acn create reference variable
abstract class Bank
{
	//abstract method-method has no body
	abstract public void getLoanInterest();
	
	//concrete method has body
	public void display() {
		System.out.println("this is a bank class");
	}
}
//implementation class

class SBI extends Bank
{

	@Override
	public void getLoanInterest() {
		System.out.println("we are providing 6.75% interest");
		
	}
	
}
class AXIS extends Bank{

	@Override
	public void getLoanInterest() {
		System.out.println("we are providing 10% interest");
		
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		SBI sbi=new SBI();
		sbi.display();
		sbi.getLoanInterest();
		
		AXIS axis=new AXIS();
		axis.display();
		axis.getLoanInterest();
	}

}


