package proj.hang;

public class Word {
    String word;
    int lives;

    public Word(String word, int lives) {
        this.word = word;
        this.lives = lives;
    }

    public String getWord() {
        return this.word;
    }
}