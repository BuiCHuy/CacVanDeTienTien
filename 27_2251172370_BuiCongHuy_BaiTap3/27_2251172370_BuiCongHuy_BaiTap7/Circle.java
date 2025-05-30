package bt7ver2;

public class Circle implements Shape {
	private double radius;
	Circle(double r){
		radius = r;
	}
	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return radius*radius*Math.PI;
	}

	@Override
	public double CalculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*radius*Math.PI;
	}

}
