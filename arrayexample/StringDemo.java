package arrayexample;

public class StringDemo {
public static void main(String[] args) {
	//String name="chayan";
	//String name2="chayan";
	//String str="welcome";
	//System.out.println(name==name2);
	//System.out.println(name==str);
	//name=name.concat("paul");
	//System.out.println(name);
	
	String name="good morning";
	//char ch=name.charAt(5);//return the char value at the 4th index
	//System.out.println(ch);
	//System.out.println(name.isBlank());
	//System.out.println(name.startsWith("morning"));
	//System.out.println(name.indexOf('o'));
	//System.out.println(name.indexOf('o',4));
	//System.out.println(name.hashCode());
	//String str1=new String("welcome");//2Objects and own reference variable will create
	//String str2=new String("welcome");
			//System.out.println(str1==str2);
		//StringBuilder builder=new StringBuilder("hello world");
		//System.out.println(builder);
		//builder.append("I am learing string");
		//System.out.println(builder);
		//builder.reverse();
		//System.out.println(builder);
		//builder.insert(25, "java");
		//System.out.println(builder);
		//builder.insert(1, "hi");
		//System.out.println(builder);
		
		StringBuffer buffer=new StringBuffer("hello world");
		buffer.append("java");
		System.out.println(buffer);
		System.out.println(buffer.capacity());
		char ch=buffer.charAt(4);
		System.out.println("character :"+ ch);
		System.out.println(buffer.indexOf("ello"));
		
		System.out.println(buffer.substring(6));
		System.out.println(buffer.substring(6,10));
		buffer.delete(6,10);
		System.out.println(buffer);
		buffer.deleteCharAt(5);
		System.out.println(buffer);
}
}
