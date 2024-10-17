package classRelationships;

public class Coach extends TeamMember {
    private int statWins;
    private int statLosses;

    // Constructor
    public Coach(String firstName, String lastName, int age, String teamName, double salary, 
                 int statWins, int statLosses) {
        super(firstName, lastName, age, teamName, salary);  // Call the TeamMember constructor
        this.statWins = statWins;
        this.statLosses = statLosses;
    }

    // Getters
    public int getWins() {
        return statWins;
    }

    public int getLosses() {
        return statLosses;
    }

    public double getWinPercentage() {
        if (statWins + statLosses == 0) return 0;
        return (double) statWins / (statWins + statLosses) * 100;
    }

    // Methods to increment wins and losses
    public void incrementWin() {
        statWins++;
    }

    public void incrementLoss() {
        statLosses++;
    }
}