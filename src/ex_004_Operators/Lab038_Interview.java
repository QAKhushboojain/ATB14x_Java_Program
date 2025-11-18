package ex_004_Operators;

public class Lab038_Interview {
    public static void main(String[] args) {
        int balaji_salary = 12;
        boolean b = !(balaji_salary > 10 || balaji_salary <5);
        System.out.println(b);
        // using divide and conquer method
        // A - balaji salary > 10, 12 > 10 - true
        //  B - balaji salary < 5, 12 < 5 - false
        // (A || B) - True
        // ! (A || B) - False
        // ! (true) - false
    }
}
