package com.gvacharya.objectarray;

import com.gvacharya.objectarray.entity.Book;

public class MainBook {

	public static void main(String[] args) {
		Book[] books = new Book[5];
		books[0] = new Book();
		books[0].setPrice(100);
		books[0].setName("Who moved my chees");
		books[0].setPages((short)150);
		System.out.println(books[0].toString());
		
	}
}
