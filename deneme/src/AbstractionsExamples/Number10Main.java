package AbstractionsExamples;

public class Number10Main {

	public static void main(String[] args) {
		
		Number10Bank b = new Number10Citi();
		System.out.println("Citi Rate of Interest is: "+b.getInterestRate()+"%");    
		
		Number10Bank b1 = new Number10Hsbc();
		System.out.println("Citi Rate of Interest is: "+b1.getInterestRate()+"%");  

	}

}
