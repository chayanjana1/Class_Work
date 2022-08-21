package exceptionhandling;

public class ThrowKeywordDemo1 {
	
	static void validateAge(int age) throws AgeValidationException
	{
		if(age<18)
			throw new AgeValidationException("age is not valid for vote");
		else
			System.out.println("age is valid");
	}

	public static void main(String[] args) {
		try {
			validateAge(12);
		}catch (AgeValidationException e) {
			System.out.println(e);
		}
		System.out.println("thank you for visit");

	}

}
