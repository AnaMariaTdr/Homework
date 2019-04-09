package homework_12_09_2019_2;

import java.util.HashMap;
import java.util.Map;

public class Iphone extends Telephone {

	private final String phoneNumberIphone = "074728573029";
	private int batteryLife = 100;

	Map<String, String> messagesHistoryIphone = new HashMap<>();
	Map<String, String> callingHistoryIphone = new HashMap<>();

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
		// TODO Auto-generated method stub
		super.sentMessage(phoneNumber, message);

		Contacts check = (getTelephoneBook().get(phoneNumber));
		message ms = new message();
		boolean checkMS = ms.checkMessage(message);
		if (check != null) {

			System.out.println("Checking your message...");
			if (checkMS != false) {
				System.out.println("Your message has been sent ! ");

				messagesHistoryIphone.put(phoneNumber, message);
				batteryLife = batteryLife - 10;
			}

		}
	}

	@Override
	public void listMessageHistory() {
		tostringy();
		messagesHistoryIphone.entrySet().stream().forEach(e -> System.out.println(e));
	}

	public void tostringy() {
		System.out.println("Iphone [phoneNumber =" + phoneNumberIphone + ", batteryLife=" + batteryLife + "]");
	}

	@Override
	public void call(String phoneNumber) {
		callingHistoryIphone.put(phoneNumber, "Inbound call");
		System.out.println("Calling from iphone.... ");
		batteryLife = batteryLife - 20;
	}

	@Override
	public void viewHistory() {
		toString();
		callingHistoryIphone.entrySet().stream().forEach(e -> System.out.println(e));
	}

	@Override
	public void recharge() {
		batteryLife = 100;
	}

}
