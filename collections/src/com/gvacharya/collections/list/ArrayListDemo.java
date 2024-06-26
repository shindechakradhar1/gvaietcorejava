package com.gvacharya.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> intArrayList =
				new ArrayList<>();
		intArrayList.add(1);
		intArrayList.add(2);
		intArrayList.add(3);
		intArrayList.add(4);
		intArrayList.add(5);
		System.out.println(intArrayList);
		
		List<String> stringList = new ArrayList<>();
		
		stringList.add("ABC");
		stringList.add("BBC");
		stringList.add("CBC");
		stringList.add("BAC");
		stringList.add("BCA");
		System.out.println(stringList.toString());
		
//		traditional For loop
		for(int i=0;i<stringList.size();i++) 
			System.out.println(stringList.get(i));
			
//		Advance For Loop
		for(int number:intArrayList)
			System.out.println(number);
		
		
//		forEach method;
//		stringList.forEach(e->System.out.println(e));
		stringList.forEach(System.out::println);
		
//		stream api
		stringList.stream().forEach(e->System.out.println(e.toLowerCase()));
		
		intArrayList.stream().map(Integer::toBinaryString)
						.forEach(System.out::println);
		
//		Iterator cursor
		Iterator<Integer> intIterator = intArrayList.iterator();
		while(intIterator.hasNext()) {
			int number=intIterator.next();
			System.out.println(Integer.toBinaryString(number));
		}
		
		int number1=intArrayList.get(4);
		Integer removeElement = 5;
		
		// but index and by object(element)
		intArrayList.remove(removeElement);
		System.out.println(intArrayList);
		
		intArrayList.set(2, 10);
		System.out.println(intArrayList);
		
		
		// by index and element, by element
		intArrayList.add(3, 12);
		System.out.println(intArrayList);
		
		intArrayList.addAll(Arrays.asList(10,20,30,40,50,10,60));
		
		System.out.println(intArrayList);
		
		int[] intArray = {1,2,3,4,5};
		printArray(intArray);
		
		
		int index=intArrayList.indexOf(10);
		
		int lastIndex = intArrayList.lastIndexOf(10);
		
		
		System.out.println(index);
		System.out.println(lastIndex);
		
		List<Integer> subList = intArrayList.subList(5, 11);
		
		System.out.println(subList);
		
		
	}
	
	public static void printArray(int... arr) {
		System.out.println(Arrays.toString(arr));
		
	}
}
