package homework_22_12_2018;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library_Catalog lc = new Library_Catalog();
		Scanner scr = new Scanner(System.in);

		System.out.println("Hello.Please tell me what would you like to do?");
		System.out.println("Add/ Delete / Find / DisplayAll");

		switch (scr.nextLine()) {
		case ("Add"):
			System.out.println("Please tell me what kind of book would you like to add? (Novels or Artbooks");
			if (scr.nextLine() == "Novels") {
				System.out.println("Please tell me the name of the book ");
				String name = scr.nextLine();
				System.out.println("Please tell me the number of pages ");
				int numberOfPages = scr.nextInt();
				System.out.println("Please tell me the type of book");
				String type = scr.nextLine();

				Book book = new Novel(name, numberOfPages, type);

				lc.addBook(book);
			}
			if (scr.nextLine() == "Artbook") {
				System.out.println("Please tell me the name of the book ");
				String name = scr.nextLine();
				System.out.println("Please tell me the number of pages ");
				int numberOfPages = scr.nextInt();
				System.out.println("Please tell me the paper quality");
				String paper = scr.nextLine();

				Book book = new ArtBook(name, numberOfPages, paper);
				lc.addBook(book);

			}

			else {
				System.out.println("Try again ");
			}

			break;

		case ("Remove"):

			break;

		case ("Find"):

			System.out.println("Please tell me the name of the book you would like to find");
			if (scr.hasNext()) {
				String name = scr.nextLine();
				lc.findByName(name);
			}
			break;

		case ("DisplayAll"):
			System.out.println("All books are displayed below ");
			System.out.println();

			lc.prindAllBooks();

			break;

		default:
			System.out.println("The command is not recognized");
		}
		scr.close();
	}

}
