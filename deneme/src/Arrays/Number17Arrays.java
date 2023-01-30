package Arrays;

import java.util.Arrays;

public class Number17Arrays {

	public static void main(String[] args) {
		    String cumle = "Java ogrenmek cok guzel";
	        String[] kelimeler = cumle.split(" ");
	        System.out.println(Arrays.toString(kelimeler));

	        for(int i = kelimeler.length - 1; i >= 0; --i) {
	            System.out.print(kelimeler[i] + " ");
	        }

	    }

	}


