package ht3;

public class Circle extends Shape {

	private double Radius;
	public Circle (double Radius) {
		this.Radius = Radius;
	}
	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return Math.floor(Radius)*Math.PI;
	}
	
}
