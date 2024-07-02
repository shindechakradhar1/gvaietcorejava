package com.gvacharya.multithreading.syncronization.classes;

public class PrintMessage {

	private String msg;

	public PrintMessage(String msg) {
		this.msg = msg;
	}
	
	public void printMessage(){
		synchronized (this) {
			for(int i=0;i<10;i++) {
				try {
					System.out.println(msg + i);
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
		}
	}
	
	
}
