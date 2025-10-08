package ex_014_Strings;

import javax.sound.midi.Soundbank;

public class Lab0133_StringExamples {
    public static void main(String[] args) {
        String s = "Java";
        char c = s.charAt(2);
        System.out.println(c);
        int result = "abc".compareTo("ABC");
        System.out.println(result);
        int result1= "abc".compareTo("abc");
        System.out.println(result1);
        int idx = "Java".indexOf("a");
        System.out.println(idx);
        int idx1 = "Java".lastIndexOf("a");
        System.out.println(idx1);
        boolean b = "  ".isEmpty();
        System.out.println(b);
        String s11 = String.join("z-", "Java", "Python");
        System.out.println(s11);
        String s12 = "Java".replace('a', 'o');
        System.out.println(s12);
        boolean b1 = "Java".startsWith("Ja");
        System.out.println(b1);
        String b2 = "Java".concat("MAVA");
        System.out.println(b2);
    }
}
