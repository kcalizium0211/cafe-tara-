package utility;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import models.Admin;
import models.Rider;
import models.User;


// Utility class
public class FileHandler {

    // Method to save user info
    public static void saveUserInfo(String username,String password, String role) {

        try {
            // Create FileWriter
            FileWriter fw =  new FileWriter("userinfo.txt", true);

            // Create BufferedWriter
            BufferedWriter bw =  new BufferedWriter(fw);
            bw.write(username + "," + password + "," + role); // Write data to file
            bw.newLine();// Move to next line
            bw.close(); // Close BufferedWriter
        } catch(Exception e) {
            
            // Error message
            System.out.println(e);
        }
    }
    
    public static User loginUser(String username, String password) {

    try {
        BufferedReader br = new BufferedReader(new FileReader("userinfo.txt"));

        String line;

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            // ✅ prevent crash from bad lines
            if (data.length < 3) continue;

            String fileUser;
            String filePass;
            String role;

            // ✅ supports BOTH old and new format
            if (data.length == 3) {
                fileUser = data[0].trim();
                filePass = data[1].trim();
                role = data[2].trim();
            } else {
                fileUser = data[1].trim();  // username
                filePass = data[2].trim();  // password
                role = data[3].trim();      // role
            }

            // ✅ login check
            if (username.equals(fileUser) && password.equals(filePass)) {

                br.close();

                if (role.equalsIgnoreCase("Admin")) {
                    return new Admin(fileUser, filePass);
                } 
                else if (role.equalsIgnoreCase("Rider")) {
                    return new Rider(fileUser, filePass);
                }
            }
        }

        br.close();

    } catch (Exception e) {
        System.out.println("Error Logging In: " + e);
    }

    return null;
}

   
    public static int[] getDeliveryStats() {
    int pending = 0;
    int outForDelivery = 0;
    int delivered = 0;

    try {
        BufferedReader br = new BufferedReader(new FileReader("deliveries.txt"));

        String line;

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            String status = data[5].trim();

            if (status.equalsIgnoreCase("Pending")) {
                pending++;
            }
            else if (status.equalsIgnoreCase("Out for Delivery")) {
                outForDelivery++;
            }
            else if (status.equalsIgnoreCase("Delivered")) {
                delivered++;
            }
        }

        br.close();

    } catch (Exception e) {
        System.out.println(e);
    }

    return new int[]{pending, outForDelivery, delivered};
}
    
    
}
    
