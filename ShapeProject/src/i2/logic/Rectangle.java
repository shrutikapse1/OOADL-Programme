package i2.logic;

public class Rectangle extends Shape {
	private double length;
	private double breadth;
	private double area;
	private double perimeter;

	public Rectangle(String outlineColour, String fillColour, double length, double breadth) {
		super(outlineColour, fillColour);
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return this.length;
	}

	public double getBreadth() {
		return this.breadth;
	}

	public double calculateAreaOfRectangle() {
		area = length * breadth;
		return area;
	}

	public double calculatePerimeterOfRectangle() {
		perimeter = 2 * (length + breadth);
		return perimeter;
	}

	public void displayRectangleDetails() {
		System.out.println("\t::Rectangle::");
		System.out.println("===========================================");
		super.displayShapeDetails();
		System.out.println("Area Of Rectangle     :" + calculateAreaOfRectangle());
		System.out.println("Perimeter Of Rectangle:" + calculatePerimeterOfRectangle());
		System.out.println("===========================================");
	}
}
