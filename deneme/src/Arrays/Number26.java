package Arrays;

import java.util.Arrays;

public class Number26 {
	public static void main(String[] args) {
        String[] arr = new String[]{"Ali", "Ulus", "Nesrin"};

        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
    }
}
