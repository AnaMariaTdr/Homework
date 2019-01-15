package homework_22_12_2018;

import java.util.ArrayList;

import java.util.List;

public class Library_Catalog implements Library_Interface {

	private List<Book> bookList = new ArrayList<>();

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub

		bookList.add(book);

	}

	@Override
	public boolean deleteBook(String bookName) {
		// TODO Auto-generated method stub

		return false;
	}

	@Override
	public Book findByName(String bookName) {
		// TODO Auto-generated method stub
		for (Book book : bookList) {
			if (book.getBookName().equals(bookName)) {
				System.out.println("Book was found");
				return book;

			}
		}

		return null;
	}

	@Override
	public void prindAllBooks() {
		// TODO Auto-generated method stub

		for (Book str : bookList) {
			System.out.println(str);
		}

	}

}
