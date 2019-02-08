package homework_26_01_2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Matrix {
	static int[][] myArray = new int[5][5];

	public void createMatrix() {

		for (int i = 0; i < myArray.length; i++) {
			Random random = new Random();

			for (int j = 0; j < myArray[i].length; j++) {
				myArray[i][j] = random.nextInt(100);

			}

		}

	}

	// iterating into the array to check if the numbers where added

	void iteratateMatrix() {

		for (int i = 0; i < myArray.length; i++) {

			for (int j = 0; j < myArray[i].length; j++) {
				System.out.println("Values at array[" + i + "][" + j + "] is " + myArray[i][j]);

			}

		}

	}

	// iterating through the first line of the array
	// we can use the above iteration without the line j.

	void displayFirstRow() {

		for (int j = 0; j < myArray.length; j++) {

			int i = 0;

			System.out.println("Values at array[" + i + "][" + j + "] is " + myArray[i][j]);

		}

	}
	
	/* 00 01 02 03 04      first principal diagonal is 00 11 22 33 44      first secondary diagonal is 04 13 22 31 40
	 * 10 11 12 13 14      2nd   principal diagonal is 10 21 32 43         2nd   secondary diagonal is 14 23 32 41
	 * 20 21 22 23 24      3rd   principal diagonal is 20 31 42            3rd   secondary diagonal is 24 33 42
	 * 30 31 32 33 34      4th   principal diagonal is 30 41               4th   secondary diagonal is 34 43
	 * 40 41 42 43 44
	 */

	void sumOfMainDiagonal() {

		int sum = 0;

		for (int i = 0; i <= myArray.length - 1; i++) {
			sum += myArray[i][i];

		}

		System.out.println("Sum of the fist principal diagonal is " + sum);
	}

	void sumOf4thMainDiagonal() {
		int y = myArray[myArray.length - 2][0];
		int x = myArray[myArray.length - 1][1];
		int sum = x + y;

		System.out.println("Sum of the 4th Main Diagonal " + sum);
		System.out.println("The biggest number in the 4th Main Diagonal is " + Math.max(x, y));

	}

	void sumOfTheFirstSecondaryDiagonal() {
		int sum = 0;
		int j = myArray.length - 1;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= myArray.length - 1; i++) {

			// System.out.println("j =" + j); -- used for debug

			sum += myArray[i][j];
			list.add(myArray[i][j]);
			// System.out.println("my array " + myArray[i][j]); -- used for debug

			j--;

		}

		System.out.println("Sum of the first Secondary diagonal is " + sum);

		System.out.println("Biggest number from first Secondary diagonal is " + Collections.max(list));
	}

}

public class App {

	public static void main(String arg[]) {
		//as fi vrut sa creezi teste pentru metodele astea, in loc sa le apelezi in main :D
		Matrix matrix = new Matrix();
		matrix.createMatrix();
		// matrix.iteratateMatrix();
		matrix.displayFirstRow();
		matrix.sumOfTheFirstSecondaryDiagonal();
		matrix.sumOf4thMainDiagonal();

	}
}
