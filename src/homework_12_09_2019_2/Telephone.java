package homework_12_09_2019_2;

import java.util.Map;
import java.util.TreeMap;

public abstract class Telephone {

	int phoneNumber;
	protected Map<String, Contacts> telephoneBook = new TreeMap<>();

	// phone number and contacts

	public void addToContacts(String phoneNumber, String firstName, String lastName) {

	}

	public void ListAllContacts() {
		telephoneBook.entrySet().stream().forEach(e -> System.out.println(e));

	}

	// messages

	public void sentMessage(Contacts contacts, String message) {

	}

	// calling

	public void call(String phoneNumber) {

	}

	public void viewHistory() {

	}

	public void listMessageHistory() {

	}

	public void recharge() {

	}

	public Map<String, Contacts> getTelephoneBook() {
		return telephoneBook;
	}

	public void setTelephoneBook(Map<String, Contacts> telephoneBook) {
		this.telephoneBook = telephoneBook;
	}

	public void sentMessage(String phoneNumber, String message) {
		// TODO Auto-generated method stub

	}

	protected abstract void tostringy();
}
