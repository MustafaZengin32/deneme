package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Number8IOException {
	public static void main(String[] args) throws IOException {
        //readTheTextFromTheFile();

		readTheText();

    }

//Bir text file'daki text'i okuyan kodu yaziniz.
	
// 1.Way:

//     public static void readTheTextFromTheFile() throws IOException {
//    	 
//        FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1");
//        int k = 0;
//        while((k = fis.read()) != -1){
//            System.out.print((char)k); } }

	
	
//2.Way:
     public static void readTheText() {
         try {
        	 
             FileInputStream fis = new FileInputStream("src/Exceptions/File");
             int k = 0;
             while ((k = fis.read()) != -1) {
                 System.out.print((char) k);
             }
         } catch (FileNotFoundException e) {
             System.err.println("Dosya'nin adresi veya varligi ile ilgili bir problem var.");
         } catch (IOException e) {
             System.out.println("Dosya'da okunamayan bir character var");
         }
     }
}
