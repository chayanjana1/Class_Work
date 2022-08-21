package exceptionhandling;

//public class AgeValidationException extends RuntimeException {
public class AgeValidationException extends Exception {
public AgeValidationException(String message) {
	super(message);
}
}
