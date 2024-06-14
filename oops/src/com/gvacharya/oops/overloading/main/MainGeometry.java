package com.gvacharya.oops.overloading.main;

import java.util.Arrays;

import com.gvacharya.oops.overloading.Geometry;

public class MainGeometry {

	public static void main(String[] args) {
		Geometry geometry = new Geometry();
		
		geometry.area(10.0F);
		
		geometry.area(10f, 10);
		geometry.area(10, 10f);
	}
}
