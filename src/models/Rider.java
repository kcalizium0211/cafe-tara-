package models;

// Rider inherits Person
public class Rider extends User {

    // Additional rider data
    private String status;

    // Constructor
    public Rider(String username, String password, String status) {

        // Call parent constructor
        super(username, password, "Rider");

        // Set rider status
        this.status = status;
    }

    // Getter
    public String getStatus() {
        return status;
    }

    // Setter
    public void setStatus(String status) {
        this.status = status;
    }

    // Polymorphism
    @Override
    public void displayDashboard() {

        System.out.println("Rider Dashboard Opened");
    }
}