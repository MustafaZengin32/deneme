package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Number14ParentChildExceptions {
	public Number14ParentChildExceptions() {
    }

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src//Exceptions//File");
          
            int k;
            while((k = fis.read()) != -1) {
                System.out.print((char)k);
            }
        } catch (FileNotFoundException var3) {
            var3.printStackTrace();
        } catch (IOException var4) {
            var4.printStackTrace();
        }

        System.out.println("");
        System.out.println("Gorev tamamlandi");
    }

}
