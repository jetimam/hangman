package proj.hang;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();

        System.out.println(" > Welcome to HangMan!\n");

        System.out.print(" $ How many lives would you like to have? > ");

        int lives = scanner.nextInt();

        System.out.println("\n\nYour word has been generated, lets begin!\n");
        Word word = new Word(dictionary.getWord(), 5);

        System.out.println(word.getWord());
    }
}