package bt7ver2;

public class ShapeManager {
	private Shape shape;
	ShapeManager(Shape s){
		shape = s;
	}
	public double GetArea() {
		return shape.CalculateArea();
	}
	public double GetPerimeter() {
		return shape.CalculatePerimeter();
	}
}
