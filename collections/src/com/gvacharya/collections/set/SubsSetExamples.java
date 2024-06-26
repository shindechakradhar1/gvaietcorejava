package com.gvacharya.collections.set;

import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubsSetExamples {

	public static void main(String[] args) {
//		//Intial capasity 16 HashTable
//		Set<Integer> intSet = new HashSet<>();
//		provide Intial Capasity 
//		Set<Integer> intSet = new HashSet<>(32);
//		provide Intial capasity and Load Factor
		SortedSet<Integer> intSet = new TreeSet<>();
		intSet.add(4);
		intSet.add(3);
		intSet.add(2);
		intSet.add(1);
		intSet.add(8);
		intSet.add(7);
		intSet.add(6);
		
		
		Set<Integer> subSet =  intSet.subSet(3, 8);
		System.out.println(intSet);
		subSet.remove(4);
		System.out.println(intSet);
		subSet.add(5);
		System.out.println(intSet);
		
		
		Set<Integer> tailSet = intSet.tailSet(5);
		
		Set<Integer> headSet = intSet.headSet(3);
//		unModifiableSet(Collections (C))
		Set<Integer> unModiFiableSet = Collections.unmodifiableSet(intSet);
//		unModiFiableSet.add(10);
//		unModiFiableSet.remove(10);
		
//		Iterator<Integer> intIterator = unModiFiableSet.iterator();
//		while(intIterator.hasNext()) {
//			intIterator.next();
//			intIterator.remove();
//		}
		
		System.out.println(unModiFiableSet);
		
		Set<Integer> checkedSet = Collections.checkedSet(intSet, Integer.class);
		checkedSet.add(10);
		checkedSet.add(10);
		
		Set<Integer> syncSet = Collections.synchronizedSet(intSet);	
		System.out.println(syncSet);
 	}
}
