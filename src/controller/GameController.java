package controller;

import view.*;
import java.util.Scanner;

public class GameController {

    private Scanner sc = new Scanner(System.in);
    private AdminController adminController = new AdminController();
    private PlayController playController = new PlayController();

    public void startGame() {
        GameView.showWelcome();

        while (true) {
            MenuView.showMainMenu();
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> playController.play();
                case 2 -> adminController.addCase();
                case 3 -> adminController.addSuspect();
                case 4 -> {
                    System.out.println(" Exiting game.");
                    return;
                }
                default -> System.out.println(" Invalid choice");
            }
        }
    }
}
