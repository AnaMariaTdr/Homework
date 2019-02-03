package Quiz2;

public class Square implements Interface_Math{
	
	public int AB;
	public int area; 
	public int perimeter;
	
	
	
	

	@Override
	public String toString() {
		return "Square [AB=" + AB + ", area=" + area + ", perimeter=" + perimeter + "]";
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

	public Square(int aB) {
		super();
		AB = aB;
	}

	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		area = 4*AB;
		return area;
	}

	@Override
	public int calculatePerimeter() {
		// TODO Auto-generated method stub
		perimeter = AB*AB;
		return perimeter;
	} 

}
