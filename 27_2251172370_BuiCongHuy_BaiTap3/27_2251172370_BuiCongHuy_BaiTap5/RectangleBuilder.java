package bt5ver2;

public class RectangleBuilder implements IShapeBuilder {
	Rectangle s = new Rectangle();

	@Override
	public void Reset() {
		// TODO Auto-generated method stub
		s = new Rectangle();
	}


	@Override
	public void BuildRadius() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BuildLength() {
		// TODO Auto-generated method stub
		s.setLength(3);
	}

	@Override
	public void BuildWidth() {
		// TODO Auto-generated method stub
		s.setWidth(2);
	}


	@Override
	public void BuildType() {
		// TODO Auto-generated method stub
		s.type = "Rectangle";
	}

}
