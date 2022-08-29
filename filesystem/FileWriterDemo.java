package filesystem;

import java.io.FileReader;
import java.io.FileWriter;


public class FileWriterDemo {

	public static void main(String[] args) {
		//try
		//{
		//	FileWriter fw=new FileWriter("E:\\file\\letter.txt");
		//	fw.write("we are learning file writer");
			//fw.close();
		//}catch (Exception e) {
		//	System.out.println(e);
		//}
		//System.out.println("Success");
	
		//read from file
		try {
			FileReader fr=new FileReader("E:\\file\\letter.txt");
			int i;
			while((i=fr.read())!=-1)
{
	System.out.print((char)i);
	
}
			fr.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}	
			
		
	
