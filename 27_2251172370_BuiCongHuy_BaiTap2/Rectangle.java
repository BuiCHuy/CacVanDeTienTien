package ht3;

public class Rectangle extends Shape {
	private double Length,Width;
	public Rectangle(double Length,double Width) {
		this.Length = Length;
		this.Width = Width;
	}
	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return Length*Width;
	}
	
}
