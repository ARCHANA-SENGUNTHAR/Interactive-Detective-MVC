package controller;

import dao.*;
import model.*;
import view.*;

import java.util.*;

public class PlayController {

    private CaseDAO caseDAO = new CaseDAO();
    private SuspectDAO suspectDAO = new SuspectDAO();
    private Scanner sc = new Scanner(System.in);

    public void play() {
        System.out.print("Enter Detective Name: ");
        Player player = new Player(sc.nextLine());

        List<Case> cases = caseDAO.getAllCases();

        if (cases.isEmpty()) {
            System.out.println(" No cases available. Ask admin to add cases.");
            return;
        }

        System.out.println("\nAvailable Cases:");
        for (Case c : cases) {
            System.out.println(c.getId() + ". " + c.getTitle());
        }

        System.out.print("Choose Case ID: ");
        int caseId = sc.nextInt();
        sc.nextLine();

        Case selectedCase = cases.stream()
                .filter(c -> c.getId() == caseId)
                .findFirst()
                .orElse(null);

        CaseView.showCase(selectedCase);

        List<Suspect> suspects = suspectDAO.getSuspectsByCase(caseId);

        for (Suspect s : suspects) {
            InterviewView.interview(s);
        }

        SuspectView.showSuspectList(suspects);

        System.out.print("Who is the culprit? ");
        String answer = sc.nextLine();

        boolean correct = suspects.stream()
                .anyMatch(s -> s.getName().equalsIgnoreCase(answer) && s.isGuilty());

        if (correct) {
            player.addScore(100);
            ResultView.showWin(player);
        } else {
            ResultView.showLose();
        }
    }
}
