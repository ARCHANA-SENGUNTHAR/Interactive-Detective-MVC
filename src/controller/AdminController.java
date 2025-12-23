package controller;

import dao.*;
import view.*;
import java.util.Scanner;

public class AdminController {
    private CaseDAO caseDAO = new CaseDAO();
    private SuspectDAO suspectDAO = new SuspectDAO();
    private Scanner sc = new Scanner(System.in);

    public void addCase() {
        System.out.print("Case Title: ");
        String title = sc.nextLine();

        System.out.print("Description: ");
        String desc = sc.nextLine();

        System.out.print("Difficulty: ");
        String diff = sc.nextLine();

        caseDAO.insertCase(title, desc, diff);
        AdminView.showSuccess("Case added successfully!");
    }

    public void addSuspect() {
        System.out.print("Case ID: ");
        int caseId = sc.nextInt();
        sc.nextLine();

        System.out.print("Suspect Name: ");
        String name = sc.nextLine();

        System.out.print("Statement: ");
        String statement = sc.nextLine();

        System.out.print("Is Guilty (true/false): ");
        boolean guilty = sc.nextBoolean();

        suspectDAO.insertSuspect(caseId, name, statement, guilty);
        AdminView.showSuccess("Suspect added successfully!");
    }
}
