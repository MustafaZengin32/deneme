package Exceptions;

import java.util.Scanner;

public class Number19ArithmeticException {
	public Number19ArithmeticException() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bolunecek tamsayiyi girin");
        int a = scan.nextInt();
        System.out.println("Lutfen bolecek tamsayiyi girin");
        int b = scan.nextInt();

        try {
            System.out.println("Bolme isleminin sonucu : " + a / b);
        } catch (ArithmeticException var5) {
            System.out.println("Bolecek sayi 0 olamaz");
        }

        System.out.println("Iyi gunler");
    }

}
