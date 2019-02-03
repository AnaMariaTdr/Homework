package Quiz2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.util.LinkedHashSet;

import org.junit.Test;

public class Test_Math {

	@Test
	public void addRectangleTest() {
		LinkedHashSet<Rectangle> rectangleSet = new LinkedHashSet<>();

		rectangleSet.add(new Rectangle(12, 12));

	}

	@Test
	public void addDublicateRectangleTest() {
		LinkedHashSet<Rectangle> rectangleSet = new LinkedHashSet<>();

		rectangleSet.add(new Rectangle(12, 12));
		rectangleSet.add(new Rectangle(12, 12));

		assertFalse((rectangleSet.add(new Rectangle(12, 12))==(rectangleSet.add(new Rectangle(12, 12)))));
	}

}
