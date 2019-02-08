package Quiz;

public class Square {
	public Square(int w) {
		super();
		this.w = w;
	}

	public int w;

	public int area;
	public int perimeter;
	
	public Square() {
		super();
	}

	public int calculateSurface(int h) {
		// TODO Auto-generated method stub

		area = h * 4;
		return area;

	}

	public int calculatePerimeter(int h) {
		// TODO Auto-generated method stub

		perimeter = h * 4;

		return perimeter;
	}

	{

		calculateSurface(2);
		calculatePerimeter(3);

	}

}
