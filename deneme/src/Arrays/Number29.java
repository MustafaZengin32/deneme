package Arrays;

public class Number29 {

	
		public static void main(String[] args) {
	        int[] arr = new int[]{1, 2, 4, 5, 3, 6, 7, 4, 2, 3, 5, 1, 3, 2};
	        int arananEleman = 2;
	        elemanAra(arr, arananEleman);
	    }

	    public static void elemanAra(int[] arr, int arananEleman) {
	        int sayac = 0;

	        for(int i = 0; i < arr.length; ++i) {
	            if (arr[i] == arananEleman) {
	                ++sayac;
	            }
	        }

	        if (sayac == 0) {
	            System.out.println("Aranan sayi array'de yok");
	        } else {
	            System.out.println("Aranan " + arananEleman + " sayisi, array'de " + sayac + " kere kullanilmis");
	        }

	    }

	}


