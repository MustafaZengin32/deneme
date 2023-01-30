package Exceptions;

public class Number10ArithmeticException {
	

    public static void main(String[] args) {
        int a = 20;
        int b = 0;

        try {
            System.out.println("sayilarin bolumu : " + a / b);
        } catch (ArithmeticException var4) {
            System.out.println("Sifira bolum yapilamaz");
            var4.printStackTrace();
        }

        System.out.println("Gorev tamamlandi");
    }
}
