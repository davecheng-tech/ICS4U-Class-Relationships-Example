package classRelationships;

public class Player extends TeamMember {
    private String position;
    private int playerNumber;
    private double statPPG;  // Points Per Game
    private double statRPG;  // Rebounds Per Game

    // Constructor
    public Player(String firstName, String lastName, int age, String teamName, double salary, 
                  String position, int playerNumber, double statPPG, double statRPG) {
        super(firstName, lastName, age, teamName, salary);  // Call the TeamMember constructor
        this.position = position;
        this.playerNumber = playerNumber;
        this.statPPG = statPPG;
        this.statRPG = statRPG;
    }

    // Getters and setters
    public String getPosition() {
        return position;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public double getPPG() {
        return statPPG;
    }

    public void setPPG(double statPPG) {
        this.statPPG = statPPG;
    }

    public double getRPG() {
        return statRPG;
    }

    public void setRPG(double statRPG) {
        this.statRPG = statRPG;
    }
}