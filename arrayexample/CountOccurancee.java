/*
 * Wap to count no of occurance of given character.
 */

package arrayexample;

public class CountOccurancee {
	public static int countOccurance(String str)
	  {
		int i,count=0; char ch;
		for(i=0;i<str.length();i++)
		  {
			ch=str.charAt(i);
			if(ch=='o'||ch=='O')
			  {
				count++;
			  }
		  }
		return count;
	  }

	public static void main(String[] args) {
		String str="good morning";
		// int count=countVowel(str);
		
		System.out.println("no. of char=o Occurance: "+countOccurance(str));
		

	}

}