package filesystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

	public static void main(String[] args) {
		FileInputStream fs=null;
		FileOutputStream os=null;
		
		try {
			fs=new FileInputStream("E:\\file\\letter.txt");
			os=new FileOutputStream("E:\\file\\dest.txt");
			
			int i;
			
			while((i=fs.read())!=-1)
			{
				os.write(i);
			}
			
			System.out.println("copied file successfully");
		}catch (Exception e) {
			
		}
finally {
	try {

	if(fs!=null)
		fs.close();
	if(os!=null)
		os.close();
}catch (Exception e) {
	}

}
}
}