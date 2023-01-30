package Arrays;

public class Number8 {

	public static void main(String[] args) {
// Example 2 :Bir Array'in icinde herhangi bir elemanin olup olmadigini kontrol eden ve
// kaç kere tekrarladigini gosteren kodu yaziniz?
// [2, 1, 2, -3, 2] ==> Kullanicinin 2 yi sordu ==> 2 elemani var ve 3 kere tekrarlandi
// ==> Kullanicinin 6 yi sordu ==> 6 elemani yok ve 0 kere tekrarlandi
int sayac=0;
//"flag":
//Bazi durumlarin var olup olmadiğini kontrol etmek icin "flag" kullanilir.
        
        int kutu[]={2, 1, 2, -3, 2};
        
        int aranan=2;
        
        for(int j=0; j< kutu.length ; j++){
        if(kutu[j]==aranan){
        sayac++; } }
        
        
        
        if(sayac==0){
System.out.println(aranan+ " elamani Array'de yok"); }
        else { 
        	System.out.println(aranan+ " elamani Array'de var "+sayac+" kere tekrarlaniyor ");
        //2 elamani Array'de var 3 kere tekrarlaniyor
        }

	}

}
