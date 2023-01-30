package AbstractionsExamples;

public class Number6TestBank {
	
	public static void main(String[] args) {
		
		Number6Bank b=new Number6SBI();
		b.getRateOfInterest();
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
		
		Number6Bank b1=new Number6PNB();
		b1.getRateOfInterest();
		System.out.println("Rate of Interest is: "+b1.getRateOfInterest()+" %");    
	}

}
