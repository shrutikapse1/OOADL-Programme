package i2.logic;

public class Triangle extends Shape {
	private double base;
	private double height;
	private double area;
	private double perimeter;

	public Triangle(String outlineColour, String fillColour, double base, double height) {
		super(outlineColour, fillColour);
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return this.base;
	}

	public double getHeight() {
		return this.height;
	}

	public double calculateAreaOfTriangle() {
		area = 0.5 * base * height;
		return area;
	}

	public double calculatePerimeterOfTriangle() {
		perimeter = 3 * base;
		return perimeter;
	}

	public void displayTriangleDetails() {
		System.out.println("\t::Triangle::");
		System.out.println("===========================================");
		super.displayShapeDetails();
		System.out.println("Area Of Triangle     :" + calculateAreaOfTriangle());
		System.out.println("Perimeter Of Triangle:" + calculatePerimeterOfTriangle());
		System.out.println("===========================================");
	}

}
