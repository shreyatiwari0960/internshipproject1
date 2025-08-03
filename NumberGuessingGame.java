import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();  

        char playAgain = 'Y'; 
        int score = 0;         

        System.out.println("=== Welcome to Number Guessing Game ===");

        
        while (playAgain == 'Y' || playAgain == 'y') {
            int number = rand.nextInt(100) + 1;  
            int attempts = 5;  
            boolean win = false;

            System.out.println("\nI have chosen a number between 1 and 100.");
            System.out.println("You have 5 attempts to guess it!");

            
            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();  

                
                if (guess == number) {
                    System.out.println("Congratulations! You guessed the number.");
                    win = true;
                    score++;  
                    break;
                } else if (guess > number) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }

                attempts--;  
                if (attempts > 0) {
                    System.out.println("Attempts left: " + attempts);
                }
            }

            if (!win) {
                System.out.println("Sorry! The number was: " + number);
            }

            
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = sc.next().charAt(0);
        }

        
        System.out.println("\nGame Over! Your total score (rounds won): " + score);
        System.out.println("Thank you for playing!");
        sc.close();
    }
}
