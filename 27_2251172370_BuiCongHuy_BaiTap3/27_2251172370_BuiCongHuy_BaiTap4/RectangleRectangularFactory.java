package dp_bt4;

public class RectangleRectangularFactory implements ShapeFactory{
	@Override
	public _2DShape Create2DShape() {
		// TODO Auto-generated method stub
		return new Rectangle();
	}

	@Override
	public _3DShape Create3DShape() {
		// TODO Auto-generated method stub
		return new Rectangular();
	}
	
}
