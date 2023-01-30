package Exceptions;

import java.util.Scanner;

public class Number27IllegalArgumentException {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int sayi = scan.nextInt();
        if (sayi < 0) {
            throw new IllegalArgumentException("Yas negatif olamaz");
        }
    }

}
