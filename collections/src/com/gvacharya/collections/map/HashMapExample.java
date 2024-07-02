package com.gvacharya.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class HashMapExample {
	public static void main(String[] args) {

		Map<Integer, String> pincodeMap = new HashMap<>();
		
		pincodeMap.put(421306,"Kalyan");
		pincodeMap.put(400612,"Thane");
		pincodeMap.put(400074,"Mumbai");
		pincodeMap.put(421301,"Kalyan West");
		pincodeMap.put(400089,"Chembur");
		pincodeMap.put(null,"Bharat");
		pincodeMap.put(123,"Bharat");
		pincodeMap.put(321,"Bharat");
		pincodeMap
			.forEach((k,v)->System.out.println("Key: " + k + " Value: " + v));
		pincodeMap.put(400089,"Chembur West");
//		using advanced for loop
//		to iterate through key set
		for(Integer pincode:pincodeMap.keySet())
			System.out.println(pincode);
//		to iterate through values
		for(String cities:pincodeMap.values())
			System.out.println(cities);
//		to iterate through entries 
		for(Map.Entry<Integer, String> entry:pincodeMap.entrySet())
			System.out.println(entry);
		
//		using for each
//		keySet
		pincodeMap.keySet().forEach(System.out::println);
//		values
		pincodeMap.values().forEach(System.out::println);
//		entrySet
		pincodeMap.entrySet().forEach(System.out::println);
		
//		using stream()
//		keySet
		try(Stream<Integer> pinStream = pincodeMap.keySet().stream()){
			pinStream.forEach(System.out::println);
		}
//		values
		try(Stream<String> cityStream = pincodeMap.values().stream()){
			cityStream.forEach(System.out::println);
		}
//		entrySet
		try(Stream<Map.Entry<Integer, String>> entryStream = pincodeMap.entrySet().stream()){
			entryStream.forEach(System.out::println);
		}
		
//		using Iterator
//		keySet
		Iterator<Integer> pinIterator 
		= pincodeMap.keySet().iterator();
		while(pinIterator.hasNext())
			System.out.println(pinIterator.next());
//		values
		Iterator<String> cityIterator 
		= pincodeMap.values().iterator();
		while(cityIterator.hasNext())
			System.out.println(cityIterator.next());
//		entrySet
		Iterator<Map.Entry<Integer, String>> entryIterator 
		= pincodeMap.entrySet().iterator();
		while(entryIterator.hasNext())
			System.out.println(entryIterator.next());
		
		
		pincodeMap.compute(421306, (k,v)->v.toUpperCase());
		
		pincodeMap.computeIfAbsent(4312, Integer::toBinaryString);
		
		System.out.println(pincodeMap.get(4312));
		
		System.out.println(pincodeMap.get(421306));
		
		pincodeMap.forEach((k,v)->System.out.println("key:" + k + " Value:" + v));
		
		pincodeMap.computeIfPresent(4312, (k,v)->"Chembur East");
		
		pincodeMap.forEach((k,v)->System.out.println("key:" + k + " Value:" + v));
	}
}
