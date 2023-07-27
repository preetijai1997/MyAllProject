package readandwrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadingandWriting {

	public static void main(String[] args) throws IOException {
		
		
		File f= new File("C:\\Users\\bs0452\\Documents\\WriteFile\\readandwritefile.txt");
		f.createNewFile();
		
		//Write File
		FileWriter fw= new FileWriter("C:\\Users\\bs0452\\Documents\\WriteFile\\readandwritefile.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		
		bw.write("Preeti");
		bw.newLine();
		bw.write("Patel");

		bw.close();
		
		System.out.println("Write Successfully");
		
		//Read File
		FileReader fr= new FileReader("C:\\Users\\bs0452\\Documents\\WriteFile\\readandwritefile.txt");
		BufferedReader br= new BufferedReader(fr);
		
		String line=null;
		
		while((line=br.readLine())!=null)
			{
			   System.out.println("Read value" + line);
			}
		
		
		System.out.println("Read Successfully!!!");
		
		br.close();
		
		f.delete();

	}

}
