package homework_1.fullHomework;

import java.util.Scanner;

public class Calculator  {
	
	
	public static void calculator() {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please insert value of the first number x ");
		int x = sc1.nextInt();

		System.out.println("Please insert value of the second number y ");
		int y = sc1.nextInt();

		System.out.println("Please the operator you would like to use. (eg. +, -, * , /) ");
		char operator = sc1.next().charAt(0);
		sc1.close();

		double result = 0;

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

		solutionTwo();

	}

	public static void solutionTwo() {

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
}
