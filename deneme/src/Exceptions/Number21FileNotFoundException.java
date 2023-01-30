package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Number21FileNotFoundException {
	public Number21FileNotFoundException() {
    }

    public static void main(String[] args) throws FileNotFoundException {
        String path = "src/Exceptions/File";
        new FileInputStream(path);
    }

}
