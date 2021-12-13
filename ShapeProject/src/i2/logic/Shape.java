package i2.logic;

public class Shape {
	private String outlineColour;
	private String fillColour;

	public Shape(String outlineColour, String fillColour) {
		this.fillColour = fillColour;
		this.outlineColour = outlineColour;
	}

	public String getOutlineColour() {
		return this.outlineColour;
	}

	public String getFillColour() {
		return this.fillColour;
	}

	public void displayShapeDetails() {
		System.out.println("Outline Colour\t   :" + this.outlineColour);
		System.out.println("Fill Colour   \t   :" + this.fillColour);
	}
}
