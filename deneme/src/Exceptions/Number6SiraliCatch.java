package Exceptions;

public class Number6SiraliCatch {
	
	public static void main(String[] args) {

        //double d = divideStringByTheNumOfTheChar(null);//==> null
        //System.out.println(d);//0.0

        //2.yol
         divideStringByTheNumOfTheCharacter(null);//null

        //3.yol
        //divideStringByTheNumOfTheCharacters(null);//NullPointer'a ozel...null

    }

    //String'deki character sayisini bulunuz, String'i integer'a ceviriniz, Integer'i character sayisina bolunuz.
// 1.Yol:

//    public static double divideStringByTheNumOfTheChar(String str) {
//        int length = 0;
//        int i = 0;
//        double sonuc = 0;
//        try {
//            length = str.length();//NullPointerException:
//            // "null" String ile "length()" kullanildiginda alinir
//
//            i = Integer.valueOf(str);//NumberFormatException:
//            // Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildiginda
//
//            sonuc = i / length;//ArithmeticException:
//            // Bolen sayi sifir oldugunda alinir
//        } catch (NullPointerException e) {
//            System.out.println("Null p==> " + e.getMessage());
//        } catch (NumberFormatException e) {
//            System.out.println("Number f"+e.getMessage());
//        } catch (ArithmeticException e) {
//            System.out.println("Aritmetik e"+e.getMessage());
//        }
//        return sonuc;
//    }








    //2.Yol:

public static double divideStringByTheNumOfTheCharacter(String str) {
    int length = 0;
    int i = 0;
    double sonuc = 0;
    try {
        length = str.length();//NullPointerException:
        // "null" String ile "length()" kullanildiginda alinir
        i = Integer.valueOf(str);//NumberFormatException:
        // Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildiginda

        sonuc = i / length;//ArithmeticException:
        // Bolen sayi sifir oldugunda alinir
    } catch (Exception e) {
        System.out.println("Exception "+e.getMessage());//null
    }
    return sonuc;
}



 



    //3.Yol
//    public static double divideStringByTheNumOfTheCharacters(String str) {
//        int length = 0;
//        int i = 0;
//        double sonuc = 0;
//        try {
//            length = str.length();//NullPointerException:
//            // "null" String ile "length()" kullanildiginda alinir
//            i = Integer.valueOf(str);//NumberFormatException:
//            // Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildiginda
//            sonuc = i / length;//ArithmeticException:
//            // Bolen sayi sifir oldugunda alinir
//        } catch (NullPointerException e) {
//            System.out.println("NullPointer'a ozel..."+e.getMessage());
//
//        } catch (Exception e) {
//            System.out.println("Diger tum Exception'lar icin...");
//        }
//        return sonuc;
//            }
    
    
    }







