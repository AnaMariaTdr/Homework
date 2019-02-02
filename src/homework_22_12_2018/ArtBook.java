package homework_22_12_2018;

public class ArtBook extends Book {
	
	private String paperQuality;

	public ArtBook(String bookName, int noOfPages, String paperQuality) {
		super(bookName, noOfPages);
		this.paperQuality = paperQuality;
	}

	public String getPaperQuality() {
		return paperQuality;
	}

	public void setPaperQuality(String paperQuality) {
		this.paperQuality = paperQuality;
	}

	@Override
	public String toString() {
		return "ArtBooks [paperQuality=" + paperQuality + ", toString()=" + super.toString() + "]";
	}

	
	

}
