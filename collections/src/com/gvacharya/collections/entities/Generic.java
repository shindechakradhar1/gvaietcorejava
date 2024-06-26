package com.gvacharya.collections.entities;

public class Generic<T> {

	private T t;

	public Generic(T t) {
		super();
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
	
}
