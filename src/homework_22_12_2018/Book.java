package homework_22_12_2018;

public abstract class Book {
	
	protected static String bookName; 
	protected static int noOfPages;
	public Book(String bookName, int noOfPages) {
		super();
		Book.bookName = bookName;
		Book.noOfPages = noOfPages;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", noOfPages=" + noOfPages + "]";
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
	

	
	
	
	
	
	

}
