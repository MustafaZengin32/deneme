package Arrays;

import java.util.Arrays;

public class Number31 {
	public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 6, 7};
        arr = sagaKaydir(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sagaKaydir(int[] arr) {
        
    	int bosKova = arr[arr.length - 1];

        for(int i = arr.length - 2; i >= 0; --i) {
            arr[i + 1] = arr[i];
        }

        arr[0] = bosKova;
        return arr;
    }
}
