package dp_b3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = {
			new CircleCreator(3).CreateShape(),
			new CircleCreator(4).CreateShape(),
			new RectangleCreator(2,3).CreateShape(),
		};
		AreaCalculator cal = new AreaCalculator();
		
		System.out.println("Tong dien tich: "+cal.CalculateTotalArea(shapes));
	}

}
