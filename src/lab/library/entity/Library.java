package lab.library.entity;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> books = new ArrayList<Book>();
	private String name;
	

	public Library(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public String getName() {
		return this.name;
	}
	
	public Book findBookByTitle(String title) {
		for(Book book : this.books) {
			if(title.equals(book.getTitle())) {
				return book;
			}
		}
		return null;
	}
	
	public Book findBookByIsbn(String isbn) {
		for(Book book : this.books) {
			if(isbn.equals(book.getIsbn())) {
				return book;
			}
		}
		return null;
	}
	
	public boolean checkOutBook(String isbn) {
		for(Book book : this.books) {
			if(book.getIsbn() == isbn) {
				return book.checkOut();
				
			}
			
		}
		return false;
	}
	
	public boolean returnBook(String isbn) {
		for(Book book : this.books) {
			if(book.getIsbn() == isbn) {
				book.returnBook();
				return true;
			}
		}
		return false;
	}
	
	public int getTotalBooks() {
		return this.books.size();
	}
	
	public int getAvailableBooksCount() {
		int count = 0;
		for(Book book : this.books) {
			if(book.getAvailable()) {
				count++;
			}
		}
		return count;
	}
	
	public int getBorrowedBooksCount() {
		int count = 0;
		for(Book book : this.books) {
			if(!book.getAvailable()) {
				count++;
			}
		}
		return count;
	}
	
	
	
	public List<Book> getAllBooks(){
		return this.books;
	}
	
	public List<Book> getAvailableBooks(){
		List<Book> temp = new ArrayList<Book>();
		for(Book book : this.books) {
			if(book.getAvailable()) {
				temp.add(book);
			}
		}
		return temp;
	}

}
