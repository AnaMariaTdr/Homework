package homework_19_01_2019;

public class App19_01_2019 {

	public static void main(String[] args) {
		VideoStore videoStore = new VideoStore();

		videoStore.addVideo("The Matrix");
		videoStore.receiveRating("The Matrix", 3);
		videoStore.receiveRating("The Matrix", 4);
		videoStore.receiveRating("The Matrix", 8);
		videoStore.checkOut("the matrix");
		videoStore.returnVideo("the matrix");

		videoStore.addVideo("Godfather II");
		videoStore.receiveRating("Godfather II", 8);
		videoStore.receiveRating("Godfather II", 9);
		videoStore.receiveRating("Godfather II", 9);
		videoStore.checkOut("Godfather II");
		videoStore.returnVideo("Godfather II");

		videoStore.addVideo("Star Wars Episode IV: A New Hope");
		videoStore.receiveRating("Star Wars Episode IV: A New Hope", 2);
		videoStore.receiveRating("Star Wars Episode IV: A New Hope", 4);
		videoStore.receiveRating("Star Wars Episode IV: A New Hope", 7);
		videoStore.checkOut("Star Wars Episode IV: A New Hope");
		videoStore.returnVideo("Star Wars Episode IV: A New Hope");
		videoStore.listInventory(); //cred ca metoda e suficient sa fie apelata o singura data, la final

	}

}
