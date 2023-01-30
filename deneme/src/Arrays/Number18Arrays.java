package Arrays;

import java.util.Arrays;

public class Number18Arrays {

	public static void main(String[] args) {
		 String cumle = "Java ogrendim,  #cok para ?kazandim.,";
	        String[] kelimeler = cumle.split(" ");
	        System.out.println(Arrays.toString(kelimeler));

	        int i;
	        for(i = 0; i < kelimeler.length; ++i) {
	            kelimeler[i] = kelimeler[i].replaceAll("\\W", "");
	        }

	        System.out.println(Arrays.toString(kelimeler));
	        Arrays.sort(kelimeler);

	        for(i = 0; i < kelimeler.length; ++i) {
	            System.out.print(kelimeler[i] + " ");
	        }

	    }

	}


