package Quiz;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_notgood {

	@org.junit.Test
	public void testCalculateSurfaceRectangle() {
		Rectangle r = new Rectangle();
		int h = 2, w = 3;
		int area = h * w;

		assertEquals(area, r.calculateSurface(h, w));

	}

	@org.junit.Test
	public void testCalculatePerimeterRectangle() {
		Rectangle r = new Rectangle();
		int h = 2, w = 3;

		int perimeter = (2 * h) + (2 * w);

		assertEquals(perimeter, r.perimeter);

	}

	@org.junit.Test
	public void testCalculateSurfaceSquare() {
		Square s = new Square();
		int h = 2;
		int area = h * 2;

		assertEquals(area, s.area);

	}

	@org.junit.Test
	public void testCalculatePerimeterSquare() {
		Square s = new Square();
		int h = 2;
		int perimeter = h * 2;

		assertEquals(perimeter, s.perimeter);

	}

	@org.junit.Test
	public void testCalculateSurfaceCircle() {
		Circle c = new Circle();
		int h = 2;
		double pi = 3.1415926535897932384;
		int area = (int) pi * h;

		assertEquals(area, c.area);

	}

	@org.junit.Test
	public void testCalculatePerimeterCircle() {
		Circle c = new Circle();
		int h = 2;
		double pi = 3.1415926535897932384;
		int perimeter = (int) (2 * pi) * h;

		assertEquals(perimeter, c.perimeter);

	}

	@org.junit.Test
	public void testCalculateSurfaceTriangle() {
		Triangle t = new Triangle();
		int h = 2, w = 3;
		int area = (1 / 2) * h * w;

		assertEquals(area, t.area);

	}

	@org.junit.Test
	public void testCalculatePerimeterTriangle() {
		Triangle t = new Triangle();
		int w = 3;

		int perimeter = 3 * w;

		assertEquals(perimeter, t.perimeter);

	}

}
