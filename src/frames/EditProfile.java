package frames;

import java.io.BufferedReader; // used to read text files line by line
import java.io.File; // used to work with files
import java.io.FileReader; // used to open and read files
import java.io.FileWriter; // used to write into files
import java.io.PrintWriter; // used to write formatted text into files
import models.Rider; // import rider model class

public class EditProfile extends javax.swing.JFrame { // create edit profile form
    private Rider rider; // variable to store logged in rider

    public EditProfile(Rider rider) { // constructor with rider parameter
        initComponents(); // initialize form components
        this.rider = rider; // store rider object into variable
        loadProfile(); // load rider profile data
    }
    
    public void loadProfile() { // method to load rider profile
    try { // start try block
        BufferedReader br = new BufferedReader(new FileReader("userinfo.txt")); // open user info file
        String line; // variable to store each line

        while ((line = br.readLine()) != null) { // read file line by line
            String[] data = line.split(","); // split line using comma
            if (data.length >= 10 && // check if data is complete
                data[1].trim().equalsIgnoreCase(rider.getUsername())) { // check matching username
                //load profile using setters
                rider.setRiderID(data[0]);
                rider.setFullname(data[4]); 
                rider.setAddress(data[5]); 
                rider.setContactNo(data[6]); 
                rider.setVehicleType(data[7]); 
                rider.setPlateNo(data[8]); 
                rider.setStatus(data[9]); 

                lblRidersId.setText(rider.getRiderID()); // display rider id
                txtFullname.setText(rider.getFullname()); // display full name
                txtAddress.setText(rider.getAddress()); // display address
                txtContactNo.setText(rider.getContactNo()); // display contact number
                txtvehicleType.setText(rider.getVehicleType()); // display vehicle type
                txtPlateNo.setText(rider.getPlateNo()); // display plate number
                break; // stop loop after finding rider
            }
        }

        br.close(); // close file reader

    } catch (Exception e) { // catch errors
        e.printStackTrace(); // print error details
    }
}
    private void saveProfile() { // method to save updated profile
    try { // start try block

        // update rider object using setters
        rider.setFullname(txtFullname.getText().trim()); 
        rider.setAddress(txtAddress.getText().trim()); 
        rider.setContactNo(txtContactNo.getText().trim()); 
        rider.setVehicleType(txtvehicleType.getText().trim()); 
        rider.setPlateNo(txtPlateNo.getText().trim()); 
        
        File inputFile = new File("userinfo.txt"); // original file
        File tempFile = new File("temp.txt"); // temporary file

        BufferedReader br = new BufferedReader(new FileReader(inputFile)); // read original file
        PrintWriter pw = new PrintWriter(new FileWriter(tempFile)); // write into temp file
        
        String line; // variable to store each line
        while ((line = br.readLine()) != null) { // read file line by line
            String[] data = line.split(","); // split line using comma
            if (data.length >= 10 && // check if data is complete
                data[1].trim().equalsIgnoreCase(rider.getUsername())) { // check matching username
                data[4] = rider.getFullname(); // update full name
                data[5] = rider.getAddress(); // update address
                data[6] = rider.getContactNo(); // update contact number
                data[7] = rider.getVehicleType(); // update vehicle type
                data[8] = rider.getPlateNo(); // update plate number
                data[9] = rider.getStatus(); // update status
                line = String.join(",", data); // combine updated data into one line
            }
            pw.println(line); // write line into temp file
        }

        br.close(); // close file reader
        pw.close(); // close print writer
        inputFile.delete(); // delete old file
        tempFile.renameTo(inputFile); // rename temp file into original file

        javax.swing.JOptionPane.showMessageDialog(this, "Profile updated successfully!"); // show success message

    } catch (Exception e) { // catch errors
        javax.swing.JOptionPane.showMessageDialog(
                this, "Error: " + e.getMessage()); // show error message
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblad = new javax.swing.JLabel();
        RIDERSID = new javax.swing.JLabel();
        FULLNAME = new javax.swing.JLabel();
        ADDRESS = new javax.swing.JLabel();
        CONTACTNO = new javax.swing.JLabel();
        lblpfp = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblRidersId = new javax.swing.JLabel();
        VEHICLLETYPE = new javax.swing.JLabel();
        PLATENO = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        txtvehicleType = new javax.swing.JTextField();
        txtPlateNo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(210, 180, 140));
        jPanel2.setLayout(null);

        lblad.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblad.setForeground(new java.awt.Color(62, 39, 35));
        lblad.setText("EDIT PROFILE");
        jPanel2.add(lblad);
        lblad.setBounds(15, 19, 180, 24);

        RIDERSID.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        RIDERSID.setForeground(new java.awt.Color(62, 39, 35));
        RIDERSID.setText("RIDER'S ID:");
        jPanel2.add(RIDERSID);
        RIDERSID.setBounds(30, 170, 87, 16);

        FULLNAME.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        FULLNAME.setForeground(new java.awt.Color(62, 39, 35));
        FULLNAME.setText("FULL NAME:");
        jPanel2.add(FULLNAME);
        FULLNAME.setBounds(30, 200, 87, 16);

        ADDRESS.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ADDRESS.setForeground(new java.awt.Color(62, 39, 35));
        ADDRESS.setText("ADDRESS:");
        jPanel2.add(ADDRESS);
        ADDRESS.setBounds(30, 230, 87, 16);

        CONTACTNO.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        CONTACTNO.setForeground(new java.awt.Color(62, 39, 35));
        CONTACTNO.setText("CONTACT NO.:");
        jPanel2.add(CONTACTNO);
        CONTACTNO.setBounds(30, 260, 102, 16);

        lblpfp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpfp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/profile3.png"))); // NOI18N
        lblpfp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblpfp);
        lblpfp.setBounds(132, 49, 100, 100);

