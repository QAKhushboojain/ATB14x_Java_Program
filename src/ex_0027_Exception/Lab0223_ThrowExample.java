package ex_0027_Exception;

import java.util.Scanner;

public class Lab0223_ThrowExample {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age \n");
        int user_age = scanner.nextInt();
        validate_age_for_club(user_age);
    }
    static void validate_age_for_club(int age) throws Exception {
     if(age < 25)
     try{
         throw  new Exception("Age can't be less than 25");
     } catch (Exception e){
         System.out.println("Age issue");
     }
     else {
         System.out.println("Enjoying Clubiing");
     }
    }
}
