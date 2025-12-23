package app;

import controller.GameController;

public class MainApp {
    public static void main(String[] args) {
        GameController game = new GameController();
        game.startGame();
    }
}
