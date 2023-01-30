package Exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class Number34IOException {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/Exceptions/File");
			int k = 0;

			while ((k = fis.read()) != -1) {
				System.out.print((char) k);
				fis.close();
			}
		}  catch (IOException e) { 

			System.out.println(e.getMessage());
		}
		System.out.println("");
		System.out.println("Kod bloke olmamisss");

		
	}
}
