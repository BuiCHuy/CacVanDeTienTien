package bt6ver2;



public class Circle implements Shape{
	double Radius;
	public Circle(double r) {
		Radius = r;
	}
	public Circle() {
		System.out.println("Hinh tron da duoc tao");
	}
	@Override
	public double CalculateArea() {
		
		return Radius*Radius*Math.PI;
	}
	
}
