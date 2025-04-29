package lab.library.control;
import java.util.Arrays;
import java.util.List;

import lab.library.entity.*;

public class LibraryManagementSystem {
	
	static void addSampleBooks(Library library) {
		List<Book> books = Arrays.asList(
								new Book("자바 프로그래밍","김자바","979-89-01-12345-6",2022),
								new Book("객체지향의 사실과 오해","조영호","978-89-01-67890-1",2015),
								new Book("Clean Code","Robert C. Martin","978-0-13-235088-4",2008),
								new Book("Effective Java","Joshua Bloch","978-1-13-468599-1",2018),
								new Book("Head First Java","Kathy Sierra","978-0-596-00920-5",2005),
								new Book("자바의 정석","남궁성","978-89-01-14077-4",2019)
							);
		for(Book book : books) {
			library.addBook(book);
			System.out.println("도서가 추가되었습니다: "+book.getTitle());
		}
		
	}
	
	static void testFind(Library library) {
		System.out.println("==== 도서 검색 테스트 ====");
		Book findResult = library.findBookByTitle("자바의 정석");
		System.out.println(findResult.toString());
	}
	
	static void testCheckOut(Library library) {
		System.out.println("==== 도서 대출 테스트 ====");
		String isbn = "978-89-01-14077-4";
		boolean result = library.checkOutBook(isbn);
		if(result) {
			System.out.println("도서 대출 성공!");
			System.out.println("대출된 도서 정보:\n"+library.findBookByIsbn(isbn).toString());
		}
	}
	
	static void testReturn(Library library) {
		System.out.println("==== 도서 반납 테스트 ====");
		String isbn = "978-89-01-14077-4";
		boolean result = library.returnBook(isbn);
		if(result) {
			System.out.println("도서 반납 성공!");
			System.out.println("반납된 도서 정보:\n"+library.findBookByIsbn(isbn).toString());
		}
	}
	
	static void displayAvailableBooks(Library library) {
		for(Book book :library.getAvailableBooks()) {
			System.out.println("===대출 가능한 도서 목록===");
			System.out.println(book.toString());
			System.out.println("-------------");
		}
		
	}
	
	static void libraryStatus(Library library) {
		System.out.println("전체 도서 수: "+library.getTotalBooks());
		System.out.println("대출 가능 도서 수: "+library.getAvailableBooksCount());
		System.out.println("대출 중인 도서 수: "+library.getBorrowedBooksCount());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library("중앙 도서관");
		
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
