package homework_1.fullHomework;

import java.util.Scanner;

public class SumOfDigits  {

	public static void sumOfDigits() {
		Scanner scr = new Scanner(System.in);

		System.out.println("Please insert a number to calculate its sum of digits ");

		int x = scr.nextInt();

		int length = String.valueOf(x).length();

		int y = 0;

		for (int i = 0; i < length; i++) {

			y = y + x % 10;

			x = x / 10;

		}

		System.out.println("Sum of digits : " + y);

		solutionTwo();

		scr.close();

	}

	public static void solutionTwo() {
		System.out.println("////////////////Solution two//////////////////");
		Scanner scr = new Scanner(System.in);
		int x = scr.nextInt();

		int y = 0;

		while (x > 0) {
			y = y + x % 10;

			x = x / 10;
		}
		System.out.println("Sum of digits : " + y);

		scr.close();

	}

}
