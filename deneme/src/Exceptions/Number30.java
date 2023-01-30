package Exceptions;

public class Number30 {
	public static void main(String[] args) {
		// try catch blogundaki e nin gorevi 
		
		int sayi1=10;
		int sayi2=0;
		
		
		try {
		System.out.println(sayi1/sayi2);
		} catch (ArithmeticException e) { // int a, String str, Object obj1 gibi...
		
			System.out.println("sayiyi sifira bolemezsin"); // bizim kullaniciya vermek istedigimiz mesaj
			System.out.println(e); // java.lang.ArithmeticException: / by zero
		
			System.out.println(e.getMessage()); // / by zero

			e.printStackTrace(); 
			
		}
		
		System.out.println("Kod bloke olmamisssss");
	}
	

}
