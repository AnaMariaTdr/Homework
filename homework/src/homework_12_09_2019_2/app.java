package homework_12_09_2019_2;

public class app {
	public static void main(String[] args) {
		Telephone iphone = new Iphone();
		Telephone samsung = new Samsung();

		iphone.tostringy();
		samsung.tostringy();
		System.out.println();

		iphone.addToContacts("0720592674", "Ana", "Tudor");
		samsung.addToContacts("0739573820", "Florin", "Titi");
		System.out.println();

		iphone.sentMessage("0720592674", "Sending message from Iphone ");
		samsung.call("0739573820");
		System.out.println();

		iphone.listMessageHistory();
		iphone.ListAllContacts();
		iphone.viewHistory();
		System.out.println();

		samsung.listMessageHistory();
		samsung.ListAllContacts();
		samsung.viewHistory();
	}
}
