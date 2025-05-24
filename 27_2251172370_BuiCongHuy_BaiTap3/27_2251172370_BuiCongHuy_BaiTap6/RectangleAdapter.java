package bt6;

public class RectangleAdapter implements IShape{
	private Rectangle adaptee;
	public RectangleAdapter(Rectangle r) {
		adaptee = r;
	}
	@Override
	public double AreaCalculate() {
		// TODO Auto-generated method stub
		return adaptee.RectangleAreaCalculate();
	}

}
