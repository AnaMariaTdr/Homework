package homework_12_09_2019_2;

public class phoneNumber {

	public boolean checkPhoneNumber(String string) {

		if ((string.length()) < 10 || (string.length()) > 10) {
			throw new NumberFormatException("Phone numbers must be 10 digits long");
		} else

			for (int i = 0; i < string.length(); i++) {

				if (Character.isDigit(string.charAt(i))) {
					continue;
				} else
					throw new NumberFormatException("Phone numbers must contain only digits");
			}
		return true;
	}

}
