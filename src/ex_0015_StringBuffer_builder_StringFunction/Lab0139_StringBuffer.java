package ex_0015_StringBuffer_builder_StringFunction;

public class Lab0139_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);
        sb.replace(0,4,"C++");
        System.out.println(sb);
    }
}
