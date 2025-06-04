package bt9;

public class Context {
	Strategy s ;
	void setStrategy(Strategy strategy) {
		s = strategy;
	}
	double getArea() {
		return s.CalculateArea();
	}
}
