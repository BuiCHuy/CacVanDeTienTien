package bt6ver2;

public class Triangle {
	double Base, Height;
	public Triangle(double b,double h) {
		Base = b;
		Height = h;
	}
	public Triangle() {
		System.out.println("Hinh tam giac da duoc tao");
	}
	public double getArea() {
		return 0.5*Base*Height;
	}
}
