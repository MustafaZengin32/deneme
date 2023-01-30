package Arrays;

import java.util.Arrays;

public class Number32 {
	public static void main(String[] args) {
        int[] arr = new int[]{3, 8, 1, 5, 2, 9};
        enBuyukEnKucukElementYazdir(arr);
    }

    public static void enBuyukEnKucukElementYazdir(int[] arr) {
        Arrays.sort(arr);
        System.out.println("En buyuk element : " + arr[arr.length - 1]);
        System.out.println("En kucuk element : " + arr[0]);
    }
}
