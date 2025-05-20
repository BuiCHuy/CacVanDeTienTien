package dp_bt4;

public class CircleSphereFactory implements ShapeFactory  {
	@Override
	public _2DShape Create2DShape() {
		// TODO Auto-generated method stub
		return new Circle();
	}

	@Override
	public _3DShape Create3DShape() {
		// TODO Auto-generated method stub
		return new Sphere();
	}

}
