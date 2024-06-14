package com.gvacharya.oops.inheritance.multilevel;

public class Animal {

	private float height;
	private int age;
	private String noise;

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(float height, int age, String noise) {
		this.height = height;
		this.age=age;
		this.noise=noise;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}
	
	public void display() {
		System.out.println("Parent Class");
	}

	@Override
	public String toString() {
		return "Animal [height=" + height + ", age=" + age + ", noise=" + noise + "]";
	}

}
