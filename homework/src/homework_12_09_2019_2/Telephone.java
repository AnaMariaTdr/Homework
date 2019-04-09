package homework_12_09_2019_2;

import java.util.Map;
import java.util.TreeMap;

public abstract class Telephone {

	int phoneNumber;
	protected Map<Integer, Contacts> telephoneBook = new TreeMap<>();

	// phone number and contacts

	public void addToContacts(int phoneNumber, String firstName, String lastName) {

	}

	public void ListAllContacts() {
		telephoneBook.entrySet().stream().forEach(e -> System.out.println(e));

	}

	// messages

	public void sentMessage(int phoneNumber, String message) {

	}
	
	//calling 
	
	public void call(int phoneNumber) {
		
	}
	public void viewHistory() {
		
	}
	
	public void listMessageHistory() {
	

	}
	
	public void recharge() {
		
	}

	public Map<Integer, Contacts> getTelephoneBook() {
		return telephoneBook;
	}

	public void setTelephoneBook(Map<Integer, Contacts> telephoneBook) {
		this.telephoneBook = telephoneBook;
	}
}
