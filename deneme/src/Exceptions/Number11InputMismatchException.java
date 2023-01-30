//package Exceptions;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Number11InputMismatchException {
//	
//	
//	public Number11InputMismatchException () {
//		
//	}
//	public static void main(String[] args) {
//        int sayi = false;
//        int toplam = 0;
//        int count = 0;
//        Scanner scan = new Scanner(System.in);
//
//        try {
//            while(count < 10000) {
//                System.out.println("Lutfen toplamak icin bir sayi yaziniz \nBitirmek icin sayi disinda bir tusa basiniz");
//                int sayi = scan.nextInt();
//                toplam += sayi;
//                ++count;
//            }
//        } catch (InputMismatchException var6) {
//            System.out.println("girrdiginiz " + count + " adet sayinin toplami : " + toplam);
//        }
//
//    }
//
//}
