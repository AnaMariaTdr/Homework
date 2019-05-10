package homework_09_02_2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cycling extends Hobby {
	private final static String name = "Cycling";
	private final static String freqvency = "6/week";
	private static List<String> address = new ArrayList<>(Arrays.asList("Everywhere"));

	@Override
	public String toString() {
		return "Cycling [hobbyName=" + name + ", freqvency=" + freqvency + ", address=" + address +"]";
	}
	
}
