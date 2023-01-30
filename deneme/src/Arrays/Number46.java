package Arrays;

import java.util.Arrays;

public class Number46 {

	public static void main(String[] args) {
		String str="Herkes Javayi tanisa severdi";
		// bu stringi kelimelere ayiralim
		// split methodu
		
		String arr[]=str.split(" ");
		
		System.out.println(Arrays.toString(arr));
		
		String arr2[]=str.split("Java");
		System.out.println(Arrays.toString(arr2)); 
		
		String arr3[]=str.split("a");
		System.out.println(Arrays.toString(arr3)); 

		String arr4[]=str.split("");
		System.out.println(Arrays.toString(arr4)); 
	}
	}


