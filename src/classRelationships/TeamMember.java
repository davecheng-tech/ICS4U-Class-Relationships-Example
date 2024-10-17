package classRelationships;

public class TeamMember extends Person {
    private String teamName;
    private double salary;

    // Constructor
    public TeamMember(String firstName, String lastName, int age, String teamName, double salary) {
        super(firstName, lastName, age);  // Call the Person constructor
        this.teamName = teamName;
        this.salary = salary;
    }

    // Getters and setters
    public String getTeamName() {
        return teamName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}