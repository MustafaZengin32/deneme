package AbstractionsExamples;

public class Number17FullTimeEmployee extends Number17Employee {

	public Number17FullTimeEmployee(String name, int paymentPerHour) {
		super(name, paymentPerHour);
		
	}

	@Override
	public int calculateSalary() {
		return getPaymentPerHour() * 8;
	}
	
	

}
