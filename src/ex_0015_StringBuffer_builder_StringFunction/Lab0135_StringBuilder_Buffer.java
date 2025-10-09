package ex_0015_StringBuffer_builder_StringFunction;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Lab0135_StringBuilder_Buffer {
    public static void main(String[] args) {
        // string - 90%
        String s0 = "Khushboo";
        String s1 = new String("Khushboo");
        // less than <10% used
        StringBuffer stringBuffer = new StringBuffer("Khushboo");
        StringBuilder stringBuilder = new StringBuilder("Khushboo");
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
    }
}
