package filesystem;
import java.io.FileOutputStream;
public class FileOutputStreamEx {

	public static void main(String[] args) {
		try {
			FileOutputStream fis=new FileOutputStream("E:\\file\\letter.txt");
			//fis.write(65);
			String s="welcome to java stream";
			
			byte b[]=s.getBytes();
			fis.write(b);
			
			fis.close();
			System.out.println("success");
		}catch (Exception e) {

	}

}
}
