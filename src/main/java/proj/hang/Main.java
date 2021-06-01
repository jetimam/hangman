package proj.hang;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        int MAX_LIVES = 5;
        char guess;

        System.out.println(" $$ Welcome to HangMan! $$\n");

        System.out.print(" > How many lives would you like to have? ");
        int lives = scanner.nextInt();

        System.out.println("\n\nYour word has been generated, lets begin!\n");

        Word word = new Word(dictionary.generateWord(), MAX_LIVES);

        while(word.winCheck()) {
            System.out.println(" > " + word.getLives() + " lives left.\n");
            System.out.println(word);
            System.out.println("\n > Guess? ");
            guess = scanner.next().charAt(0);

            word.guess(guess);

            if (word.lossCheck()) {
                break;
            }
        }

        if (word.lossCheck()) {
            System.out.println("You lost... :(");
        }
        else {
            System.out.println("You won! :)");
        }
    }
}