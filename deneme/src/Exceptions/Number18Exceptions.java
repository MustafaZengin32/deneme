package Exceptions;

import java.util.Scanner;

public class Number18Exceptions {
	public Number18Exceptions() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bolunecek tamsayiyi girin");
        int a = scan.nextInt();
        System.out.println("Lutfen bolecek tamsayiyi girin");
        int b = scan.nextInt();
        if (b == 0) {
            System.out.println("Bolecek sayi 0 olamaz");
        } else {
            System.out.println("Bolme isleminin sonucu : " + a / b);
        }

        System.out.println("Iyi gunler");
    }

}
