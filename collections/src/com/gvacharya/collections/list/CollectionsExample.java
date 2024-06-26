package com.gvacharya.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		
		List<Integer> intList1 = new ArrayList<>();
		
//		Initial Capacity
		List<Integer> intList = new ArrayList<>(5);
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
//		Collections.addAll(intList1, intList);
		Collections.reverse(intList);
		System.out.println(intList);
		Collections.shuffle(intList);
		System.out.println(intList);
		Collections.rotate(intList, 1);
		System.out.println(intList);
		
		int index=Collections.binarySearch(intList, 6);
		System.out.println(index);
		
		int max=Collections.max(intList);
		System.out.println(max);
		int min=Collections.min(intList);
		System.out.println(min);
		
		
	}
}
