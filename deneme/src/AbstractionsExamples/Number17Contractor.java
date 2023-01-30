package AbstractionsExamples;

public class Number17Contractor extends Number17Employee{
	
    private int workingHours;
    
    

	public Number17Contractor(String name, int paymentPerHour, int workingHours) {
		super(name, paymentPerHour);
		this.workingHours = workingHours;
	}



	@Override
	public int calculateSalary() {
        return getPaymentPerHour() * workingHours;
	}
	
	
	

}
