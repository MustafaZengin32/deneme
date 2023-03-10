package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Number31FileNotFoundException {
	public static void main(String[] args) {
		// Java'ya bir dosyayi okumasini veya dosyaya yazmasini soyledigimizde
		// Java "Ya dosyayi bulamazsam" der ve bizden cozum uretmemizi bekler
		// dosya bulma ile ilgili exception turu : FileNotFoundException
		// Java kodu yazar yazmaz buradaki olasi problemi gorur ve CTE verir
		// Kodumuzu yazdigimiz anda ortaya cikan bu tur exception'lara Checked Exceptions diyoruz
		//
		try {
			FileInputStream fis = new FileInputStream("src/Exceptions/File");
		
		
			
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace(); // tum hata aciklamalarini yazdirir ama kodumuz bloke olmaz
			System.out.println(e.getMessage()); // daha az hata aciklamasi yazdirir
		}
		System.out.println("Kod bloke olmamisss");
		
	}


}
