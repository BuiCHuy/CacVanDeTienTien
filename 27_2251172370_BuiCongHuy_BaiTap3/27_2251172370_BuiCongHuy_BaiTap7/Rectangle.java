package bt7ver2;

public class Rectangle implements Shape{
	private double length,width;
	Rectangle(double l,double w){
		length = l;
		width = w;
	}
	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return length*width;
	}
	@Override
	public double CalculatePerimeter() {
		// TODO Auto-generated method stub
		return (length+width)*2;
	}
	
}
