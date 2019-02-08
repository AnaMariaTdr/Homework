package Quiz;

public class Triangle {

	public Triangle(int l, int h) {
		super();
		this.l = l;
		this.h = h;
	}

	public int l;
	public int h;
	public int area;
	public int perimeter;

	public Triangle() {
		super();
	}

	public int calculateSurface(int h, int l) {
		// TODO Auto-generated method stub

		area = (1 / 2) * h * l;
		return area;

	}

	public int calculatePerimeter(int l) {
		// TODO Auto-generated method stub

		perimeter = 3 * l;

		return perimeter;
	}

	{

		calculateSurface(2, 3);
		calculatePerimeter(3);

	}

}
