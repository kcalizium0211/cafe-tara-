package models;

public class Delivery {

    // Private fields
    private String customerName;
    private String address;
    private String orderStatus;

    // Constructor
    public Delivery(String customerName,
                    String address,
                    String orderStatus) {

        this.customerName = customerName;
        this.address = address;
        this.orderStatus = orderStatus;
    }

    // Getter
    public String getCustomerName() {
        return customerName;
    }

    // Setter
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Getter
    public String getAddress() {
        return address;
    }

    // Setter
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter
    public String getOrderStatus() {
        return orderStatus;
    }

    // Setter
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}