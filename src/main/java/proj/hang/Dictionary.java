package proj.hang;
import java.lang.Math;

public class Dictionary {
    private String[] array = {"banana", "cat", "computer", "modem", "magazine", "airport", "purse", "dragon", "blanket", "lawyer", "keyboard"};

    public Dictionary() {}

    public String generateWord() {
        int max = array.length - 1;
        int min = 1;
        int range = max - min + 1;

        int i = (int)(Math.random() * range) + min;
        return array[i];
    }
}