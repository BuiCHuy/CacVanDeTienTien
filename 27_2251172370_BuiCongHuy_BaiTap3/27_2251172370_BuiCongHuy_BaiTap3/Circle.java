package dp_b3;

public class Circle implements Shape{
	double Radius;

	@Override
	public double CalculateArea() {
		
		return Radius*Radius*Math.PI;
	}
	public Circle(double r) {
		Radius = r;
	}

}
