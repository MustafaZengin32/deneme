package AbstractionsExamples;

public class Number21FullTimeEmployee extends Number21Employee{

	public Number21FullTimeEmployee(String name, int paymentPerHour) {
		super(name, paymentPerHour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
        return getPaymentPerHour() * 8;
	}
	

}
