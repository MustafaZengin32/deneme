package AbstractionsExamples;

public class Number20Himalaya extends Number20WaterCan {
	
	double h;
	double d;
	@Override
	public double setDimensions(double height, double diameter) {
		h = height * 1.5;
		d = diameter * 0.1;
		return h*d;

		
		
	}

	 
	 
	

}
