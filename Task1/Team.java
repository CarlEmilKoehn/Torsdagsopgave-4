import java.util.ArrayList;

public class Team {
    // Private instance variables
    private String teamName;
    private int rank;
    private ArrayList<String> playerNames;

    // Constructor with a parameter for team name
    public Team(String teamName) {
        this.teamName = teamName;
        this.playerNames = new ArrayList<>();
    }

    // Setter method for rank
    public void setRank(int rank) {
        this.rank = rank;
    }

    // Method to add a player name to the list
    public void addPlayer(String playerName) {
        playerNames.add(playerName);
    }

    // toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hold: ").append(teamName).append(" Rang: ").append(rank).append("\n");
        sb.append("Players:\n");
        for (String player : playerNames) {
            sb.append(player).append("\n");
        }
        return sb.toString();
    }
}
