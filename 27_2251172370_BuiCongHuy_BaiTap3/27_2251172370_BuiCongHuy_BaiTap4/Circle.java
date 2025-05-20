package dp_bt4;

public class Circle implements _2DShape {
	double Radius;
	public Circle(double r) {
		Radius = r;
	}
	public Circle() {
		System.out.println("Circle da duoc tao");
	}
	@Override
	public double CalculateArea() {
		
		return Radius*Radius*Math.PI;
	}
	
}
