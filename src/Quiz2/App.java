package Quiz2;

import java.util.LinkedHashSet;

public class App {
	static LinkedHashSet<Rectangle> rectangleSet = new LinkedHashSet<>();
	static LinkedHashSet<Triangle> triangleSet = new LinkedHashSet<>();
	static LinkedHashSet<Square> squareSet = new LinkedHashSet<>();
	static LinkedHashSet<Circle> circleSet = new LinkedHashSet<>();

	public static void main(String[] args) {

		addRectangle();
		addTriangle();
		addSquare();
		addCircle();

	}

	static void iterateRectangle() {

		rectangleSet.iterator();

	}

	static void iterateTriangle() {
		triangleSet.iterator();

	}

	static void iterateSquare() {
		squareSet.iterator();

	}

	static void iterateCircle() {

		circleSet.iterator();

	}

	static void addRectangle() {
		int a = 0;
		int b = 0;

		rectangleSet.add(new Rectangle(a, b));

	}

	static void addTriangle() {

		triangleSet.add(new Triangle(12, 12, 42, 12));
	}

	static void addSquare() {

		squareSet.add(new Square(12));

	}

	static void addCircle() {

		circleSet.add(new Circle(12));

	}

}
