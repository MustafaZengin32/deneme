package Arrays;

import java.util.Arrays;

public class Number1Arrays {

	public static void main(String[] args) {
		   
		   int stdAge [ ] = new int[7];
	       System.out.println(Arrays.toString(stdAge));
	        stdAge [1]=11;
	        stdAge [0]=12;
	        stdAge [2]=13;
	        stdAge [3]=14;
	        stdAge [4]=10;
	        stdAge [5]=12;
	        stdAge [6]=12;
	        System.out.println(stdAge[4]);
	        System.out.println(Arrays.toString(stdAge));
	      
	        Arrays.sort(stdAge);
	       System.out.println(Arrays.toString(stdAge));
	        
	        //Arraydeki en kucuk ve en buyuk elemani yazdiriniz?
	                int ilk = stdAge[0];
	                int son = stdAge[stdAge.length-1];
	                System.out.println("en kucuk eleman: "+ilk);
	                System.out.println("en kucuk eleman: "+son);

	}

}
