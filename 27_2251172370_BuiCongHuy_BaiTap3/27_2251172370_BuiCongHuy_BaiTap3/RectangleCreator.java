package dp_b3;

public class RectangleCreator extends ShapeCreator{
	double length,width;
	public RectangleCreator(double l,double w) {
		length = l;
		width = w;
	}
	@Override
	public Shape CreateShape() {
		// TODO Auto-generated method stub
		return new Rectangle(length,width);
	}
	
	@Override
	public double CalArea() {
		// TODO Auto-generated method stub
		return CreateShape().CalculateArea();
	}
	
}
