package Arrays;

import java.util.Arrays;

public class Number36 {
	public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 6};
        int[] arr2 = new int[arr.length + 1];

        for(int i = 0; i < arr.length; ++i) {
            arr2[i] = arr[i];
        }

        System.out.println(Arrays.toString(arr2));
        arr2[arr2.length - 1] = 8;
        System.out.println(Arrays.toString(arr2));
        System.out.println("arr'nin son hali : " + Arrays.toString(arr2));
    }
}
