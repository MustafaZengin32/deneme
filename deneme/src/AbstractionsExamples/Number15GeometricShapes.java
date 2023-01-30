package AbstractionsExamples;

public abstract class Number15GeometricShapes {
	
	String nameOfShape;
	
    abstract double calculateArea();
	 
	public abstract String toString();

	public Number15GeometricShapes(String nameOfShape) {
		super();
	    System.out.println("Inside the Constructor of GeometricShapes class ");
		this.nameOfShape = nameOfShape;
	}

	public String getNameOfShape() {
		return nameOfShape;
	}

	
    
	
	
	

}
