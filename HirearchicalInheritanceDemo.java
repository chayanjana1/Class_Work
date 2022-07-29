package Oopsdemo;
 class Bank
 {
	 public void loanInterest()
	 {
		 System.out.println("9% interest rate");
	 }
 }
 class Sbi extends Bank
 {
	public void persionScheme()
	{
		System.out.println("minimum 5 years scheme you need to take");
	}
 }
 
 class Axis extends Bank
 {
	 public void fixeddeposite()
	 {
		 System.out.println("tenor year is 5");
	 }
 }
 class Hdfc extends Bank
 {
	 
 }
public class HirearchicalInheritanceDemo {
public static void main(String[] args) {
	Sbi sbi=new Sbi();
	sbi.loanInterest();
	sbi.persionScheme();
	
	Axis axis=new Axis();
	axis.loanInterest();
	axis.fixeddeposite();
}
}
