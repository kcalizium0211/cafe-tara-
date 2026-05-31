package models;

public class Delivery {

    // Encapsulated Data
    private String deliveryID;
    private String customerName;
    private String address;
    private String notes;
    private String assignedRider;
    private String status;

    // Constructor
    public Delivery(String deliveryID,
                    String customerName,
                    String address,
                    String notes,
                    String assignedRider,
                    String status) {

        this.deliveryID = deliveryID;
        this.customerName = customerName;
        this.address = address;
        this.notes = notes;
        this.assignedRider = assignedRider;
        this.status = status;
    }

    // Getters
    public String getDeliveryID() {
        return deliveryID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public String getNotes() {
        return notes;
    }

    public String getAssignedRider() {
        return assignedRider;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setDeliveryID(String deliveryID) {
        this.deliveryID = deliveryID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setAssignedRider(String assignedRider) {
        this.assignedRider = assignedRider;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Display Delivery Information
    public void displayDelivery() {

        System.out.println("Delivery ID: " + deliveryID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Address: " + address);
        System.out.println("Notes: " + notes);
        System.out.println("Assigned Rider: " + assignedRider);
        System.out.println("Status: " + status);
    }
}