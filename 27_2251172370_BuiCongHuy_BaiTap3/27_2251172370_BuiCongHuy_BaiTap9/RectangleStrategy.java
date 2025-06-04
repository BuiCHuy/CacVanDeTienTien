package bt9;

public class RectangleStrategy implements Strategy{
	double length,width;
	RectangleStrategy(double l,double w){
		length = l;
		width = w;
	}
	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return length*width;
	}

}
