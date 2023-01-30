package AbstractionsExamples;

public abstract class Number16TwoDShape {
	
	private double length;
    private double width;
    
    public Number16TwoDShape(double length, double width) {
       this.length = length; 
       this.width = width;    
     }
    // Declaring abstract method
    public abstract void draw();
    // Defining concrete method
    public double getArea() { 
      return length*width; 
    } 


}
