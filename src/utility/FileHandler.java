package utility; // package for utility/helper classes

import java.io.FileReader; // used to read text files
import java.io.FileWriter; // used to write to files
import java.io.BufferedReader; // used for efficient file reading
import java.io.BufferedWriter; // used for efficient file writing
import models.Admin; // admin model class
import models.Rider; // rider model class
import models.User; // parent user class

// utility class for file operations (user + delivery data handling)
public class FileHandler {

    // save user information into userinfo.txt
    public static void saveUserInfo(String username, String password, String role) {
        try {
            FileWriter fw = new FileWriter("userinfo.txt", true); // open file in append mode
            BufferedWriter bw = new BufferedWriter(fw); // wrap writer for efficiency

            bw.write(username + "," + password + "," + role); // write user data in csv format
            bw.newLine(); // move to next line for next record

            bw.close(); // close writer to save changes
        } catch (Exception e) {
            System.out.println(e); // print error if writing fails
        }
    }

    // check login credentials and return corresponding user object
    public static User loginUser(String username, String password) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("userinfo.txt")); // open user file
            String line; // holds each line

            while ((line = br.readLine()) != null) { // loop through file
                String[] data = line.split(","); // split csv line

                if (data.length < 3) continue; // skip invalid lines

                String fileUser; // stored username
                String filePass; // stored password
                String role; // user role

                // support old and new file formats
                if (data.length == 3) {
                    fileUser = data[0].trim(); // username in old format
                    filePass = data[1].trim(); // password in old format
                    role = data[2].trim(); // role in old format
                } else {
                    fileUser = data[1].trim(); // username in new format
                    filePass = data[2].trim(); // password in new format
                    role = data[3].trim(); // role in new format
                }

                // check credentials
                if (username.equals(fileUser) && password.equals(filePass)) {
                    br.close(); // close reader before returning

                    if (role.equalsIgnoreCase("Admin")) {
                        return new Admin(fileUser, filePass); // return admin object
                    } else if (role.equalsIgnoreCase("Rider")) {
                        return new Rider(fileUser, filePass); // return rider object
                    }
                }
            }

            br.close(); // close file if no match found

        } catch (Exception e) {
            System.out.println("Error Logging In: " + e); // log error
        }

        return null; // return null if login fails
    }

    // count delivery statuses from deliveries.txt
    public static int[] getDeliveryStats() {
        int pending = 0; // counter for pending
        int outForDelivery = 0; // counter for in transit
        int delivered = 0; // counter for completed

        try {
            BufferedReader br = new BufferedReader(new FileReader("deliveries.txt")); // open deliveries file
            String line; // holds each line

            while ((line = br.readLine()) != null) { // read each record
                String[] data = line.split(","); // split csv line

                String status = data[5].trim(); // get status column

                if (status.equalsIgnoreCase("Pending")) {
                    pending++; // increment pending count
                } else if (status.equalsIgnoreCase("Out for Delivery")) {
                    outForDelivery++; // increment in-transit count
                } else if (status.equalsIgnoreCase("Delivered")) {
                    delivered++; // increment delivered count
                }
            }

            br.close(); // close file reader

        } catch (Exception e) {
            System.out.println(e); // print error
        }

        return new int[]{pending, outForDelivery, delivered}; // return stats array
    }
}