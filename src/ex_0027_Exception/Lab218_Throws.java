package ex_0027_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab218_Throws {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader f = new FileReader(new File("C://abc.txt"));
    }
}
