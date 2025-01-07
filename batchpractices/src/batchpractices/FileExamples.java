package batchpractices;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileExamples {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		String fileName="demo.txt";
//		try(
////				FileInputStream fis = new FileInputStream(fileName);
//				InputStreamReader isr = new InputStreamReader(System.in);
////				FileOutputStream fos = new FileOutputStream(fileName);
//				BufferedReader br = new BufferedReader(isr);
//				Writer fw = new FileWriter(fileName); 
//				BufferedWriter bw = new BufferedWriter(fw);
//			){
//			bw.write(br.readLine());
//			
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		} 
//		
//		try(
//				Reader fr = new FileReader(fileName);
//				BufferedReader br = new BufferedReader(fr);
//			){
//			System.out.println(br.read());
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try(
//				FileOutputStream fOutput = new FileOutputStream("");
//				ObjectOutputStream objectOutput = new ObjectOutputStream(fOutput);
//				FileInputStream fInput = new FileInputStream(fileName);
//				ObjectInputStream objectInput = new ObjectInputStream(fInput);
//			){
//			
////			for(int i=0;i<students.length;i++)
////				objectOutput.writeObject(students[i]);
//			fOutput.write();
//			for(Student student:students)
//				objectOutput.writeObject(student);
//			Student student ; 
//			while((student = (Student) objectInput.readObject()) != null) 
//				System.out.println(student);
//			
//		}catch(EOFException e) {
//			System.out.println("End of File..");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
//		Writer fw = new FileWriter("demo1.dat");
//		BufferedWriter bw = new BufferedWriter(fw);
//	
//		try {
//			String data="";
//			while(!data.equals("$") ) {
//				data=br.readLine();
//				if(!data.equals("$")) {
//					bw.write(data);
//					bw.newLine();
//				}
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			bw.close();
//			isr.close();
//			fw.close();
//			br.close();
//		}
//		
//		Reader reader = new FileReader("demo1.dat");
//		BufferedReader br1 = new BufferedReader(reader);
//		String str="";
//		StringBuilder sb = new StringBuilder();
//		while(str!=null) {
//			str=br1.readLine();
//			if(str!=null)
//			System.out.println(sb.append(str));
//		}
//		reader.close();br1.close();
//		
//		str=sb.toString();
//		StringTokenizer st = new StringTokenizer(str, "[,. ]");
////		System.out.println(str);
//		while(st.hasMoreTokens())
//			System.out.println(st.nextToken());
//		
//		FileOutputStream fos = new FileOutputStream("student.dat");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		
//		Student student = new Student(1,"XYZ");
//		
//		oos.writeObject(student);
//		
//		fos.close();
//		oos.close();
//		
//		FileInputStream fis = new FileInputStream("student.dat");
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		
//		Student student1=(Student)ois.readObject();
//		System.out.println(student1);
//		
//		fis.close();
//		ois.close();
	
	}
}
