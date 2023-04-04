package IO;

import java.io.*;
/*write information in the BufferedOutputStream object which is connected to the fileoutputStrem object */
public class BufferedOS {
	public static void main(String[] args) {
		try {
			//we connected one stream
			FileOutputStream f = new FileOutputStream("E:\\test3.txt");
			BufferedOutputStream b = new BufferedOutputStream(f);
			String s ="Welcome to Coding world";
			byte b1 [] =s.getBytes();
			f.write(b1);
			b.flush();
			f.close();
			System.out.println("done");}
		catch (Exception e) {
			System.out.println(e);
		
		}
	}

}
