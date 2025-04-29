package lab.library.control;
import java.util.Arrays;
import java.util.List;

import lab.library.entity.*;

public class LibraryManagementSystem {
	
	static void addSampleBooks(Library library) {
		List<Book> books = Arrays.asList(
								new Book("�ڹ� ���α׷���","���ڹ�","979-89-01-12345-6",2022),
								new Book("��ü������ ��ǰ� ����","����ȣ","978-89-01-67890-1",2015),
								new Book("Clean Code","Robert C. Martin","978-0-13-235088-4",2008),
								new Book("Effective Java","Joshua Bloch","978-1-13-468599-1",2018),
								new Book("Head First Java","Kathy Sierra","978-0-596-00920-5",2005),
								new Book("�ڹ��� ����","���ü�","978-89-01-14077-4",2019)
							);
		for(Book book : books) {
			library.addBook(book);
			System.out.println("������ �߰��Ǿ����ϴ�: "+book.getTitle());
		}
		
	}
	
	static void testFind(Library library) {
		System.out.println("==== ���� �˻� �׽�Ʈ ====");
		Book findResult = library.findBookByTitle("�ڹ��� ����");
		System.out.println(findResult.toString());
	}
	
	static void testCheckOut(Library library) {
		System.out.println("==== ���� ���� �׽�Ʈ ====");
		String isbn = "978-89-01-14077-4";
		boolean result = library.checkOutBook(isbn);
		if(result) {
			System.out.println("���� ���� ����!");
			System.out.println("����� ���� ����:\n"+library.findBookByIsbn(isbn).toString());
		}
	}
	
	static void testReturn(Library library) {
		System.out.println("==== ���� �ݳ� �׽�Ʈ ====");
		String isbn = "978-89-01-14077-4";
		boolean result = library.returnBook(isbn);
		if(result) {
			System.out.println("���� �ݳ� ����!");
			System.out.println("�ݳ��� ���� ����:\n"+library.findBookByIsbn(isbn).toString());
		}
	}
	
	static void displayAvailableBooks(Library library) {
		for(Book book :library.getAvailableBooks()) {
			System.out.println("===���� ������ ���� ���===");
			System.out.println(book.toString());
			System.out.println("-------------");
		}
		
	}
	
	static void libraryStatus(Library library) {
		System.out.println("��ü ���� ��: "+library.getTotalBooks());
		System.out.println("���� ���� ���� ��: "+library.getAvailableBooksCount());
		System.out.println("���� ���� ���� ��: "+library.getBorrowedBooksCount());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library("�߾� ������");
		
		addSampleBooks(library);
		System.out.println(String.format("==== %s ====", library.getName()));
		libraryStatus(library);
		
		testFind(library);
		testCheckOut(library);
		libraryStatus(library);
		
		testReturn(library);
		libraryStatus(library);
		displayAvailableBooks(library);
	}

}
