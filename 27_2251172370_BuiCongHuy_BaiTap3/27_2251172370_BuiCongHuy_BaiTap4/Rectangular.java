package dp_bt4;

public class Rectangular implements _3DShape {
	double Length;
	double Heigth;
	double Width;
	public Rectangular(double l,double h,double w){
		Length = l;
		Heigth = h;
		Width = w;
	}
	public Rectangular() {
		System.out.println("Rectangular da duoc tao");
	}
	@Override
	public double CalculateVolumn() {
		// TODO Auto-generated method stub
		return Length*Heigth*Width;
	}
	
}
