package Arrays;

import java.util.Arrays;

public class Number16Arrays {

	public static void main(String[] args) {
		 String[] isimler = new String[]{"Hacer", "ainagul", "Emine", "Murat", "Kutlu"};
	        
		    Arrays.sort(isimler);
	        System.out.println(Arrays.toString(isimler));
	        isimler[4] = "Ainagul";
	        System.out.println(Arrays.toString(isimler));
	        Arrays.sort(isimler);
	        System.out.println(Arrays.toString(isimler));
	        System.out.println(Arrays.binarySearch(isimler, "Murat"));
	        System.out.println(Arrays.binarySearch(isimler, "Mehmet"));
	        System.out.println(Arrays.binarySearch(isimler, "Tuba"));
	        System.out.println(Arrays.binarySearch(isimler, "Kursat"));
	    }

	}


