package com.wolken.wolkenapp.library;

import java.util.Scanner;

public class LibraryUtil {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size");
		int size = scanner.nextInt();

		Library library = new Library(size);

		// static array
		/*
		 * BookDTO bookDTO = new BookDTO(); bookDTO.setBookId(2);
		 * bookDTO.setAuthor("I too had a love story"); bookDTO.setEdition(1.0);
		 * bookDTO.setPrice(""); bookDTO.seType("love story");
		 * bookDTO.setPublisher("penguin");
		 * 
		 * library.addBooks(bookDTO);
		 * 
		 * BookDTO bookDTO1 = new BookDTO(); bookDTO1.setBookId(32);
		 * bookDTO1.setAuthor("Can love happen twice"); library.addBooks(bookDTO1);
		 */

		// dynamic

		for (int i = 0; i < size; i++) {

			System.out.println("Enter the Book id");
			int bookId = scanner.nextInt();

			System.out.println("Enter the Author name ");
			String author = scanner.next();

			System.out.println("Enter the book name");
			String bookName = scanner.next();

			System.out.println("Enter the Edition");
			int edition = scanner.nextInt();

			System.out.println("Enter the price");
			double price = scanner.nextDouble();

			System.out.println("Enter the type");
			String type = scanner.next();

			System.out.println("Enter the Publisher");
			String publisher = scanner.next();

			BookDTO bookDTO = new BookDTO();
			bookDTO.setBookId(bookId);
			bookDTO.setAuthor(author);
			bookDTO.setBookName(bookName);
			bookDTO.setEdition(edition);
			bookDTO.setPrice(price);
			bookDTO.setType(type);
			bookDTO.setPublisher(publisher);

			library.addBooks(bookDTO);
		}
		// has to called after the loop
		library.getBookDetails();

		BookDTO bookDTO = library.getBookByAuthor("rowling");
		System.out.println(bookDTO.getAuthor());

		//update the data
		/*if the return type is  not void */
		library.updatePriceByName("wingsoffire",98);

		BookDTO bookDTO1 = library.updatePriceByName("wingsoffire", 3000);
		System.out.println(bookDTO1.getPrice());
		
		 //delete the data
		library.getBookDetails();
		library.deleteBookByBookId(32);// if the ID IS NOT 32 THE DATA GIVEN GETS PRINTED TWICE
		library.getBookDetails();
		
	}
}
