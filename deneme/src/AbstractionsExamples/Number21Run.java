package AbstractionsExamples;

public class Number21Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Number21Employee s=new Number21Contractor("Ali",10);
		System.out.println(s.calculateSalary());
		
		Number21Employee s1=new Number21FullTimeEmployee("Ahmet",8);
		System.out.println(s1.calculateSalary());
		

	}

}
