package Arrays;

import java.util.Arrays;

public class Number23Arrays {

	public static void main(String[] args) {
		    int[] A = new int[]{1, 5, 6, 7, 8, 10};
	        int[] B = new int[]{2, 4, 9};
	        int[] birlesmis = Arrays.copyOf(A, A.length + B.length);
	        System.out.println(Arrays.toString(birlesmis));

	        int i;
	        for(i = A.length; i < birlesmis.length; ++i) {
	            birlesmis[i] = B[i - A.length];
	        }

	        System.out.println(Arrays.toString(birlesmis));
	        Arrays.sort(birlesmis);
	        System.out.println(Arrays.toString(birlesmis));

	        for(i = 0; i < A.length; ++i) {
	            A[i] = birlesmis[i];
	        }

	        System.out.println(Arrays.toString(A));

	        for(i = A.length; i < birlesmis.length; ++i) {
	            B[i - A.length] = birlesmis[i];
	        }

	        System.out.println(Arrays.toString(B));
	    }

	}


