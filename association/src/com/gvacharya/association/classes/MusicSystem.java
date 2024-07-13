package com.gvacharya.association.classes;

public class MusicSystem {

	private boolean isTouchscreen;
	private boolean isFM;

	public MusicSystem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MusicSystem(boolean isTouchscreen, boolean isFM) {
		super();
		this.isTouchscreen = isTouchscreen;
		this.isFM = isFM;
	}

	public boolean isTouchscreen() {
		return isTouchscreen;
	}

	public void setTouchscreen(boolean isTouchscreen) {
		this.isTouchscreen = isTouchscreen;
	}

	public boolean isFM() {
		return isFM;
	}

	public void setFM(boolean isFM) {
		this.isFM = isFM;
	}

	@Override
	public String toString() {
		return "MusicSystem [isTouchscreen=" + isTouchscreen + ", isFM=" + isFM + "]";
	}

}
