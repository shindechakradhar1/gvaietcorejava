package com.gvacharya.multithreading.syncronization.classes;

public class RunnableTable implements Runnable {

	private Table table;
	private int tableNo;
	
	
	public RunnableTable(Table table, int tableNo) {
		this.tableNo=tableNo;
		this.table = table;
	}



	@Override
	public void run() {
		table.printTable(tableNo);	
	}
	

}
