package dp_bt4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory c = new CircleSphereFactory();
		c.Create2DShape();
		c.Create3DShape();
		ShapeFactory r = new RectangleRectangularFactory();
		r.Create2DShape();
		r.Create3DShape();
	}

}
