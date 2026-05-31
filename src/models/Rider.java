package models;

// Rider inherits Person
public class Rider extends User {

    // Additional rider data
    private String riderID;
    private String fullname;
    private String address;
    private String contactNo;
    private String vehicleType;
    private String plateNo;
    private String status;

    public Rider (String username, String password)  {
        super(username, password, "Rider");
    }

// Constructor
    public Rider(String username, 
                 String password,
                 String riderID, 
                 String fullname, 
                 String address, 
                 String contactNo, 
                 String vehicleType, 
                 String plateNo,
                 String status) {
        
        super(username, password, "Rider");
        
        // Set rider status
        this.riderID=riderID;
        this.fullname=fullname;
        this.address=address;
        this.contactNo=contactNo;
        this.vehicleType=vehicleType;
        this.plateNo=plateNo;
        this.status = status;
    }

    // Getter
    public String getRiderID () {
        return riderID;
    }
    
    public String getFullname () {
        return fullname;
    }
    
    public String getAddress () {
        return address;
    }
    
    public String getContactNo () {
        return contactNo;
    }
    
    public String getVehicleType () {
        return vehicleType;
    }
    
    public String getPlateNo () {
        return plateNo;
    }
    
    public String getStatus() {
        return status;
    }

    // Setter
    public void setRiderID (String riderID) {
        this.riderID = riderID;
    }
    
    public void setFullname (String fullname) {
        this.fullname = fullname;
    }
    
    public void setAddress (String address) {
        this.address = address;
    }
    
    public void setContactNo (String contactNo) {
        this.contactNo= contactNo;
    }
    
    public void setVehicleType (String vehicleType) {
        this.vehicleType = vehicleType;
    }
    
    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    // Polymorphism
    @Override
    public void login() {

        System.out.println("Rider Login");
    }
}