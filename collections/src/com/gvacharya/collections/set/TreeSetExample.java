package com.gvacharya.collections.set;

import java.util.NavigableSet;
import java.util.TreeSet;

import com.gvacharya.collections.entities.Movies;

public class TreeSetExample {

	public static void main(String[] args) {
		NavigableSet<Integer> intTreeSet = new TreeSet<>();
		
		intTreeSet.add(10);
		intTreeSet.add(8);
		intTreeSet.add(5);
		intTreeSet.add(6);
		intTreeSet.add(2);
		intTreeSet.add(3);
		intTreeSet.add(3);
		intTreeSet.add(1);
		
		intTreeSet.forEach(System.out::println);
		
		NavigableSet<Movies> movieSet = new TreeSet<>((e1,e2)->Integer.compare(e1.getId(), e2.getId()));
		movieSet.add(new Movies(1,"Shawshank Redemption"));
		movieSet.add(new Movies(2, "Schindeler's List"));
		movieSet.add(new Movies(3, "Blood Diamond"));
		movieSet.add(new Movies(4, "Inception"));
		
//		movieSet.forEach(System.out::println);
		
		// subSet/tailSet/headSet
		
		System.out.println(movieSet.first());
		System.out.println(movieSet.last());
//		return value <= e
		System.out.println(movieSet.floor(new Movies(5,"Blood Diamond")));
//		return value >= e 
		System.out.println(movieSet.ceiling(new Movies(2,"Blood Diamond")));
//		return value > e;
		System.out.println(movieSet.higher(new Movies(2,"Blood Diamond")));
		
	}
}
