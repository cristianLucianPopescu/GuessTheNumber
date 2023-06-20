import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) throws Exception {
        
        // declare variables
        int secretNumber;
        int guess;
        boolean correctGuess = false;

        // generate random number between 1 and 20
        Scanner input = new Scanner(System.in);
        secretNumber = (int) (Math.random() * 20 + 1);
        System.out.println("Guess the number between 1 and 20.");

        // prompt user to guess the number
        while (correctGuess == false) {

            System.out.print("Enter a number: ");
            guess = input.nextInt();

            // check if guess is correct and give feedback
            if (guess == secretNumber) {
                correctGuess = true;
                System.out.println("You are correct!");
            } else if (guess > secretNumber) {
                System.out.println("Your guess is too high.");
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low.");
            }
        }

        input.close();
    }    
}
