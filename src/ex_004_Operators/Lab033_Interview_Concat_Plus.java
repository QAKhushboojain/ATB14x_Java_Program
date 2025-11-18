package ex_004_Operators;

public class Lab033_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Khushboo";
        String last_name = "Jain";
        int a = 10;
        int b = 10;
        System.out.println(first_name+last_name+a+b);
        System.out.println(a+b+first_name+last_name);
        // BODMAS Rule Follow -
        System.out.println(first_name+last_name+(a+b));
        // + -> Operator overloading
        // + -> behave differently with the data type
        // + - String - concatenation

    }
}
