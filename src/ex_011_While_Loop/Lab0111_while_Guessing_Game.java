package ex_011_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab0111_while_Guessing_Game {
    public static void main(String[] args) {
        // Guess the number between 1 to 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
        System.out.println(numberToGuess);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int guess;
        int attempts = 0;
        while (true)
        {
            if(scanner.hasNextInt())
            {
                System.out.println("Invalid input! Please Enter a number");
                scanner.next();
                continue;
            }
            guess = scanner.nextInt();
            attempts++;
            if (guess < 1 ||  guess > 100)
            {
                System.out.println("Please Enter the number between 1 to 100");
                continue;
            }
            if(guess < numberToGuess)
            {
                System.out.println("Too low, Try again");
            } else if (guess > numberToGuess)
            {
                System.out.println("Too high, Try again");
            }
            else
            {
                System.out.println("Correct! You guess it in"+ attempts + "attempts");
                break;
            }
        }
    }
}
