package Exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class Number13IOException {
	 public Number13IOException() {
	    }

	    public static void main(String[] args) throws IOException {
	        new FileInputStream("src//Exceptions//File");
	        System.out.println("Gorev tamamlandi");
	    }

}
