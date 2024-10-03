import java.util.ArrayList;

public class GameMenu {
    // 4.b
    private ArrayList<String> actions;

    // 4.c og 4.d
    public GameMenu(ArrayList<String> actions) {
        this.actions = actions;  
    }

    // 4.h
    public void displayMenu() {
        for (String action : actions) {
            System.out.println(action);
        }
    }
}
