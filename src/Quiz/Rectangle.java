package Quiz;

public class Rectangle {
	public Rectangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}

	public int w;
	public int h;
	public int area;
	public int perimeter;
	
	public Rectangle() {
		super();
	}

	public int calculateSurface(int h, int w) {
		// TODO Auto-generated method stub

		area = h * w;
		return area;

	}

	public int calculatePerimeter(int h, int w ) {
		// TODO Auto-generated method stub

		perimeter = (2 * h) + (2 * w);

		return perimeter;
	}

	{

		calculateSurface(2, 3);
		calculatePerimeter(2, 3);

	}
}
