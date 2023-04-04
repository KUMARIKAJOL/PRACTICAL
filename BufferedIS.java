package IO;

import java.io.*;

public class BufferedIS {
	public static void main(String[] args) {
		try {
			// source file
			FileInputStream f = new FileInputStream("E:\\test4.txt");
					BufferedInputStream b = new BufferedInputStream(f);
			int i;
			while ((i=b.read()) !=-1) {
				System.out.println((char)i);// convert it into charachter
			}
			f.close();
			b.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
