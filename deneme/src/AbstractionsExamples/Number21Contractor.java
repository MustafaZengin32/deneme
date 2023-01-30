package AbstractionsExamples;

public class Number21Contractor extends Number21Employee {
	
	public Number21Contractor(String name, int paymentPerHour) {
		super(name, paymentPerHour);
		// TODO Auto-generated constructor stub
	}

	private int workingHours=10;

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return getPaymentPerHour() * workingHours;
		}
	

}
