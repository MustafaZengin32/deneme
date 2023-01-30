package AbstractionsExamples;

public class Number17Demo {

	public static void main(String[] args) {
		
		Number17Employee s;
		
	    s=new Number17Contractor("Cont", 10, 10);
		
		System.out.println(s.calculateSalary());
		
		
		
		s=new Number17FullTimeEmployee("Full", 5);
		
		System.out.println(s.calculateSalary());
		
		

	}

}
