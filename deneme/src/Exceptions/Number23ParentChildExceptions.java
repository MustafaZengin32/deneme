package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Number23ParentChildExceptions {
	public Number23ParentChildExceptions() {
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = "src/Exceptions/File";
        FileInputStream fis = new FileInputStream(path);
        

        int k;
        while((k = fis.read()) != -1) {
            System.out.print((char)k);
        }

    }

}
