package AbstractionsExamples;

public class Number20Bisleri extends Number20WaterCan {
	
	 double h;
	 double d;
	@Override
	public double setDimensions(double height, double diameter) {
		  h = height*1.2;
		  d = diameter;
		  //System.out.println(h + " "+  d);
        return h*d;
		
	}

	 
	 

}
