package ex_006_Ternary_Operator;

public class Lab059_Real_Age_Classification {
    public static void main(String[] args) {
       // String user_input1 = args[0]; // 12
      //  String user_input2 = args[1]; // 14
       // String user_input3 = args[2]; // 16
      //  System.out.println(user_input1);
     //   System.out.println(user_input2);
      //  System.out.println(user_input3);
        String user_input = args[0]; // 68
        System.out.println(user_input);
        // String - Int
        System.out.println(user_input instanceof String);
        // Input - String
        int age  = Integer.parseInt(user_input);
        String result = (age < 18) ? "Minor" : (age <= 60 )  ? "Adult" : "Sr.Citizen";
        System.out.println(result);


    }
}
