package homework_12_09_2019_2;

public class Contacts {

	private int phoneNumber;
	private String firstName;
	private String lastName;

	public Contacts(int phoneNumber, String firstName, String lastName) {
		super();

		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Contact is  : " + "phoneNumber =" + phoneNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}

}
