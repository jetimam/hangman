package proj.hang;

public class Word {
    private char[] word;
    private int[] wordCheck;
    private int lives;

    public Word(String word, int lives) {
        this.word = word.toCharArray();
        this.wordCheck = new int[this.word.length];
        this.lives = lives;
    }

    public String toString() {
        String value = "";

        for (int i = 0; i < word.length; i++) {
            if (wordCheck[i] == 0) {
                value += "_ ";
            }
            else {
                value += word[i];
            }
        }

        return value;
    }

    public void guess(char value) {
        int counter = 0;
        for (int i = 0; i < word.length; i++) {
            if (value == word[i]) {
                wordCheck[i] = 1;
                counter++;
            }
        }

        if (counter == 0) {
            loseALimb();
        }
    }

    public char[] getWord() {
        return this.word;
    }

    public int getLives() {
        return this.lives;
    }

    public void loseALimb() {
        this.lives--;
    }
}