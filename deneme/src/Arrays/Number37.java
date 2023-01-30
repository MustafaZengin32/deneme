package Arrays;

import java.util.Arrays;

public class Number37 {
	public static void main(String[] args) {
        int[] abc = new int[]{3, 5, 8, 9, 6, 7, 3, 4};
        int eklenecekSayi = 10;
        abc = arrayeElemanEkle(abc, eklenecekSayi);
        System.out.println(Arrays.toString(abc));
    }

    public static int[] arrayeElemanEkle(int[] eklenecekArr, int eklenecekSayi) {
        int[] yeniArr = new int[eklenecekArr.length + 1];

        for(int i = 0; i < eklenecekArr.length; ++i) {
            yeniArr[i] = eklenecekArr[i];
        }

        yeniArr[yeniArr.length - 1] = eklenecekSayi;
        return yeniArr;
    }
}
