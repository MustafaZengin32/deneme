package AbstractionsExamples;

public class Number15Circle extends Number15GeometricShapes {
	
	  double radius;

	  
	  
	public Number15Circle(String nameOfShape, double radius) {
		super(nameOfShape);
	    System.out.println("Inside the Constructor of Circle class ");
		this.radius = radius;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		 return "Name of the shape is " + super.nameOfShape +
			        " and its area is: " + calculateArea();

	}
	

}
