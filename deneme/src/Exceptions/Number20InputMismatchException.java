package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number20InputMismatchException {
	public Number20InputMismatchException() {
    }

    public static void main(String[] args) {
        boolean tekrar = true;
        int girilensayi = 0;

        while(tekrar) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen bir tamsayi giriniz");

            try {
                girilensayi = scan.nextInt();
                break;
            } catch (InputMismatchException var5) {
                System.out.println("Adam gibi tamsayi degeri girsene");
            }
        }

        System.out.println("girilen sayinin karesi : " + girilensayi * girilensayi);
    }

}
