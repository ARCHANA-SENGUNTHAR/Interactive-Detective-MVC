package view;

import model.Suspect;

public class InterviewView {
    public static void interview(Suspect s) {
        System.out.println("\nInterviewing: " + s.getName());
        System.out.println("Statement: " + s.getStatement());
    }
}
