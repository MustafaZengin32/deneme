package Exceptions;

import java.util.Random;

public class Number22MultipleExceptions {
	public Number22MultipleExceptions() {
    }

    public static void main(String[] args) {
        String str = "Java";
        int[] arr = new int[]{3, 4, 6, 8, 9};
        
        Random rnd = new Random();
        int rastgeleSayi = rnd.nextInt(10);
        System.out.println(rastgeleSayi);

        try {
            System.out.println(str.substring(rastgeleSayi, rastgeleSayi + 1));
            System.out.println(arr[rastgeleSayi]);
        } catch (ArrayIndexOutOfBoundsException var6) {
            System.out.println("index Array'in sinirlari disinda ");
        } catch (StringIndexOutOfBoundsException var7) {
            System.out.println("index String'in sinirlari disinda ");
        }

    }

}
