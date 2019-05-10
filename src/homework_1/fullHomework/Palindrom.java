package homework_1.fullHomework;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		System.out.println(isPalindrome("abcdefedcba"));
		
//		System.out.println(str.equals(new StringBuilder(str).reverse());
		//.toString());
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

		scr.close();

	}

	public static boolean isPalindrome(String str) {
		System.out.println("////////////////Solution two//////////////////");

		return str.equals(new StringBuilder(str).reverse().toString());
	}

}
