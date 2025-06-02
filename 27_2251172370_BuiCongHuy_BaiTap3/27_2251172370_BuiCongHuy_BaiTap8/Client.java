package bt8;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(3);
		Rectangle rectangle = new Rectangle(4,3);
		ShapeMediator mediator = new ShapeMediator();
		mediator.circle = circle;
		mediator.rectangle = rectangle;
		circle.SetMediator(mediator);
		rectangle.SetMediator(mediator);
		circle.CalculateCircleArea();
		rectangle.CalculateRectangleArea();
	}

}
