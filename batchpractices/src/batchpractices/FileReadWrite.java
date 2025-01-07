package batchpractices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		
		
//		try(BufferedWriter writer = new BufferedWriter(new FileWriter("new.txt"))){
//			writer.write("Sfalfk as;lf");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		Student student = new Student(1,"asdf");
//		
//		try(
//				ObjectOutputStream oos = 
//					new ObjectOutputStream(new FileOutputStream("student1.dat"));
//			){
//			
//			oos.writeObject(student);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		try(
//				ObjectInputStream ois = 
//					new ObjectInputStream(new FileInputStream("student1.dat"));
//			){
//			
//			Student student1= (Student) ois.readObject();
//			System.out.println(student1);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
//		File files = new File("C:\\Users\\Hp\\Desktop\\github");
//		for(File file:files.listFiles())
//			if(file.isDirectory())
//				for(File EachFile:file.listFiles())
//					System.out.println(EachFile.getAbsolutePath());
//			else
//				System.out.println(file.getAbsolutePath());
		FileInputStream fis = new FileInputStream("demo.txt");
		FileChannel channel=fis.getChannel();
		
		ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
		
		int bytesRead=channel.read(byteBuffer);
		while(bytesRead!=-1) {
			byteBuffer.flip();
			while(byteBuffer.hasRemaining())
				System.out.print((char)byteBuffer.get());
//				byte[] byteArray = new byte[byteBuffer.remaining()];
//				byteBuffer.get(byteArray);
			byteBuffer.clear();
			
			// Read the next chunk of data
            bytesRead = channel.read(byteBuffer);
		}

		channel.close();
		fis.close();
	}
}
