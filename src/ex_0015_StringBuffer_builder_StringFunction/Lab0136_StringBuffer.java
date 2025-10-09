package ex_0015_StringBuffer_builder_StringFunction;

public class Lab0136_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Khushboo");
        stringBuffer.append("Jain");
        System.out.println(stringBuffer);
        String s1 = "Khushboo";
        s1 = s1 + "Jain";
        System.out.println(s1);
    }
}
