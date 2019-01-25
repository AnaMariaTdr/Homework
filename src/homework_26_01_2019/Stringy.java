package homework_26_01_2019;

public class Stringy {

	public static void main(String agrs[]) {

		String st = "String example";
		char[] arr = st.toCharArray();

		System.out.println("String length: " + arr.length);

		int i = 0;
		while (i <= arr.length - 1) {
			System.out.println(arr[i] + " - " + st.indexOf(arr[i]));
			i++;
		}

		Stringy.isPalindrom();

	}

	public static boolean isPalindrom() {
		String st = "ABCDCBA";

		char[] arr = st.toCharArray();
		int i = 0;
		int j = arr.length - 1;
		while (j > i) {
			if (arr[i] != arr[j]) {
				return false;
			}
			++i;
			--j;
		}
		return true;
	}

}
