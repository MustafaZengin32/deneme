package Arrays;

import java.util.Arrays;

public class Number10 {

	public static void main(String[] args) {
		//Example 1: Size verilen pozitif ve negatif sayilar iceren bir integer array'deki
        // "en buyuk negatif" ve "en kucuk pozitif" elemani bulunuz.
        int arr[] = { -12, 18, -5, 23, 0 };
        Arrays.sort(arr); // {-12, -5, 0, 18, 23}
        
        
        
//        int poz []=new int[arr.length];
//        int neg []=new int[arr.length];
//        
//        for (int i : arr) {
//        	if(arr[i]<0) {
//        		neg[i]=arr[i];
//        		
//        	}
//        	else {
//        		poz[i]=arr[i];
//        	}
//			
//		}
//        
//        //System.out.println(poz[poz.length-1]);
//        System.out.println(neg[0]);
        
        
        
        
        
        int maxNegative = arr[0];
        int minPositive = arr[arr.length-1]; // [ -12, -5, 0, 18, 23]
        
        for(int w : arr){
            if(w<0){
            	maxNegative = Math.max(maxNegative, w); }
           
            if(w>0){
                minPositive = Math.min(minPositive, w); }
        }
        System.out.println("En buyuk negatif: " + maxNegative );//-5
        System.out.println("En kucuk pozitif: " + minPositive );//18

	}

}
