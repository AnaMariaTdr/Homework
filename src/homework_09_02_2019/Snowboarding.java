package homework_09_02_2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Snowboarding extends Hobby {
	private final static String name = "Snowboard";
	private final static String freqvency = "3/week";
	private static List<String> address = new ArrayList<>(Arrays.asList("Mountain side, winter"));
	
	
	@Override
	public String toString() {
		return "Snowboarding [hobbyName=" + name + ", freqvency=" + freqvency + ", address=" + address +"]";
	}
	
	
}
