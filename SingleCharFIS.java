package IO;
// we can read single charecter - using FileinputStream
import java.io.FileInputStream;

public class SingleCharFIS {
	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("E:\\test1.txt");
			// read single character(Hello)
			int i=f.read();{ // H = 72 (byte value)
				System.out.println((char)i);// covert it into chracthre
			}
			f.close();
		}catch (Exception e) {
			System.out.println(e);
			}
		}
	}


