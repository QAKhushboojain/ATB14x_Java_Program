package ex_029_Generics;

public class Lab226_Generics_part1 {
    public static void main(String[] args) {
        temp_sum_t(10,10);
        temp_sum_t(10.34,10.45);
        temp_sum_t("Khushboo", "Jain");

    }
   /* static Integer temp_sum(Integer a, Integer b)
    {
      return a+b;
    }
    static double temp_sum(double a, double b){
        return a+b;
    } */
    static <T> T temp_sum_t(T a, T b) {
        return null;
    }
    static <MODI> MODI temp_sum1(MODI a, MODI b){
        return null;
    }
}
