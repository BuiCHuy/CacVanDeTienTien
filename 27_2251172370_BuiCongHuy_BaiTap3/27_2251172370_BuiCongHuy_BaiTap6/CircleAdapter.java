package bt6;

public class CircleAdapter implements IShape{
	private Circle adaptee;
	public CircleAdapter(Circle c){
		adaptee = c;
	}
	@Override
	public double AreaCalculate() {
		// TODO Auto-generated method stub
		return adaptee.CircleAreaCalculate();
	}

}
