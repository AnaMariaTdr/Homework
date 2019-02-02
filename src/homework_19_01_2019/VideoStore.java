package homework_19_01_2019;

import java.util.ArrayList;
import java.util.List;

public class VideoStore {

	List<Video> myVideoList = new ArrayList<>();

	public void addVideo(String videoTitle) {
		Video video = new Video(videoTitle);
		

		myVideoList.add(video);

	}

	public void checkOut(String videoTitle) {

		for (Video video : myVideoList) {
			if (video.getVideoTitle().equals(videoTitle)) {
				video.setVideoInStore(true);
			}
		}
	}

	public void returnVideo(String videoTitle) {

		for (Video video : myVideoList) {
			if (video.getVideoTitle().equals(videoTitle)) {
				video.setVideoInStore(false);
			}
		}
	}

	public void receiveRating(String videoTitle, int rating) {
		for (Video video : myVideoList) {
			if (video.getVideoTitle().equals(videoTitle)) {
				video.setRating(video.getRating() + 1);
				video.setTotalNoRatings(video.getTotalNoRatings() + rating);
				video.setAverageUserRating((video.getTotalNoRatings() / video.getRating()));

			}
		}

	}

	public void listInventory() {
		for (Video video : myVideoList) {

			StringBuilder sb = new StringBuilder();

			sb.append(myVideoList.indexOf(video) + 1);
			sb.append(video.getVideoTitle());
			sb.append("with average rating of : " + video.getAverageUserRating());

		}

	}
}
