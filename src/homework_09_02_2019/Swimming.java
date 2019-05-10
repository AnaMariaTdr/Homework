package homework_09_02_2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Swimming extends Hobby{
	
	private final static String name = "Swimming";
	private final static String freqvency = "3/week";
	private static List<String> address = new ArrayList<>(Arrays.asList("Swimming Pool","Sea"));
	
	
	@Override
	public String toString() {
		return "Swimming [hobbyName=" + name + ", freqvency=" + freqvency + ", address=" + address +"]";
	}
	
	

}
