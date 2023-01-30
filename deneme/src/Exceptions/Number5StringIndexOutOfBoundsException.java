package Exceptions;

public class Number5StringIndexOutOfBoundsException {
	public static void main(String[] args) {

        char ch1 = getCharFromString("Java", 2);
        System.out.println(ch1);//v

        char ch2 = getCharFromString("Selenium", 8);
        System.out.println(ch2);//Index ile ilgili bir problem olustu. String index out of range: 8
        //StringIndexOutOfBoundsException:
        // Eger bir String'den character/ler alirken olmayan bir index kullanilirsa
        // StringIndexOutOfBoundsException alinir.

    }
	public static char getCharFromString(String str, int idx) {//StringIndexOutOfBoundsException
		
		char c = ' ';
		
		try {
			c = str.charAt(idx);
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Sorun olustu-->"+e.getMessage());
			e.printStackTrace();
			System.err.println("Sorun var problem olustu");
		}
		
		
		return c;
	}
}
