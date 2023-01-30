package AbstractionsExamples;

public class Number12Person extends Number12Identity {
	

	@Override
	void getName(String name) {
	    System.out.println("Name : " +name); 
		
	}

	@Override
	void getGender(String gender) {
		System.out.println("Gender : " +gender); 
		
	}

	@Override
	void getCity(String city) {
		  System.out.println("City: " +city); 
		
	}
	
	


	

}
