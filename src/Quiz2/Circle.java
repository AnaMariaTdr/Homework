package Quiz2;

public class Circle implements Interface_Math {

	private int r;
	private int area;
	private int perimeter;
	
	

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

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public Circle(int r) {
		super();
		this.r = r;
	}

	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub

		area = (int) ((2 * Pi) * r);
		return area;
	}

	@Override
	public int calculatePerimeter() {
		perimeter = (int) (Pi * Math.pow(r, 2));
		return perimeter;
	}

}
