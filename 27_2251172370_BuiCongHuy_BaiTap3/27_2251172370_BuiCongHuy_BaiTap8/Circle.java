package bt8;

public class Circle extends Shape{
	public double radius;
	public Circle(double r) {
		radius = r;
	}
	public void CalculateCircleArea() {
		m.notify(this);
	}
}
