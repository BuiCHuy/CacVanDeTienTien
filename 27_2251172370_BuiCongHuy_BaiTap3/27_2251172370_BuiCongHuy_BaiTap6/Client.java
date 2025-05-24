package bt6;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(3);
		Rectangle r = new Rectangle(5,4);
		CircleAdapter ca = new CircleAdapter(c);
		RectangleAdapter ra = new RectangleAdapter(r);
		System.out.println("Area of circle c: "+ca.AreaCalculate());
		System.out.println("Area of rectangle r: "+ra.AreaCalculate());
	}

}
