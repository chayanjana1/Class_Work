package basicprogram;

public class WrapperEx {

	public static void main(String[] args) {
		int a=30;
		
		//converting int(primitive) to Integer(Object) explicitly
	Integer i=Integer.valueOf(a);
	System.out.println(i);
	
	//autoboxing, now compiler will autometically conver int to Integer by writing I
	Integer i1=a;
	System.out.println(i1);
	
	
	short b=20;
	Short s=b;
	System.out.println(s);
	
	//converting Integer(object) to int(primitive)
	Integer in=new Integer(60);
	//converting Integer(object) to int(primitive) explicity
	int c=in.intValue();
	
	Double d=new Double(12.56);
	double dp=d.doubleValue();
	
	//System.out.println(c);
	System.out.println(dp);
	//unboxing,now compiler will automatically
	//convert int to Integer by writing in.intValue()
	int j=in;
	System.out.println(j);
	}

}
