package bt6ver2;

public class Rectangle implements Shape{
	double Length,Width;
	public Rectangle(double l,double w) {
		Length = l;
		Width = w;
	}
	public Rectangle() {
		System.out.println("Hinh chu nhat da duoc tao");
	}
	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return Length*Width;
	}
}
