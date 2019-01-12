package homework_1.fullHomework;

import java.util.Scanner;

public class FullHomework {

	public static void main(String[] agrs) {

		calculator();
		palindrom();
		sumOfDigits();
		sumOfPrimeNumbers();
		tresCinco();

	}

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

	public static void calculator() {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please insert value of the first number x ");
		int x = sc1.nextInt();

		System.out.println("Please insert value of the second number y ");
		int y = sc1.nextInt();

		System.out.println("Please the operator you would like to use. (eg. +, -, * , /) ");
		char operator = sc1.next().charAt(0);

		double result = 0;
		sc1.close();

		switch (operator) {

		case '+':
			result = x + y;
			break;

		case '-':
			result = x - y;
			break;

		case '*':
			result = x * y;
			break;

		case '/':
			result = x / y;
			break;

		default:
			System.out.println("Operator not valid ");
		}

		System.out.println(result);

		solutionTwoCalculator();

	}


	public static void solutionTwoCalculator() {

		System.out.println("////////////Solution two with if else /////////////");

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please insert value of the first number x ");
		int x = sc1.nextInt();

		System.out.println("Please insert value of the second number y ");
		int y = sc1.nextInt();

		System.out.println("Please the operator you would like to use. (eg. +, -, * , /) ");

		char operator = sc1.next().charAt(0);

		int result = 0;

		if (operator == '+') {
			result = x + y;

		} else if (operator == '-') {

			result = x - y;

		} else if (operator == '*') {
			result = x * y;
		} else if (operator == '/') {
			result = x / y;
		} else {
			System.out.println("Operator not recognised ");
		}
		System.out.println(result);

		sc1.close();

	}

	public static void palindrom() {
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

		solutionTwoPalindrom();

		scr.close();

	}

	public static void solutionTwoPalindrom() {
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

	public static void sumOfPrimeNumbers() {
		long sum = 0;

		for (int number = 2; number < 100; number++) {

			if (isPrime(number)) {
				sum += number;

			}

		}
		System.out.println(sum);

	}

	public static boolean isPrime(int number) {

		for (int i = 2; i < number / 2; i++) {

			if (number % i == 0) {

				return false;
			}
		}
		return true;

	}

	public static void tresCinco() {
		for (int i = 1; i < 101; i++) {

			if ((i % 3 == 0) && (i % 5 == 0)) {

				System.out.println("Number  : " + i + "  TresCinco");
			}

			else if (i % 3 == 0) {

				System.out.println("Number : " + i + "  Tres");
			}

			else if (i % 5 == 0) {
				System.out.println("Number  : " + i + "   Cinco");

			}

		}
	}
}
