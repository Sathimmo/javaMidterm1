package lab;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    static void main(String[] string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int min = 1;
        int max = 20;
        int randomNumber = random.nextInt(max - min + 1) + min;
        int attempts = 0;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println("Too high! Try a lower number.");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        } while (guess != randomNumber);

        scanner.close();
    
}

