package ex_016_Arrays;

public class Lab0143_Arrays {
    public static void main(String[] args) {
        int[] marks = {91,90,51,100,91,92,89};
      //  int marks[] = {91,90,51,100,91,92,89};
        boolean [] is_married_people = {true, true, false};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);
      //  System.out.println(marks[-1]); //  ArrayIndexOutOfBoundsException
        String name = "Khushboo";
        String[] name_each_element_char = name.split("");
      //  System.out.println(name_each_element_char);
        for(String s : name_each_element_char)
        {
            System.out.println(s);
        }


    }
}
