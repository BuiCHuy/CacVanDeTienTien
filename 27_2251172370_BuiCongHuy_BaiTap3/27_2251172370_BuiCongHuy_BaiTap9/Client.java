package bt9;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context c = new Context();
		c.setStrategy(new RectangleStrategy(4,3));
		System.out.println("Rectangle Area: "+c.getArea());
		c.setStrategy(new CircleStrategy(3));
		System.out.println("Circle Area: "+c.getArea());
	}

}
