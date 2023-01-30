package Arrays;

import java.util.Arrays;

public class Number2Arrays {

	public static void main(String[] args) {
		    int stdAge [] = new int[7];
	      
	        stdAge [1]=11;
	        stdAge [0]=12;
	        stdAge [2]=13;
	        stdAge [3]=14;
	        stdAge [4]=10;
	        stdAge [5]=12;
	        stdAge [6]=12;
	      
//stdAges Array'i icindeki tum elemanlarin toplamini ekrana yazdirin
	        
	        int sum = 0 ;
	        
	        for (int i =0 ; i<stdAge.length ; i++){
	          sum = sum +stdAge[i];
	        }
	        
	        System.out.println(sum);
	        System.out.println();
	        
	        // 2. Yol
	       
	        int i=0;
	        int toplam=0;
	        while(i<stdAge.length){
	          toplam= toplam+stdAge[i];
	          i++;
	        }
	        System.out.println(toplam);
	        System.out.println();
	        
	        // 3. yol
	        
	         int i1=0;
	         int toplam1=0;
	         do{
	           toplam1=toplam1+stdAge[i1];
	           i1++;
	         }
	         while (i1<stdAge.length);
	         System.out.println(toplam1);
	         System.out.println();
	        
	       //4.yol for each loop
	         
	         int toplam2=0;
	         
	         for(int i2 : stdAge){
	         toplam2=toplam2+i2;
	         }
	         System.out.println(toplam2);
	         System.out.println();
	          

	}

}
