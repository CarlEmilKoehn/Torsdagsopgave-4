public class Main {
    public static void main(String[] args) {
        
        Team team1 = new Team("De Uovervindelige");
        team1.setRank(3);

        
        team1.addPlayer("Jens");
        team1.addPlayer("Ida");
        team1.addPlayer("Carl");

        
        System.out.println(team1);

        
        Team team2 = new Team("De Sejrende");
        team2.setRank(1);
        team2.addPlayer("David");
        team2.addPlayer("Eva");
        
        Team team3 = new Team("De Hurtige");
        team3.setRank(5);
        team3.addPlayer("Bent");
        team3.addPlayer("Inger");

        Team team4 = new Team("De Stærke");
        team4.setRank(2);
        team4.addPlayer("Daniel");
        team4.addPlayer("Kristine");

        Team team5 = new Team("De Klare");
        team5.setRank(4);
        team5.addPlayer("Robert");
        team5.addPlayer("Karen");

        Team team6 = new Team("De Fede");
        team6.setRank(6);
        team6.addPlayer("Abraham");
        team6.addPlayer("Lincoln");

        System.out.println(team2);
        System.out.println(team3);
        System.out.println(team4);
        System.out.println(team5);
        System.out.println(team6);
    }
}
