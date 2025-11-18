package ex_019_Inheritance;

public class Lab0167Single_Inheritance {
    public static void main(String[] args) {
        Son khushboo = new Son();
        System.out.println(khushboo.gold_f);
        khushboo.bhk2();
        khushboo.bhk3();
        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();
        //f1.bhk3();
    }
}
