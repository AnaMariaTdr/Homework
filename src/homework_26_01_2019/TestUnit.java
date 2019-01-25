package homework_26_01_2019;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestUnit {

	static int[][] myArray = new int[5][5];

	@Before
	public void setUp() {
		myArray = new int[5][5];
	}

	@Test
	public void testAddToArray() {

		for (int i = 0; i < 5; i++) {

			myArray[i][0] = i;
			System.out.println(myArray[i][0]);
			for (int j = 0; j < 5; j++) {
				myArray[0][j] = j;

			}
		}
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < myArray[i].length; j++) {
				System.out.println("Values at array[" + i + "][" + j + "] is " + myArray[i][j]);

			}
		}

	}

	@Test
	public void testSumOfMainDiagonal() {
		int sum = 0;

		for (int i = 0; i <= 4; i++) {
			sum += myArray[i][i];

			assertEquals(0, sum);

		}

		System.out.println("Sum of the fist principal diagonal is " + sum);
	}
}
