package bt6ver2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(3,2);
		Circle circle = new Circle(3);
		TriangleAdapter adapter = new TriangleAdapter(new Triangle(3,5));
		System.out.println("Dien tich hinh chu nhat: "+rectangle.CalculateArea());
		System.out.println("Dien tich hinh tron: "+circle.CalculateArea());
		System.out.println("Dien tich hinh tam giac: "+adapter.CalculateArea());
	}

}
