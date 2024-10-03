import java.util.ArrayList;
import java.util.Scanner;

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

    // 5.a
    public String getAction() {
        System.out.println("Type a number to choose an action:");

       
        for (String action : actions) {
            System.out.println(action);
        }

        // 5.b
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        // 5.c
        return choice;
    }
}

