package homework;

import static org.junit.Assert.*;

import org.junit.Test;

import homework_12_09_2019_2.message;

public class messageLenghtTest {

	@Test
	public void validTextMessageTest() {
		message validator = new message();
		boolean result = validator.checkMessage("jdawjdajdjsahdsa jsdakgdaj ldaishdkasdsa");
		assertTrue(result);

	}
	
	@Test
	public void invalidTooLongTextMessageTest() {
		message validator = new message();
		boolean result = validator.checkMessage("jdawjdajdjsakjmjmsbdksadjksahdksajdiksajdikajidjiajdiasjdijsaidjasijdisajdisajdisajidjsaidjisajdisajdisajdiajsidjasijdaisd a d              sjdnkasdhsakdhasikdhaskdhsakdhsakdhaushdkashudhsadasudih                                                           kajsdksahdisahudashduashdusahdusad                                                               aisuhduashduashdusdysudysa8udysauyduas                   ayduasydusaydusaydusaydusaydauydusaydusayyadjadjgajdagsdjadgjsadjsagdjsagdjagdjahdsa jsdakgdaj ldaishdkasdsa");
		assertFalse(result);

	}

}
