package com.gvacharya.multithreading.threadcreation.classes;

public class ThreadDemo extends Thread{

	@Override
	public void run() {
		printHello();
	}

	private void printHello() {
		for(int i=10;i>=0;i--)
			System.out.println(
					Thread.currentThread().getName() 
					+  " " + Thread.currentThread().getPriority()
					+" "
					+" Hello " 
					+ i);
	}
}
