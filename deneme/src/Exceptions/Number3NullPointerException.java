package Exceptions;

public class Number3NullPointerException {
	public static void main(String[] args) {

        String str = "Ali";
        getNumOfChars(str);//3
        
        String s = "";
        getNumOfChars(s);//0
        
        String t = null;
        getNumOfChars(t);//length() methodunda bir problem olustu ==>null
        // eger length() methodunda null kullanırsanız bu exception ı alirsiniz
        }
        //Bir String te bulunan karakterlerin sayisini bulabilmek icin bir method olusturunuz

	
	public static void getNumOfChars(String str){//NullPointerException
		
		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("uzunluk alirken sorun yasandi-->"+e.getMessage());
			e.printStackTrace();
			System.err.println("Length alirken problem yasandi");
		}
		
	}
	
	
	
	
//    public static void getNumOfChars(String str){
//        try{
//            System.out.println(str.length()); }
//        catch (NullPointerException e){
//            System.out.println("length() methodunda bir problem olustu ==>"+ e.getMessage());
//            e.printStackTrace();
//
//            // bu methodu kullandiginiz zaman System.out.println(); kullanmaniza gerek yok
//
//             }
//        }
	

}
