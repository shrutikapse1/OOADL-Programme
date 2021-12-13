package i2.client;
import i2.logic.Circle;
import i2.logic.Rectangle;
import i2.logic.Triangle;
public class TesterMain {
	public static void main(String[] args) {
        Circle c=new Circle("Red","Pink",4);
        Rectangle r=new Rectangle("Black","Blue",7.5,7);
        Triangle t = new Triangle("Yellow","Grey",4.5,8);
        c.displayCircleDetails();
        r.displayRectangleDetails();
        t.displayTriangleDetails();
	}
}
