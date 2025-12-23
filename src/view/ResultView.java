package view;

import model.Player;

public class ResultView {
    public static void showWin(Player p) {
        System.out.println("\n CASE SOLVED!");
        System.out.println("Score: " + p.getScore());
    }

    public static void showLose() {
        System.out.println("\n WRONG ACCUSATION. CASE FAILED.");
    }
}
