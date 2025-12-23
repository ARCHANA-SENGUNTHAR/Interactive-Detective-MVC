package view;

import model.Case;

public class CaseView {
    public static void showCase(Case c) {

        if (c == null) {
            System.out.println(" ERROR: No case data received.");
            System.out.println(" Check database or CaseDAO logic.");
            return;
        }

        System.out.println("\nCASE: " + c.getTitle());
        System.out.println(c.getDescription());
    }
}
