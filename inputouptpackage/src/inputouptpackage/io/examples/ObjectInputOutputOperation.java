package inputouptpackage.io.examples;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import inputouptpackage.io.examples.entities.Student;

public class ObjectInputOutputOperation {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		try(Scanner scanner = new Scanner(System.in);){
			for(int i=0;i<students.length;i++) {
				students[i] = new Student();
				System.out.println("Id:");
				Integer id = scanner.nextInt();
				students[i].setId(id);
				scanner.nextLine().trim();
				System.out.println("Name:");
				String name= scanner.nextLine();
				students[i].setName(name);
				System.out.println("Age:");
				Integer age = scanner.nextInt();
				students[i].setAge(age);
			}
		}
		
//		Student student = new Student(1,"xyz",21);
//		Student student1 = new Student();
		try(
				FileOutputStream fileOut = new FileOutputStream("student.dat");
				ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
				FileInputStream fileIn = new FileInputStream("student.dat");
				ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			){
			
//			for(int i=0;i<students.length;i++)
//			objectOut.writeObject(students[i]);
//			student1 = (Student) objectIn.readObject();
			for(Student student:students)
				objectOut.writeObject(student);
			
			Student student;
			
			while((student = (Student) objectIn.readObject()) != null)
				System.out.println(student);
				
		} catch(EOFException e) {
			System.out.println("End of File:");
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println(student1);
		
		
	}
}
