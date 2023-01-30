package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number12ArrayIndexOutOfBoundsException {
	 public Number12ArrayIndexOutOfBoundsException() {
	    }

	    public static void main(String[] args) {
	        int[] arr = new int[]{2, 3, 5, 6, 2, 7, 9, 1};

	        try {
	            Scanner scan = new Scanner(System.in);
	            System.out.println("lutfen elementi yazdirmak icin index giriniz");
	            int index = scan.nextInt();
	            System.out.println("girdiginiz indexdeki element : " + arr[index]);
	        } catch (ArrayIndexOutOfBoundsException var4) {
	            System.out.println("girdiginiz index array'de yok");
	        } catch (InputMismatchException var5) {
	            System.out.println("Girdiginiz index pozitif tam sayi olmali");
	        }

	    }

}
