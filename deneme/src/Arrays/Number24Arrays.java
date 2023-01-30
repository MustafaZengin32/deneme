package Arrays;

public class Number24Arrays {
	public static void main(String[] args) {
        String[] arr = new String[]{"Hasan", "Ilker", "Senturk", "Omer Faruk"};
        enUzunEnKisaIsimleriYazdir(arr);
    }

    public static void enUzunEnKisaIsimleriYazdir(String[] arr) {
        String enuzunKelime = arr[0];
        String enKisaKelime = arr[0];

        for(int i = 1; i < arr.length; ++i) {
            if (arr[i].length() >= enuzunKelime.length()) {
                enuzunKelime = arr[i];
            }

            if (arr[i].length() <= enKisaKelime.length()) {
                enKisaKelime = arr[i];
            }
        }

        System.out.println("En uzun isim : " + enuzunKelime);
        System.out.println("En kisa isim : " + enKisaKelime);
    }
}
