package model;

public class Player {
    private String name;
    private int score;
    private int hintsUsed;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void addScore(int s) {
        score += s;
    }

    public int getScore() {
        return score;
    }

    public void useHint() {
        hintsUsed++;
    }

    public int getHintsUsed() {
        return hintsUsed;
    }
}
