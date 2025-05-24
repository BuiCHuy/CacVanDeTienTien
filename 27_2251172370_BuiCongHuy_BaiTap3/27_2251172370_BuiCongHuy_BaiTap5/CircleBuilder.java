package bt5ver2;

public class CircleBuilder implements IShapeBuilder {
	Circle c = new Circle();

	@Override
	public void Reset() {
		// TODO Auto-generated method stub
		c = new Circle();
	}

	@Override
	public void BuildRadius() {
		// TODO Auto-generated method stub
		c.setRadius(3);
	}

	@Override
	public void BuildLength() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BuildWidth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BuildType() {
		// TODO Auto-generated method stub
		c.type = "Circle";
	}

	
	

}
