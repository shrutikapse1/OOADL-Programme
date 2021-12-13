package i2.logic;

public class Circle extends Shape {
	private double radius;
	private double area;
	private double perimeter;

	public Circle(String outlineColour, String fillColour, double radius) {
		super(outlineColour, fillColour);
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public double calculateAreaOfCircle() {
		area = 3.142 * radius * radius;
		return area;
	}

	public double calculatePerimeterOfCircle() {
		perimeter = 2 * 3.142 * radius;
		return perimeter;
	}

	public void displayCircleDetails() {
		System.out.println("\t::Circle::");
		System.out.println("===========================================");
		super.displayShapeDetails();
		System.out.println("Area Of Circle\t   :" + calculateAreaOfCircle());
		System.out.println("Perimeter Of Circle:" + calculatePerimeterOfCircle());
		System.out.println("===========================================");
	}
}
