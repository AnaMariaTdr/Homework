package Quiz2;

public class Triangle implements Interface_Math{

	private int AB;
	private int BC;
	private int AC;
	private int AD;
	private int area; 
	private int perimeter;
	public Triangle(int aB, int bC, int aC, int aD) {
		super();
		AB = aB;
		BC = bC;
		AC = aC;
		AD = aD;
	}


	public int getAB() {
		return AB;
	}

	public void setAB(int aB) {
		AB = aB;
	}

	public int getBC() {
		return BC;
	}

	public void setBC(int bC) {
		BC = bC;
	}

	public int getAC() {
		return AC;
	}

	public void setAC(int aC) {
		AC = aC;
	}

	public int getAD() {
		return AD;
	}

	public void setAD(int aD) {
		AD = aD;
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
		area = 1/2 *(BC*AD);
		return area;
	}

	@Override
	public int calculatePerimeter() {
		// TODO Auto-generated method stub
		perimeter = AB+BC+AC;
		return perimeter;
	} 
	
	
	
}
