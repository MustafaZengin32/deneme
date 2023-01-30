package Exceptions;

public class Number7Finally {
	public static void main(String[] args) {

        double r1 =compareNumOfCharacters("Java","xy");//Database ile connection ile kesildi
        System.out.println("r1:"+r1);//r1:2.0

        double r2 =compareNumOfCharacters(null,"xy");//lenght() method'u null ile kullanilmaz//Database ile connection ile kesildi
        System.out.println("r2:"+r2);//r2:0.0
        double r3 =compareNumOfCharacters("Java","");//Herhangi bir sayi sifir ile bolunemez//Database ile connection ile kesildi
        System.out.println("r3:"+r3); //r3:0.0
    }

    //Verilen iki String'den birinin character sayisinin digerinden kac kati oldugunu veren methodu olusturun.

    public static double compareNumOfCharacters(String s, String t){
        double result=0;
        try {
            result= s.length() / t.length(); }
        catch (NullPointerException e){
            System.out.println("lenght() method'u null ile kullanilmaz"); }
        catch (ArithmeticException e){
            System.out.println("Herhangi bir sayi sifir ile bolunemez"); }
        finally {
            System.out.println("Database ile connection ile kesildi"); }
        return result;
    }



}
