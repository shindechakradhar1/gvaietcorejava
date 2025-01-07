package batchpractices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.Vector;

public class CollectionDemo {

	public static void main(String[] args) {
		GenericClass<String> strObject = new GenericClass<>("ABC");
		String str=strObject.getT();
		System.out.println(str);
	
		GenericClass<Integer> intObject = new GenericClass<>(10);
		int no=intObject.getT();
		System.out.println(no);
		
		GenericClass<Student> studentObject = new GenericClass<>(new Student(1,"ABC"));
		Student student=studentObject.getT();
		System.out.println(student);
		
		List list = new Vector<>();
		list.add(student);
		list.add(10);
		list.add("ABC");
		System.out.println(list.toString());
		System.out.println(list.size());
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1,"BBC"));
		studentList.add(new Student(5,"ABC"));
		studentList.add(new Student(3,"DBC"));
		studentList.add(new Student(2,"CBC"));
		
		Collections.sort(studentList);
		
		System.out.println(studentList);
		
		Enumeration  enumeration = Collections.enumeration(studentList);
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
		ListIterator<Student> iterator = studentList.listIterator();
		while(iterator.hasPrevious()) {
			iterator.previous();
			iterator.set(student);
		}
		
		List<Student> subList= studentList.subList(0, 3);
		System.out.println(studentList);
		subList.remove(1);
		System.out.println(studentList);
		
		
		
	}
}
