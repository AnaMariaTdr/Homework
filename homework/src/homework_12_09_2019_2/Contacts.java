package homework_12_09_2019_2;

public class Contacts {

	private String firstName;
	private String lastName;

	public Contacts(String firstName, String lastName) {
		super();

		this.firstName = firstName;
		this.lastName = lastName;

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
		return "Contact is  :  firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
