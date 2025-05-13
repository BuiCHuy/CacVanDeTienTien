package dp_b3;

public class AreaCalculator {
	public double CalculateTotalArea(Shape[] shapes) {
		double total = 0;
		for(Shape s: shapes) {
			total = total+ s.CalculateArea();
		}
		return total;
	}
}
