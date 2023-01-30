package Arrays;

import java.util.Arrays;

public class Number19Arrays {

	public static void main(String[] args) {
		int[] arr = new int[]{3, 4, 5, 6, 3, 5};
        int silinecekEleman = 3;
        int sayac = 0;

        int i;
        for(i = 0; i < arr.length; ++i) {
            if (arr[i] == silinecekEleman) {
                ++sayac;
            }
        }

        System.out.println(sayac);
        i = arr.length - sayac;
        int[] yeniArr = new int[i];
        int index = 0;

        for(int i1 = 0; i1 < arr.length; ++i1) {
            if (arr[i1] != silinecekEleman) {
                yeniArr[index] = arr[i1];
                ++index;
            }
        }

        System.out.println(Arrays.toString(yeniArr));
    }

	}


