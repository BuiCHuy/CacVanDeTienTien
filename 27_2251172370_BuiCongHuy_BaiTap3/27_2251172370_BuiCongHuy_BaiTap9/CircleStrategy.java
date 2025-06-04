package bt9;

public class CircleStrategy implements Strategy{
	double radius;
	CircleStrategy(double r){
		radius = r;
	}
	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return radius*radius*Math.PI;
	}
	
}
