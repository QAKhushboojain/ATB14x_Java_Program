package ex_0015_StringBuffer_builder_StringFunction;

public class Lab0142_StringPalindrome {
    public static void main(String[] args) {
        // madam -  reverse - madam
        // naman - naman
        // user_input = reverse(user_input)
        String input = "madam";
        String reversed = "";
        for (int i = input.length()-1; i>=0 ; i--)
        {
            reversed = reversed + input.charAt(i);
        }
        if(reversed.equalsIgnoreCase(input))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }

    }
}
