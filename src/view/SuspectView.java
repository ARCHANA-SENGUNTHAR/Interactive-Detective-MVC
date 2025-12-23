package view;

import model.Suspect;
import java.util.List;

public class SuspectView {

    public static void showSuspectList(List<Suspect> suspects) {
        System.out.println("\n Suspect List:");
        for (Suspect s : suspects) {
            System.out.println("- " + s.getName());
        }
    }
}
