package AbstractionsExamples;

public abstract class Number21Employee {
	
    private String name;
    private int paymentPerHour;
    
	public Number21Employee(String name, int paymentPerHour) {
		super();
		this.name = name;
		this.paymentPerHour = paymentPerHour;
	}
	
    public abstract int calculateSalary();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPaymentPerHour() {
		return paymentPerHour;
	}

	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}

   


    

}
