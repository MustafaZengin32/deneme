package Exceptions;

public class Number2ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
        String arr[] = {"Ali", "Can", "Veli", "Han"};

    getElementFromArray(arr,2);//Veli
    getElementFromArray(arr,0);//Ali
    getElementFromArray(arr,4);//Array index te bir problem meydana geldi====>Index 4 out of bounds for length 4
         }

        // Bir String Array den index girerek eleman elde edebilmek icin bir method olusturun

        public static void getElementFromArray(String arr[], int idx) {//ArrayIndexOutOfBoundsException

        	
        	try {
        		System.out.println(arr[idx]);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array yazdirir iken sorun olusut-->"+e.getMessage());
				e.printStackTrace();
				System.err.println("Array index te bir problem yasandi");
			}
        	
 
        }
}
