package bt7ver2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeManager manager1 = new ShapeManager(new Circle(3));
		System.out.println("Area of Circle: "+ manager1.GetArea());
		System.out.println("Perimeter of Circle: "+ manager1.GetPerimeter());
		ShapeManager manager2 = new ShapeManager(new Rectangle(4,3));
		System.out.println("Area of Rectangle: "+ manager2.GetArea());
		System.out.println("Perimeter of Rectangle: "+ manager2.GetPerimeter());
	}

}
