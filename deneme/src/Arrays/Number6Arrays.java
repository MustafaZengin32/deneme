package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Number6Arrays {

	public static void main(String[] args) {
//Example 3 : Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz
//Bir ogretmenin sinifindaki örencilerin isimlerini application'a yuklmesini saglayan kodu yaziniz

        Scanner input=new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz");
        int numofStd=input.nextInt();
        
        String names[]=new String[numofStd];

        System.out.println("Girisi sonlandirmak icin Q harfine basiniz.");
        //Girisi sonlandirmak icin Q harfine basiniz.

        
        for(int i=1; i<(numofStd+1); i++) {
            //n<=numofStd hiz acisindan farkli degil bu daha mantikli
        System.out.println("Lutfen " + i + " . ogrenci ismini giriniz");
        String stdNames=input.next();
        if(stdNames.equalsIgnoreCase("Q")){
        break; }
        names[i-1]=stdNames; }

        System.out.println(Arrays.toString(names));
   }

   }

	

