package bt8;

public class Rectangle extends Shape {
	public double length,width;
	public Rectangle(double l,double w) {
		length = l;
		width = w;
	}
	public void CalculateRectangleArea() {
		m.notify(this);
	}
}
