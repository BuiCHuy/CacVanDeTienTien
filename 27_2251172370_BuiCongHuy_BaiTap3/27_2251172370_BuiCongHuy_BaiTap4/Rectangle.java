package dp_bt4;

public class Rectangle implements _2DShape{
	double Length,Width;
	public Rectangle(double l,double w) {
		Length = l;
		Width = w;
	}
	public Rectangle() {
		System.out.println("Rectangle da duoc tao");
	}
	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return Length*Width;
	}
}
