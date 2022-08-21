class bike
{
	final void speed ()
	{
		System.out.println("150kph");
	}

}
public class FinalKeywordDemo extends bike { // the FinalKeywordDemo cannot subclass.
	//void speed () //cannot override the final method from bike
	//{
	//	System.out.println("150kph");
	//}
	
	final int a = 100;  //final variable

	public static void main(String[] args) {
		FinalKeywordDemo demo = new FinalKeywordDemo();
		//demo.a = 400;  //the final field FinalKeywordDemo.a cannot be assigned
	System.out.println(demo.a);

	}

}
