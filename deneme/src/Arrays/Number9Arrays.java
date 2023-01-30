package Arrays;

import java.util.Arrays;

public class Number9Arrays {

	public static void main(String[] args) {
		 int arr[] = {12, 31, 43, 14};
	     int sayi = 43;
	     Arrays.sort(arr); //{12, 14, 31, 43}
	    
	    
	     int idx1 = Arrays.binarySearch(arr, sayi);
	     System.out.println(idx1); //3
	     
	        sayi =12;
	        int sayi2=58;
	        int idx2=Arrays.binarySearch(arr, sayi2);
	        System.out.println(idx2);// -5
	        sayi2=17; 
	        //==>-3 kumede olsaydi olacak tahmini sira numarasini verir(1,2,3,)
	        //id numrasi değil
	        // binarySeach() - () negatif cikiyorsa

	}

}
