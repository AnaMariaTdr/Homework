package homework_22_12_2018;

public class Novel extends Book {

	private String type;

	public Novel(String name, int numberOfPages, String type) {
		// TODO Auto-generated constructor stub
		super(bookName, noOfPages);
		this.type = type;
	}

	public String getNovelType() {
		return type;
	}

	public void setNovelType(String novelType) {
		this.type = novelType;
	}

	@Override
	public String toString() {
		return "Novel [novelType=" + type + ", toString()=" + super.toString() + "]";
	}

}
