package com.gvacharya.generic.numbers;

import java.util.Optional;

import com.gvacharya.generic.numbers.classes.NumberBox;

public class MainNumber {

	public static void main(String[] args) {
		NumberBox<Integer> intBox = new NumberBox<>();
		intBox.setTArray(50,10,30,40);
		intBox
			.getStream()
				.sorted()
					.forEach(System.out::println);
		
		NumberBox<Float> floatBox = new NumberBox<>(); 
		Float[] floatArray = {12.1F,13.2F,10.31F,9.0F};
		floatBox.setTArray(floatArray);
		Optional<Float> max=
				floatBox
					.getStream()
						.max(Float::compare);
		if(!max.isEmpty())
			System.out.println(max.get());
	}
}
