package ex_006_Ternary_Operator;

public class Lab057_To_Even_Odd_Interview {
    public static void main(String[] args) {
        // step 1 - Input , Output - Data type
     //   int num = 13; // For Odd
        int num = 14;
        // step - 2 logic
        // num%2==0 > even else 1 odd
        String result = (num%2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
