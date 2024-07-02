package com.gvacharya.multithreading.threadcreation;

import com.gvacharya.multithreading.threadcreation.classes.ThreadDemo;

public class ThreadUsingThreadClass {

	public static void main(String[] args) {
		ThreadDemo thread1 = new ThreadDemo();
		thread1.setName("Thread-1");
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		
		ThreadDemo thread2 = new ThreadDemo();
		thread2.setName("Thread-2");
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread2.start();
	}
}
