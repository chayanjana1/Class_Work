package arrayexample;

public class CheckPalindrome {

	public static void main(String[] args) {
		String str="madam",rev="";
		int i, l=str.length();
		for(i=l-1;i>=0;i--)
		{
			rev=rev +str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("the string is palindrome");
		}
		else
			System.out.println("the string is not palindrome");
	}

}
