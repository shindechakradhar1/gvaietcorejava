package inputouptpackage.io.examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadingFromKeyboard {
	public static void main(String[] args) {
		String line="";
		
		try(
				InputStreamReader inputStreamReader = new InputStreamReader(System.in);
				BufferedReader reader = new BufferedReader(inputStreamReader);
//				Writer writer = new FileWriter("demo.txt");
				FileWriter writer = new FileWriter("demo.txt");
				BufferedWriter fileWriter = new BufferedWriter(writer);
				
			){
			while(!line.equals("$") ) {
				line = reader.readLine();
				if(!line.equals("$")) {
					fileWriter.write(line);
					fileWriter.newLine(); // to create new line in file
				}
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		try(
				Reader reader1 = new FileReader("demo.txt");
				BufferedReader fileReader = new BufferedReader(reader1);
			){
			
			while ((line=fileReader.readLine())!=null) {
				System.out.println(line);
			}
			
		} catch (IOException  e) {
			e.printStackTrace();
		}
		
		
//		System.out.println(line);
		
		
	}
}
