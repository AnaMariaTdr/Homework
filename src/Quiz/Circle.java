package Quiz;

public class Circle {
	public Circle(int r) {
		super();
		this.r = r;
	}

	public int r;
	public final double pi = 3.1415926535897932384;

	public int area;
	public int perimeter;



	public double calculateSurface(int h) {
		// TODO Auto-generated method stub

		area = (int) pi * r;
		return area;

	}

	public int calculatePerimeter(int h) {
		// TODO Auto-generated method stub

		perimeter = (int) (2 * pi) * r;

		return perimeter;
	}

	{

		calculateSurface(2);
		calculatePerimeter(3);

	}

}
