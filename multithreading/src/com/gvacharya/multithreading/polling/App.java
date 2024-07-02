package com.gvacharya.multithreading.polling;

import com.gvacharya.multithreading.polling.classes.MessageConsumer;
import com.gvacharya.multithreading.polling.classes.MessagePrint;
import com.gvacharya.multithreading.polling.classes.MessageSupplier;

public class App {

	public static void main(String[] args) {
		MessagePrint messagePrint = new MessagePrint();
		Thread consumer = new Thread(new MessageConsumer(messagePrint));
		Thread supplier =new Thread(new MessageSupplier(messagePrint));
		
		consumer.start();

		supplier.start();
	}
}
