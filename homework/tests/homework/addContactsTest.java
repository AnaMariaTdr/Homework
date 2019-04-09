package homework;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import homework_12_09_2019_2.phoneNumber;

public class addContactsTest {

	@Test
	public void correctPhoneNumberTest() {
		phoneNumber validator = new phoneNumber();
		boolean result = validator.checkPhoneNumber("0720805058");
		assertTrue(result);
	}

	@Test(expected = NumberFormatException.class)
	public void tooShortPhoneNumberTest() {
		phoneNumber validator = new phoneNumber();
		boolean result = validator.checkPhoneNumber("07208050");
		assertFalse(result);
	}
	
	@Test(expected = NumberFormatException.class)
	public void tooLongPhoneNumberTest() {
		phoneNumber validator = new phoneNumber();
		boolean result = validator.checkPhoneNumber("07208050587");
		assertFalse(result);
	}
	@Test(expected = NumberFormatException.class)
	public void invalidCharacterUsedPhoneNumberTest() {
		phoneNumber validator = new phoneNumber();
		boolean result = validator.checkPhoneNumber("07g0805058");
		assertFalse(result);
	}

}
