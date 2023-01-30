package Arrays;

import java.util.Arrays;

public class Number12Arrays {

	public static void main(String[] args) {
		
		int[] arr = new int[]{3, 5, 8, 5, 2, 4};
	        int toplam = 0;
            int i;
	        for(i = 0; i < arr.length; ++i) {
	            toplam += arr[i];
	        }

	        System.out.println("elementlerin toplami : " + toplam);
	        
	        Arrays.sort(arr);
	        System.out.println(Arrays.toString(arr));

	        for(i = arr.length - 1; i >= 0; --i) {
	            System.out.print(arr[i] + " ");
	        }

	        System.out.println(" ");
	        
	        int[] tersArray = new int[arr.length];

	        for(int i1 = 0; i1 < tersArray.length; ++i1) {
	            tersArray[i1] = arr[arr.length - 1 - i1];
	        }

	        System.out.println(Arrays.toString(tersArray));
	    }

	}


