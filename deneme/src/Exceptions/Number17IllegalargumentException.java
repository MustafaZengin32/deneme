package Exceptions;

import java.util.Scanner;

public class Number17IllegalargumentException {
	public Number17IllegalargumentException() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen konsolda gormek icin yasinizi giriniz");
        int yas = scan.nextInt();

        try {
            if (yas < 0) {
                throw new IllegalArgumentException();
            }

            System.out.println(yas);
        } catch (IllegalArgumentException var4) {
            System.out.println(var4);
            System.out.println("Yas sifirdan kucuk olamaz");
        }

    }

}
