package dp_b3;

public class CircleCreator extends ShapeCreator{
	double radius;
	public CircleCreator(double r){
		radius = r;
	}
	@Override
	public Shape CreateShape() {
		// TODO Auto-generated method stub
		return new Circle(radius);
	}
	
	@Override
	public double CalArea() {
		// TODO Auto-generated method stub
		return CreateShape().CalculateArea();
	}
	
}
