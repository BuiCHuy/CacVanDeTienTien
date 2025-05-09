package ht3;

public class AreaCalculator {
	public double CalculateTotalArea(Shape[] shapes) {
		double total=0;
		for(Shape shape : shapes) {
			total = total+shape.CalculateArea();
		}
		return total;
	}
}
