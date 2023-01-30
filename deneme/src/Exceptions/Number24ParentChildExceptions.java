package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Number24ParentChildExceptions {
	public Number24ParentChildExceptions() {
    }

    public static void main(String[] args) {
        String path = "src/day37_exceptions/TextFile";

        try {
            FileInputStream fis = new FileInputStream(path);
            

            int k;
            while((k = fis.read()) != -1) {
                System.out.println((char)k);
            }
        } catch (FileNotFoundException var4) {
            var4.printStackTrace();
        } catch (IOException var5) {
            var5.printStackTrace();
        }

    }

}
