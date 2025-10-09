package ex_0015_StringBuffer_builder_StringFunction;

public class Lab0134_String_Functions {
    public static void main(String[] args) {
       // 1. length
        String name = "Sonal";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
      //  System.out.println(name.charAt(10));
        // 2. concat
        System.out.println(name.concat("Patel"));
        // 3. contains
        System.out.println(name.contains("om"));
        // 4. equals
        System.out.println(name.equals("Sonal"));
        // 5. equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("sonal"));
        // 6. index of sonal -> o
        System.out.println(name.indexOf('o'));
        String s1 = "madam";
        // Returns the index within this string of the
        // first occurence of the specified substring
        System.out.println(s1.indexOf("m"));
        // 7. length -
        System.out.println(name.length());
        // 8. replace
        System.out.println(name.replace('n', 'N'));
        // 9. substring
        System.out.println(name.substring(1,3));
        // 10. toLowerCase
        System.out.println("SONAL".toLowerCase());
        // 11. toUpperCase
        System.out.println("sonal".toUpperCase());
        // 12. startsWith
        System.out.println(name.startsWith("s"));
        // 13. endsWith
        System.out.println(name.endsWith("a"));
        // 14. trim
        String s2 = "Sonal Harish";
        System.out.println(s2.trim());
        // 15. compareTo
        System.out.println(name.compareTo("Sonal"));
        //===============================================
        StringBuilder stringBuilder = new StringBuilder("Sonal");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());

    }
}
