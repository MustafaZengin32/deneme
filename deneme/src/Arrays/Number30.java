package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Number30 {
	public static void main(String[] args) {
        int[] kullaniciArrayi = arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArrayi));
    }

    public static int[] arrayOlustur() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Olusturulacak array'in boyutunu giriniz");
        int length = scan.nextInt();
        int[] kullaniciArrayi = new int[length];

        for(int i = 0; i < length; ++i) {
            System.out.println("array'e eklenecek bir sayi giriniz");
            kullaniciArrayi[i] = scan.nextInt();
        }

        return kullaniciArrayi;
    }
}
