package models;

// Admin inherits Person
public class Admin extends User {

    // Constructor
    public Admin(String username, String password) {

        // Calls parent constructor
        super(username, password, "Admin");
    }

    // Polymorphism (Method Override)
    @Override
    public void login() {

        System.out.println("Admin Login");
    }
}