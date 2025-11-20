package ex_0027_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab219_Throws_using_try_catch {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("test.txt");
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Yes");
        }
    }
}
