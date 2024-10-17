package classRelationships;

public class Team {
    private Coach coach;
    private Player[] players;

    // Constructor
    public Team(Coach coach, Player[] players) {
        this.coach = coach;
        this.players = players;
    }

    // Getters
    public Coach getCoach() {
        return coach;
    }

    public Player[] getPlayers() {
        return players;
    }

    // Get total salary for the team
    public double getTotalSalary() {
        double totalSalary = coach.getSalary();
        for (Player player : players) {
            totalSalary += player.getSalary();
        }
        return totalSalary;
    }

    // Get the size of the team (number of players)
    public int getSize() {
        return players.length;
    }
}