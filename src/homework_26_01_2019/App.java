package homework_26_01_2019;

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
		
		System.out.println(myArray.length);
	}

	// iterating into the array to check if the numbers where added
	/*
	 * void iteratateMatrix() {
	 * 
	 * for (int i = 0; i < myArray.length; i++) {
	 * 
	 * for (int j = 0; j < myArray[i].length; j++) {
	 * System.out.println("Values at arr[" + i + "][" + j + "] is " +
	 * myArray[i][j]);
	 * 
	 * }
	 * 
	 * }
	 * 
	 * }
	 */

	// iterating through the first line of the array
	// we can use the above iteration without the line j.

	void displayFirstRow() {

		for (int j = 0; j < myArray.length; j++) {

			int i = 0;

			System.out.println("Values at arr[" + i + "][" + j + "] is " + myArray[i][j]);

		}

	}
	
	/* 00 01 02 03 04      first principal diagonal is 00 11 22 33 44      first secondary diagonal is 04 13 22 31 40
	 * 10 11 12 13 14      2nd   principal diagonal is 10 21 32 43         2nd   secondary diagonal is 14 23 32 41
	 * 20 21 22 23 24      3rd   principal diagonal is 20 31 42            3rd   secondary diagonal is 24 33 42
	 * 30 31 32 33 34      4th   principal diagonal is 30 41               4th   secondary diagonal is 34 43
	 * 40 41 42 43 44
	 */


	
	/*void sumOfMainDiagonal(){
		
		for ( int i = 0; i < myArray.length-1; i++) {
			for ( int j = 0 ; j< myArray.length-1; j++){
				
				
			}
		}
		
	}*/
}

public class App {

	public static void main(String arg[]) {
		
		Matrix matrix = new Matrix ();
		matrix.createMatrix();
		
	

	}
}
