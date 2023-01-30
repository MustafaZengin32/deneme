package Arrays;

import java.util.Arrays;

public class Number34 {
	public static void main(String[] args) {
        String str = "java gercekten cok cok guzel";
        String[] eArrayi = str.split("e");
       
        System.out.println(Arrays.toString(eArrayi));
        System.out.println(eArrayi.length);
        System.out.println("Metindeki e sayisi : " + (eArrayi.length - 1));
        String[] tumKarakterlerArr = str.split("");
        System.out.println(Arrays.toString(tumKarakterlerArr));
        int sayac = 0;

        for(int i = 0; i < tumKarakterlerArr.length; ++i) {
            if (tumKarakterlerArr[i].equals("e")) {
                ++sayac;
            }
        }

        System.out.println("Metindeki e sayisi : " + sayac);
    }
}
