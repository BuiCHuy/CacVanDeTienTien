package bt6ver2;

public class TriangleAdapter implements Shape{
	Triangle triangle;
	public TriangleAdapter(Triangle t){
		triangle = t;
	}
	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return triangle.getArea();
	}
	
}
