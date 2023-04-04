package IO;
//write byte to string using FOS---write with fill
import java.io.FileOutputStream;

public class WriteStringFOS {
	public static void main(String[] args) {
		try {
			//write Byte to String
			FileOutputStream f = new FileOutputStream("E:\\test.txt");
			f.write(82); // byte value (Ascii value)
			f.close();
			System.out.println("done");
		} catch (Exception e) {
			System.out.println(e);
		}}}
		
		
		
		
	


