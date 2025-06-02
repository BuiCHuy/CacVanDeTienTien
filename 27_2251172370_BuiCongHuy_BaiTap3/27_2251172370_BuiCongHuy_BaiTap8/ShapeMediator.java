package bt8;

public class ShapeMediator implements Mediator{
	Circle circle;
	Rectangle rectangle;
	@Override
	public void notify(Shape Sender) {
		// TODO Auto-generated method stub
		if(Sender == circle) {
			System.out.println("Area of circle: "+ circle.radius*circle.radius*Math.PI);
		}
		else if(Sender == rectangle) {
			System.out.println("Area of rectangle: "+ rectangle.length*rectangle.width);
		}
	}

}
