package bt5ver2;

public class Director {
	IShapeBuilder builder;
	Director(IShapeBuilder builder){
		this.builder = builder;
	}
	void changeBuilder(IShapeBuilder builder) {
		this.builder = builder;
	}
	void make(String type) {
		builder.Reset();
		if(type=="Circle") {
			
			builder.BuildRadius();
		
		}
		else if(type=="Rectangle") {
			builder.BuildLength();
			builder.BuildWidth();
		}
	}
}
