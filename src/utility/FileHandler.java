package utility;

import java.io.FileWriter;
import java.io.BufferedWriter;

// Utility class
public class FileHandler {

    // Method to save user info
    public static void saveUserInfo(String username,String password, String role) {

        try {
            // Create FileWriter
            FileWriter fw =  new FileWriter("C:\\Users\\kim\\OneDrive\\Dokumen\\CompSci File\\PROJECTS\\Cafe, tara\\cafe-tara-\\src\\utility\\userinfo.txt", true);

            // Create BufferedWriter
            BufferedWriter bw =  new BufferedWriter(fw);
            bw.write(username + "," + password + "," + role); // Write data to file
            bw.newLine();// Move to next line
            bw.close(); // Close BufferedWriter

            // Console message
            System.out.println( "User info saved");

        } catch(Exception e) {
            
            // Error message
            System.out.println(e);
        }
    }
}