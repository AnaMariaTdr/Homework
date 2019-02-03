package Quiz2;

public class Rectangle implements Interface_Math {
	private int AB;
	private int CD;
	private int area;
	private int perimeter;

	public Rectangle(int aB, int cD) {
		super();
		AB = aB;
		CD = cD;
	}

	public int getAB() {
		return AB;
	}

	public void setAB(int aB) {
		AB = aB;
	}

	public int getCD() {
		return CD;
	}

	public void setCD(int cD) {
		CD = cD;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}

	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		area = AB + CD;

		return area;
	}

	@Override
	public int calculatePerimeter() {
		// TODO Auto-generated method stub
		perimeter = (2 * AB) + (2 * CD);
		return perimeter;
	}

}
