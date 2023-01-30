package AbstractionsExamples;

public class Number8Circle extends Number8Shape {
	
	double radius;
	
	public Number8Circle(String color, double d) {
		super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;

	}

	
	
	

	@Override
	double area() {
        return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle color is " + super.getColor()
        + "and area is : " + area();

	}

}
