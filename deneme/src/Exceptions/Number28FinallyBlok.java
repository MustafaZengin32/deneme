package Exceptions;

public class Number28FinallyBlok {
	public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException var7) {
            System.out.println("bolecek sayi sifir olamaz");
        } finally {
            System.out.println("Finally blok calisti");
        }

    }

}
