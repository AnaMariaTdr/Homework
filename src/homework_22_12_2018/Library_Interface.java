package homework_22_12_2018;

public interface Library_Interface {
	
	
	
	void addBook(Book book);
	boolean deleteBook (String bookName);
	Book findByName(String bookName);
	void prindAllBooks();
	

}
