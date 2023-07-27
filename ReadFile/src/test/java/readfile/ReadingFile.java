package readfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) throws IOException {
		
		//File Connectivity
		File f = new File("C:\\Users\\bs0452\\Documents\\WriteFile\\TextDoc.txt");
		FileReader fr= new FileReader(f);
		BufferedReader reader= new BufferedReader(fr);
		
		
		//Read File
		
		String line =null;
		
		while((line=reader.readLine())!=null)
		{
			System.out.println(line);
		}
		
		//close file
		reader.close();
		
		System.out.println("File Read Successfully!!!");

	}

}
