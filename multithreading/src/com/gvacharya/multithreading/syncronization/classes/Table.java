package com.gvacharya.multithreading.syncronization.classes;

public class Table {

	public void printTable(int tableNumber) {

		System.out.println("Table No: " + tableNumber + " " + Thread.currentThread().getName());

		synchronized (this) {
			for (int i = 1; i < 11; i++) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(tableNumber * i);
			}
		}

	}
}
