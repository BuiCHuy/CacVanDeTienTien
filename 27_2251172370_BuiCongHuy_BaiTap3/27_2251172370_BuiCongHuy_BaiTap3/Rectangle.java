package dp_b3;

public class Rectangle implements Shape{
	double Length,Width;
	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return Length*Width;
	}
	public Rectangle(double l,double w) {
		Length = l;
		Width = w;
	}
}
