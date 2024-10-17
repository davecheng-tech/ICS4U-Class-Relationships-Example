package classRelationships;

public class TeamDemo {
    public static void main(String[] args) {
        // Creating the starting lineup for the 2019 Toronto Raptors

        // Coach for the Raptors
        Coach nickNurse = new Coach("Nick", "Nurse", 52, "Toronto Raptors", 1000000, 58, 24);

        // Players for the Raptors
        Player kawhiLeonard = new Player("Kawhi", "Leonard", 28, "Toronto Raptors", 32000000, "Forward", 2, 26.6, 7.3);
        Player kyleLowry = new Player("Kyle", "Lowry", 33, "Toronto Raptors", 31000000, "Guard", 7, 14.2, 4.8);
        Player marcGasol = new Player("Marc", "Gasol", 34, "Toronto Raptors", 24000000, "Center", 33, 9.1, 6.6);
        Player pascalSiakam = new Player("Pascal", "Siakam", 25, "Toronto Raptors", 2900000, "Forward", 43, 16.9, 6.9);
        Player dannyGreen = new Player("Danny", "Green", 31, "Toronto Raptors", 10000000, "Guard", 14, 10.3, 4.0);

        // Create the Raptors team
        Player[] raptorsPlayers = {kawhiLeonard, kyleLowry, marcGasol, pascalSiakam, dannyGreen};
        Team raptors = new Team(nickNurse, raptorsPlayers);

        // Creating the starting lineup for the 2019 Golden State Warriors

        // Coach for the Warriors
        Coach steveKerr = new Coach("Steve", "Kerr", 54, "Golden State Warriors", 5000000, 57, 25);

        // Players for the Warriors
        Player stephenCurry = new Player("Stephen", "Curry", 31, "Golden State Warriors", 37457154, "Guard", 30, 27.3, 5.3);
        Player klayThompson = new Player("Klay", "Thompson", 29, "Golden State Warriors", 32742149, "Guard", 11, 21.5, 3.8);
        Player draymondGreen = new Player("Draymond", "Green", 29, "Golden State Warriors", 17864600, "Forward", 23, 7.4, 7.3);
        Player kevinDurant = new Player("Kevin", "Durant", 30, "Golden State Warriors", 30000000, "Forward", 35, 26.0, 6.4);
        Player demarcusCousins = new Player("DeMarcus", "Cousins", 28, "Golden State Warriors", 5330000, "Center", 0, 16.3, 8.2);

        // Create the Warriors team
        Player[] warriorsPlayers = {stephenCurry, klayThompson, draymondGreen, kevinDurant, demarcusCousins};
        Team warriors = new Team(steveKerr, warriorsPlayers);

        // Output team information
        System.out.println("Team 1: Toronto Raptors");
        displayTeamInfo(raptors);

        System.out.println("\nTeam 2: Golden State Warriors");
        displayTeamInfo(warriors);
    }

    // Method to display team information
    public static void displayTeamInfo(Team team) {
        // Display coach details
        Coach coach = team.getCoach();
        System.out.println("Coach: " + coach.getName() + " | Wins: " + coach.getWins() + " | Losses: " + coach.getLosses() + " | Win Percentage: " + coach.getWinPercentage());

        // Display players' details
        System.out.println("Players:");
        for (Player player : team.getPlayers()) {
            System.out.println(player.getName() + " | Position: " + player.getPosition() + " | PPG: " + player.getPPG() + " | RPG: " + player.getRPG());
        }

        // Display total salary
        System.out.println("Total Team Salary: $" + team.getTotalSalary());
        System.out.println("Team Size: " + team.getSize());
    }
}