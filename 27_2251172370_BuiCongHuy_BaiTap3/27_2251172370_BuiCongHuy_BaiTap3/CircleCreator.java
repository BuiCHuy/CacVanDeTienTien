package dp_b3;

public class CircleCreator extends ShapeCreator{
	double radius;
	@Override
	public Shape CreateShape() {
		// TODO Auto-generated method stub
		return new Circle(radius);
	}
	public CircleCreator(double r){
		radius = r;
	}
}
