package writingfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) throws IOException {
		
		//Stream connectivity
		File f= new File("C:\\Users\\bs0452\\Documents\\WriteFile\\first.csv");
		FileWriter fw= new FileWriter(f);
		BufferedWriter writer = new BufferedWriter(fw);
		
	  
		//Writing in file
		writer.write("First class");
		writer.newLine();
		writer.write("Second Class");
		writer.newLine();
		
		
		//Closing the file
		
		writer.close();
		
		System.out.println("File successfully created !!!");
		

	}

}
