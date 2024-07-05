package com.gvacharya.multithreading.methods;

public class MethodExamples {

	public static void main(String[] args) {
		System.out.println("Start of main method");
		
		Thread thread1=new Thread(()->{
			try {
				for(int i=0;i<10;i++) {
					Thread.sleep(100);
					System.out.println(i + " thread1");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		Thread thread2=new Thread(()->{
			try {
				for(int i=0;i<10;i++) {
					Thread.sleep(1000);
					System.out.println(i + " thread2");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		Thread thread3=new Thread(()->{
			try {
				for(int i=0;i<10;i++) {
					Thread.sleep(1000);
					System.out.println(i + "thread3");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		
		
		thread2.start();
		thread3.start();		
		thread1.start();
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End of main Method");
	}
}
