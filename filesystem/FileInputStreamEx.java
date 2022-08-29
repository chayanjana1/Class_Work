package filesystem;

import java.io.FileInputStream;

public class FileInputStreamEx {
 public static void main(String[] args) {
	 //read single
	 try
	 {
		 FileInputStream fis=new FileInputStream("E:\\file\\letter.txt");
		 int i;
		 //=fis.read();
		 System.out.println("number of remaining bytes"+fis.available()); //22
		// while((i=fis.read())!=-1) {
			// System.out.print((char)i);
			 
		// }
		 fis.read();
		 fis.read();
		 fis.read();
		 fis.read();
		 	System.out.println("number of remaining bytes"+fis.available()); //18
		 fis.close();
	 }catch (Exception e) {
 }
}
}