        btnSave.setBackground(new java.awt.Color(111, 78, 55));
        btnSave.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(243, 233, 220));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave);
        btnSave.setBounds(90, 370, 192, 23);

        lblRidersId.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblRidersId.setForeground(new java.awt.Color(62, 39, 35));
        lblRidersId.setText("-");
        jPanel2.add(lblRidersId);
        lblRidersId.setBounds(150, 170, 210, 16);

        VEHICLLETYPE.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        VEHICLLETYPE.setForeground(new java.awt.Color(62, 39, 35));
        VEHICLLETYPE.setText("VEHICLE TYPE:");
        jPanel2.add(VEHICLLETYPE);
        VEHICLLETYPE.setBounds(30, 290, 102, 16);

        PLATENO.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        PLATENO.setForeground(new java.awt.Color(62, 39, 35));
        PLATENO.setText("PLATE NO.:");
        jPanel2.add(PLATENO);
        PLATENO.setBounds(30, 320, 102, 16);
        jPanel2.add(txtFullname);
        txtFullname.setBounds(150, 200, 200, 22);
        jPanel2.add(txtAddress);
        txtAddress.setBounds(150, 230, 200, 22);
        jPanel2.add(txtContactNo);
        txtContactNo.setBounds(150, 260, 200, 22);
        jPanel2.add(txtvehicleType);
        txtvehicleType.setBounds(150, 290, 200, 22);
        jPanel2.add(txtPlateNo);
        txtPlateNo.setBounds(150, 320, 200, 22);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 380, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
     //check if the txt is empty or not
        if (txtFullname.getText().trim().isEmpty()
            || txtAddress.getText().trim().isEmpty()
            || txtContactNo.getText().trim().isEmpty()
            || txtvehicleType.getText().trim().isEmpty()
            || txtPlateNo.getText().trim().isEmpty()) {

        javax.swing.JOptionPane.showMessageDialog(this,"Please fill in all fields.");
        return;
    }
        saveProfile();
        
    new RiderProfile(rider).setVisible(true);
    dispose();
    
    }//GEN-LAST:event_btnSaveActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
    // RiderProfile requires a Rider object from login
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADDRESS;
    private javax.swing.JLabel CONTACTNO;
    private javax.swing.JLabel FULLNAME;
    private javax.swing.JLabel PLATENO;
    private javax.swing.JLabel RIDERSID;
    private javax.swing.JLabel VEHICLLETYPE;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblRidersId;
    private javax.swing.JLabel lblad;
    private javax.swing.JLabel lblpfp;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtPlateNo;
    private javax.swing.JTextField txtvehicleType;
    // End of variables declaration//GEN-END:variables
}
