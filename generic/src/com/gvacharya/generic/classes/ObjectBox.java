package com.gvacharya.generic.classes;

import java.util.List;

public class ObjectBox<Z> {

	private List<Z> zList;
	
	public void setList(List<Z> zList) {
		this.zList = zList;
	}
	
	public List<Z> getList(){
		return zList;
	}
	
	public boolean addElement(Z z) {
		return zList.add(z);
	}
	
	public void zForEach() {
		zList.forEach(System.out::println);
	}
	
}
