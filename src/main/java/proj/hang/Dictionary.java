package proj.hang;
import java.lang.Math;

public class Dictionary {
    String[] array = {"banana", "cat", "computer", "modem", "magazine", "airport"};

    public Dictionary() {}

    public String getWord() {
        int max = array.length - 1;
        int min = 1;
        int range = max - min + 1;

        int i = (int)(Math.random() * range) + min;
        return array[i];
    }
}