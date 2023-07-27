package javaprogram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JavaQuestion28 {

	public static void main(String[] args) throws IOException {
		
		readFile();
	}
	
	public static void readFile() throws IOException
	{
		try {
			FileInputStream fis= new FileInputStream("C:\\Users\\bs0452\\Desktop\\Text.txt");
			int i=fis.read();
			System.out.println((char)i);
			
			fis.close();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		
	}

}
