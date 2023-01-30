package Exceptions;

public class Number4NumberFormatException {
	public static void main(String[] args) {
        //String str = "123";
        //int result = convertStringToInteger(str);//Burasi try bolumu
        //System.out.println(result + 5);//128

        String st = "1a2b";
        int r = convertStringToInteger(st);//Rakam olmayan karakter iceren String'ler Integer'a cevrilemez
        //NumberFormatException:
        // Eger icinde rakamdan farkli character barindiran bir String'i
        // valueOf() kullanark Integer'a cevirmek isterseniz NumberFormatException alirsiniz

       System.out.println(r + 10);//10
    }

	public static int convertStringToInteger(String str){//NumberFormatException
  
		int i = 0;
	
		try {
			
			i = Integer.valueOf(str);
			System.out.println("Burasi try");
			
		} catch (NumberFormatException e) {
			System.out.println("sorun olustu-->"+e.getMessage());
			e.printStackTrace();
			System.err.println("problem var");
		}
		
		
		return i;
	
	}
	
	
	
	
//    public static int convertStringToInteger(String str){
//        int i = 0;
//    try{
//        //Herhangi bir satirda "Exception" atilirsa Java direkt "catch" bolumune gecer
//        // try icindeki sonraki kodlari calistirmaz
//
//        i = Integer.valueOf(str);
//        System.out.println("Burasi try bolumu"); }
//    catch(NumberFormatException e){
//        System.out.println("Rakam olmayan karakter iceren String'ler Integer'a cevrilemez"); }
//
//        return i;
//    }
	

}
