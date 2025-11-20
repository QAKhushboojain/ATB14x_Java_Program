package ex_0027_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab207Checked_Exception {
    public static void main(String[] args) {
        try {
            FileInputStream fileinputstream = new FileInputStream("C://log.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
