package AbstractionsExamples;

public abstract class Number8Shape {
	
	
	
    String color;
    
    abstract double area();
   
    public abstract String toString();

	public Number8Shape(String color) {
		super();
		System.out.println("Shape constructor called");
		this.color = color;
	}
    
	public String getColor() {
		return color;
	}
    
    
    


}
