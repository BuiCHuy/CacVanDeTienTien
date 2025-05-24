package bt6;

public class Rectangle {
	private double Length,Width;
	public Rectangle(double l,double w) {
		Length = l;
		Width= w;
	}
	public double RectangleAreaCalculate() {
		return Length*Width;
	}
}
