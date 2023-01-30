package Arrays;

public class Number3Arrays {

	public static void main(String[] args) {
		 // Example 3 : String bir Array olusturunuz .
		// Bu arraye 5 tane isim yerlestririniz.
	   // Bu isimlerin character sayilarini ekrana yazdiriniz.

	      String isim[] = new String[5];
	      
	      isim[0]="Ali";
	      isim[1]="Tom";
	      isim[2]="Veli";
	      isim[3]="Kemal";
	      isim[4]="Cem";

	      int toplam=0;
	      for( String w : isim){
	    		  
	    	 System.out.println(w.length());
	      }
	      

	}

}
