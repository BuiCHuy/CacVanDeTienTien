package dp_b3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeCreator c1 = new CircleCreator(3);
		ShapeCreator r1 = new RectangleCreator(3,4);
		
		System.out.println("Cỉrcle: "+c1.CalArea());
		System.out.println("Rectangle: "+r1.CalArea());
	}

}
