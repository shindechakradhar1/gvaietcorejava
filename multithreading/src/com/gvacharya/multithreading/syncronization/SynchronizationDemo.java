package com.gvacharya.multithreading.syncronization;

import com.gvacharya.multithreading.syncronization.classes.PrintMessage;
import com.gvacharya.multithreading.syncronization.classes.RunnableDemo;

public class SynchronizationDemo {

	public static void main(String[] args) {
		PrintMessage printM = new PrintMessage("Hello");
		
		RunnableDemo runnable1 = new RunnableDemo(printM);
		RunnableDemo runnable2 = new RunnableDemo(printM);
		
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		
		thread1.start();
		thread2.start();
	}
}
