package homework_12_09_2019_2;

import java.util.HashMap;
import java.util.Map;

public class Samsung extends Telephone {

	private final String phoneNumberSamsung = "0740604810";
	private int batteryLife = 100;

	Map<String, String> messagesHistorySamsung = new HashMap<>();
	Map<String, String> callingHistorySamsung = new HashMap<>();

	@Override
	public void addToContacts(String phoneNumber, String firstName, String lastName) {

		phoneNumber ph = new phoneNumber();
		boolean check = ph.checkPhoneNumber(phoneNumber);

		if (check == true) {
			Contacts contact = new Contacts(firstName, lastName);
			telephoneBook.put(phoneNumber, contact);

		} else
			System.out.println("The number you have entered is invalid, please try again");
	}

	@Override
	public void sentMessage(String phoneNumber, String message) {

		Contacts check = (getTelephoneBook().get(phoneNumber));
		message ms = new message();
		boolean checkMS = ms.checkMessage(message);
		if (check != null) {

			System.out.println("Checking your message...");
			if (checkMS != false) {
				System.out.println("Your message has been sent ! ");

				messagesHistorySamsung.put(phoneNumber, message);
				batteryLife = batteryLife - 10;
			}

		}
	}

	@Override
	public void listMessageHistory() {
		tostringy();
		messagesHistorySamsung.entrySet().stream().forEach(e -> System.out.println(e));
	}

	public void tostringy() {
		System.out.println("Samsung [phoneNumber =" + phoneNumberSamsung + ", batteryLife=" + batteryLife + "]");
	}

	@Override
	public void call(String phoneNumber) {
		callingHistorySamsung.put(phoneNumber, "Inbound call");
		System.out.println("Calling from samsung...");
		batteryLife = batteryLife - 20;
	}

	@Override
	public void viewHistory() {
		toString();
		callingHistorySamsung.entrySet().stream().forEach(e -> System.out.println(e));
	}

	@Override
	public void recharge() {
		batteryLife = 100;
	}

}
