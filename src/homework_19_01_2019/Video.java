package homework_19_01_2019;

public class Video {
	private String videoTitle;
	private int averageUserRating;
	private int rating;
	private int totalNoRatings;
	private boolean videoInStore = false;

	public Video(String videoTitle) {

		this.videoTitle = videoTitle;
	}

	public String getVideoTitle() {
		return videoTitle;
	}

	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}

	public int getAverageUserRating() {
		return averageUserRating;
	}

	public void setAverageUserRating(int averageUserRating) {
		this.averageUserRating = averageUserRating;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getTotalNoRatings() {
		return totalNoRatings;
	}

	public void setTotalNoRatings(int totalNoRatings) {
		this.totalNoRatings = totalNoRatings;
	}

	public boolean isVideoInStore() {
		return videoInStore;
	}

	public void setVideoInStore(boolean videoInStore) {
		this.videoInStore = videoInStore;
	}

}