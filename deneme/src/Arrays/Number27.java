package Arrays;

import java.util.Arrays;

public class Number27 {

	
		public static void main(String[] args) {
	        int[] arr = new int[]{2, 4, 6, 8};

	        for(int i = 0; i < arr.length; ++i) {
	            arr[i] += 2;
	        }

	        System.out.println(Arrays.toString(arr));
	        arr = elementleri2Artir(arr);
	        System.out.println(Arrays.toString(arr));
	    }

	    public static int[] elementleri2Artir(int[] arr) {
	        for(int i = 0; i < arr.length; ++i) {
	            arr[i] += 2;
	        }

	        return arr;
	    }

	}


