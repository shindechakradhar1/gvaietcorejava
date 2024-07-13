package com.gvacharya.association.classes;

public class Address {

	private int laneNo;
	private String landMark;
	private String area;
	private String city;
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int laneNo, String landMark, String area, String city) {
		super();
		this.laneNo = laneNo;
		this.landMark = landMark;
		this.area = area;
		this.city = city;
	}
	public int getLaneNo() {
		return laneNo;
	}
	public void setLaneNo(int laneNo) {
		this.laneNo = laneNo;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [laneNo=" + laneNo + ", landMark=" + landMark + ", area=" + area + ", city=" + city + "]";
	}
	
	
}
