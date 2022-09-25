package java8features;
@FunctionalInterface
interface sayable
{
	//String msg(String message);
	int addition(int a,int b);
	//void msg();
}
public class LamdaDemo {
	
	public static void main(String[] args) {
		//without lambda expression
//		sayable s=new sayable() {
//
//			@Override
//			public void msg() {
//				System.out.println("hello java");
//			}
//			
//		};
//		
//		s.msg();
		
		//with lamda expression
		//sayable s= () -> System.out.println("hello java"); 
//		sayable s= () ->{
//		return "we are learing lambda";
//		};
//		System.out.println(s.msg());
//		sayable s=(message)->
//		{
//			return "hello"+message;
//		};
//		System.out.println(s.msg(" how are you?"));
//		
//		//you can omit functional parentheses
//		sayable s1=(message)->
//		{
//			return "hi, "+message;
//		};
//		System.out.println(s.msg(" what are you doing?"));
//		
		sayable s1=(a,b)->(a+b);
	   System.out.println("Adition: "+s1.addition(10, 20));
	   
	   sayable s2=(int a,int b)->(a+b);
	   System.out.println("Adition: "+s2.addition(50, 50));
	   //with return type
	   
	   sayable s3=(a,b)->
	   {  int c=(a+b);
		   //return(a+b);
	   return c;
	   };
	   System.out.println("Adition: "+s3.addition(500, 500));
	}
}
