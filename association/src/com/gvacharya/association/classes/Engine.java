package com.gvacharya.association.classes;

public class Engine {

	private int stokes;
	private boolean isPowerSteering;
	private boolean isPertrol;

	public Engine() {}

	public Engine(int stokes, boolean isPowerSteering, boolean isPertrol) {
		this.stokes = stokes;
		this.isPowerSteering = isPowerSteering;
		this.isPertrol = isPertrol;
	}

	public int getStokes() {
		return stokes;
	}

	public void setStokes(int stokes) {
		this.stokes = stokes;
	}

	public boolean isPowerSteering() {
		return isPowerSteering;
	}

	public void setPowerSteering(boolean isPowerSteering) {
		this.isPowerSteering = isPowerSteering;
	}

	public boolean isPertrol() {
		return isPertrol;
	}

	public void setPertrol(boolean isPertrol) {
		this.isPertrol = isPertrol;
	}

	@Override
	public String toString() {
		return "Engine [stokes=" + stokes + ", isPowerSteering=" + isPowerSteering + ", isPertrol=" + isPertrol + "]";
	}

}
