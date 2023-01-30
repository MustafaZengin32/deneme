package Exceptions;

public class Number1ArithmeticException {
	public static void main(String[] args) {

       divide(6,2);//3
       divide(0,2);//0
       divide(6,0);//Bir sayi sifir ile bolunemez

        divide2(5,1);//5
        divide2(12,0);//hi exception//bye exception//Bolme isleminde bir problem olustu==>/ by zero
    }

        // 1. Yol Tavsiye edilmez.
    // Bir developer icin tüm matematik kurallarini ezbere bilmek mumkun degildir.

    public static void divide (int a, int b){
    if(b==0){
    System.out.println("Bir sayi sifir ile bolunemez"); }
    else { System.out.println(a/b); } }

    // 2. Yol try-catch kullanarak exception'ı handle etmek tavsiye edilir.

    
    public static void divide2(int a, int b){//ArithmeticException//RTE
    	try {
    		System.out.println(a/b);
    		System.out.println("hi exception");
            System.out.println("bye exception");
			
		} 
    	
    	catch (ArithmeticException e) {
    		
			System.out.println("Bolme isleminde hata olustu-->"+e.getMessage());
			e.printStackTrace();
			System.err.println("Bolme isleminde problem olustu");
		}
    	
    	
    }
    
}
