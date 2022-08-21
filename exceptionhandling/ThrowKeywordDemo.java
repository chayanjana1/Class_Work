package exceptionhandling;
import java.io.IOException;
public class ThrowKeywordDemo {
	
	
	static void validateAge(int age)
	{
		try {
		if(age<18)
			throw new AgeValidationException("age is not valid for vote");
		else
			System.out.println("age is valid");
		//}catch (Exception e) {
		}catch (AgeValidationException e) {
			System.out.println(e.getMessage());
		}
		//}
	}
	
	
	public static void main(String[] args) {
		//try {
		validateAge(12);
		//}catch (AgeValidationException e) {
	   // System.out.println(e.getMessage());
		//}
		System.out.println("thank you for visit");
	}
	}

