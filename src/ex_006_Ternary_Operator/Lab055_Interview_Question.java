package ex_006_Ternary_Operator;

public class Lab055_Interview_Question {
    public static void main(String[] args) {
        int age = 21;
        String result = (age > 18) ? (age > 25 ? "You can drink" : "You can go to Goa but you can't  drink") : "No";
        System.out.println(result);
     }
}
