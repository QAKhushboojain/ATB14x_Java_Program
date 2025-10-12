package ex_016_Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Lab0161_BufferReader_input {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value if N");
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println(N);
    }
}
