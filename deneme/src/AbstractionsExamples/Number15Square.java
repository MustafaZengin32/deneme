package AbstractionsExamples;

public class Number15Square extends Number15GeometricShapes {
	
	double length;
	
	

	public Number15Square(String nameOfShape, double length) {
		super(nameOfShape);
	    System.out.println("Inside the Constructor of Square class ");
		this.length = length;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Name of the Shape is " + super.nameOfShape +
		        " and its area is: " + calculateArea();

	}
	  
	  
}
