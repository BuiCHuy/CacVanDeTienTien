package bt6;

public class Circle {
	private double Radius;
	public Circle(double r){
		Radius = r;
	}
	public double CircleAreaCalculate() {
		return Radius*Radius*Math.PI;
	}
}
