package homework_09_02_2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driving extends Hobby {
	private final static String name = "Driving";
	private final static String freqvency = "Eeveryday";
	private static List<String> address = new ArrayList<>(Arrays.asList("Everywhere"));
	
	@Override
	public String toString() {
		return "Driving [hobbyName=" + name + ", freqvency=" + freqvency + ", address=" + address +"]";
	}
	
}
