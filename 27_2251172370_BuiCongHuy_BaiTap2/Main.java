package ht3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = {
			new Circle(3),
			new Circle(5),
			new Rectangle(4,3),
			new Rectangle(2,3)
		};
		AreaCalculator total = new AreaCalculator();
		System.out.println("Tong dien tich = "+total.CalculateTotalArea(shapes));
	}

}
