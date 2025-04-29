package lab.library.entity;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private int publishYear;
	private boolean isAvailable;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getIsbn() {
		return this.isbn;
	}

	public boolean getAvailable() {
		return this.isAvailable;
	}


	public boolean checkOut() {
		if(this.isAvailable) {
			this.isAvailable = false;
			return true;
		}
		else {
			return false;
		}
	}

	public void returnBook() {
		this.isAvailable = true;
		
	}
	
	@Override
	public String toString() {
		String avail; 
		if(this.isAvailable) {
			avail = "����";
		}else {
			avail = "���� ��";
		}
		return String.format("å ����: %s   ����: %s   ISBN: %s   ���ǳ⵵: %d   ���� ���ɿ���: %s", this.title, this.author, this.isbn, this.publishYear, avail);
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title, String author, String isbn, int publishYear) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.publishYear = publishYear;
		this.isAvailable = true;
	}
	
	

}
