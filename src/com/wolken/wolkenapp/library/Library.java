package com.wolken.wolkenapp.library;
// CRUD OPERATIONS
public class Library {
	//instance variable
	public BookDTO[] bookDTO; //non primitive array //public BookDTO[] bookDTO = new BookDTO[3];
	public int index;
	
	public Library(int size) {
		//TODO auto generated constructor
		bookDTO = new BookDTO[size];
		// we can use static block to give size outside the constructor
		
	}
	
	public void addBooks(BookDTO bookDTO) 
	{
		if(bookDTO!=null) {
			System.out.println("Books are added to the library");
		    this.bookDTO[index++]= bookDTO; // adding details
		}
		else 
			System.out.println("Book Object is null...cannot add book details");
	}
	public void getBookDetails() {
		for(int i=0; i < bookDTO.length; i++) {
			if(bookDTO[i]!=null) {
			System.out.println(bookDTO[i].getBookId() +" "+
								bookDTO[i].getAuthor() +" "+
								bookDTO[i].getBookName() +" "+
								bookDTO[i].getEdition() +" "+
								bookDTO[i].getPrice() +" "+
								bookDTO[i].getPublisher()+" "+
								bookDTO[i].getType());
			}
			else {
				System.out.println("details not found");
			}
			
		}
		
	}
	// to get data by author 
	public BookDTO getBookByAuthor(String author) {
		BookDTO bookDTO = null;
		 for(int i=0;i< this.bookDTO.length;i++) {
			 if(this.bookDTO[i]!= null) {
				 if(this.bookDTO[i].getAuthor().contentEquals(author)) {
					 bookDTO = this.bookDTO[i];
				 }
				 else {
					 System.out.println("No author found");
				 }
			 }
			 
		 }
		 return bookDTO;
		
	}
	// To Update the data
	public BookDTO updatePriceByName(String bookName, int price) {
		BookDTO bookDTO = null;
		for(int i=0; i < this.bookDTO.length;i++) {
			if(this.bookDTO[i] != null) {
				if(this.bookDTO[i].getBookName().equalsIgnoreCase(bookName)) {
					this.bookDTO[i].setPrice(price);
					bookDTO= this.bookDTO[i];
			}
		}
			else {
				System.out.println("No Books Found");
			}
		
		}
		return bookDTO;
	}
	// to delete data
	public void deleteBookByBookId(int bookId) {
		for(int i=0; i<bookDTO.length;i++) {
			if(this.bookDTO[i]!=null) {
				if(this.bookDTO[i].getBookId() == bookId) {
					this.bookDTO[i] = null;
					System.out.println("deleted");
					
				}
			}
			else {
				System.out.println("No Books found");
			}
		}
		
	}
	

}
