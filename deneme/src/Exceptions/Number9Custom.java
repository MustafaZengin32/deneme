package Exceptions;

public class Number9Custom {
	
	public static void main(String[] args) throws Number9IllegalGradeException {
		
		        checkNamesFormat("Un");
		        printGrades(500);
		    }
		    //Ogrenci notlarini yazdiran bir method olusturunuz.

		    public static void printGrades(double grade) throws Number9IllegalGradeException {
		        if(grade<0||grade>100){
		            throw new Number9IllegalGradeException("0 DAN KUCUK 100 DEN BUYUK OLMAZ"); }
		        else{
		            System.out.println(grade); } }

		    // Verilen ismin ilk harfinin buyuk olmasi durumuna Exeption atan methodu yaziniz.

		    public static boolean checkNamesFormat(String names)  {
		        if(names.charAt(0)>='A'&&names.charAt(0)<='Z'){
		            return true; }
		        else {
		            throw new Number9IllegalNameException("Isimler buyuk harfle baslamalidir"); } }
	

}
