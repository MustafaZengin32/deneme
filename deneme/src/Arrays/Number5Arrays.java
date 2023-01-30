package Arrays;

import java.util.Arrays;

public class Number5Arrays {

	public static void main(String[] args) {
		String str[]=new String[4];
        str[0]="Java";
        str[1]="did";
        str[2]="surprise you";
        System.out.println(Arrays.toString(str));

//Example 1 : String bir Array olusturunuz ve
//"Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz
        
        String arr[]={"Jane", "Mark", "Cristopher", "Tom", "Ali", "Rojda"};
        
        for(String w : arr){
        System.out.print(w + ", ");
        if(w.equals("Tom")){
        break;} }
        System.out.println();
	
        

//Example 2 : String bir Array olusturunuz ve
//"Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz
	
       String brr[]={"Jane","Mark","Cristopher","Tom", "Alican","Rojda"};

for(String w : brr) {
if (w.equals("Tom") || w.equals("Jane")) {
continue; }
System.out.print(w + " ,");
}
System.out.println();

}
}