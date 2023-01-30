package Exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class Number15ParentChildExceptions {
	public Number15ParentChildExceptions() {
    }

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src//Exceptions//File");
            
            int k;
            while((k = fis.read()) != -1) {
                System.out.print((char)k);
            }
        } catch (IOException var3) {
            var3.printStackTrace();
        }

        System.out.println("");
        System.out.println("Gorev tamamlandi");
    }

}
