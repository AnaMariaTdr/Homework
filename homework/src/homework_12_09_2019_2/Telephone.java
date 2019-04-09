package homework_12_09_2019_2;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Telephone {

	int key;
	private Map<Integer, Contacts> telephoneBook = new TreeMap<>();

	public void addToContacts(int phoneNumber, String firstName, String lastName) {

		Contacts contact = new Contacts(phoneNumber, firstName, lastName);

		telephoneBook.put((key + 1), contact);
		key = key + 1;
	}

	public void ListAllContacts(Collection<Contacts> map) {
		map.forEach(System.out::println);

	}
	
	

}
