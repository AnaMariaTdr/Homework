package homework_1.fullHomework;

public class TresCinco  {

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
