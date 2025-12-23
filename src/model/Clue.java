package model;

public class Clue {
    private String description;
    private int score;

    public Clue(String description, int score) {
        this.description = description;
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public int getScore() {
        return score;
    }
}
