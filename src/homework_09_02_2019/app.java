package homework_09_02_2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class app {

	private static final List<Hobby> hobby1 = new ArrayList<>(Arrays.asList(new Swimming(), new Driving()));
	private static final List<Hobby> hobby2 = new ArrayList<>(
			Arrays.asList(new Swimming(), new Driving(), new Snowboarding(), new Cycling()));
	private static final List<Hobby> hobby3 = new ArrayList<>(Arrays.asList(new Swimming(), new Snowboarding()));
	private static final List<Hobby> hobby4 = new ArrayList<>(Arrays.asList(new Snowboarding(), new Cycling()));
	private static final List<Hobby> hobby5 = new ArrayList<>(Arrays.asList(new Snowboarding()));

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Person, List<Hobby>> list = new HashMap<>();
		list.put(new Person("Florin"), hobby1);
		list.put(new Person("Gheorghe"), hobby2);
		list.put(new Person("Vasile"), hobby3);
		list.put(new Person("Maria"), hobby4);
		list.put(new Person("Ana"), hobby5);

		BiConsumer<Person, List<Hobby>> consumer = (o1, o2) -> System.out.println(o1 + ", " + o2);

		list.forEach(consumer);
	}

}
