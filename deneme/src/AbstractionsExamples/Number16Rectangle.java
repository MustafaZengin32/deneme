package AbstractionsExamples;

public class Number16Rectangle extends Number16TwoDShape {

	
	
	
	public Number16Rectangle(double length, double width) {
		super(length, width);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
	       System.out.println("Drawing Rectangle"); 
		
	}
	
	public static void main (String args[]) {
	       // TwoDShape object referring to rectangle.
	       Number16TwoDShape rect = new Number16Rectangle(10,10);
	       rect.draw(); 
	       System.out.println("Area of given rectangle = "+rect.getArea());
	    }

	
	

}
