package dp_bt4;

public class Sphere implements _3DShape{
	double Radius;
	public Sphere(double Radius){
		this.Radius = Radius;
	}
	public Sphere() {
		System.out.println("Sphere da duoc tao");
	}
	@Override
	public double CalculateVolumn() {
		// TODO Auto-generated method stub
		return (4/3)*Math.PI*Radius*Radius*Radius;
	}
	
}
