package frames;

import models.Rider; // import rider model class
import java.io.BufferedReader; // used to read text files line by line
import java.io.FileReader; // used to open and read files

public class RiderProfile extends javax.swing.JFrame { // create rider profile form
    private Rider rider; // variable to store logged in rider
    
    public RiderProfile(Rider rider) { // constructor with rider parameter
        initComponents(); // initialize form components
        this.rider = rider; // store rider object into variable
        loadProfile(); // load rider profile information
    }
    
    public void loadProfile() { // method to load rider profile
    try { // start try block
        BufferedReader br = new BufferedReader(new FileReader("userinfo.txt")); // open user info file
        String line; // variable to store each line

        while ((line = br.readLine()) != null) { // read file line by line
            String[] data = line.split(","); // split line using comma
            if (data[1].trim().equalsIgnoreCase(rider.getUsername())) { // check matching username
                lblRidersId.setText(data[0]); // display rider id
                lblFullname.setText(data.length > 4 ? data[4] : "-"); // display full name
                lblAddress.setText(data.length > 5 ? data[5] : "-"); // display address
                lblContactNo.setText(data.length > 6 ? data[6] : "-"); // display contact number
                lblVehicleType.setText(data.length > 7 ? data[7] : "-"); // display vehicle type
                lblPlateNo.setText(data.length > 8 ? data[8] : "-"); // display plate number
                break; // stop loop after finding rider
            }
        }
        br.close(); // close file reader
    } catch (Exception e) { // catch errors
        System.out.println(e); // print error in console
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
        btnEditProfile = new javax.swing.JButton();
        lblRidersId = new javax.swing.JLabel();
        VEHICLLETYPE = new javax.swing.JLabel();
        PLATENO = new javax.swing.JLabel();
        btnBacktoDashboard = new javax.swing.JButton();
        lblFullname = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblContactNo = new javax.swing.JLabel();
        lblVehicleType = new javax.swing.JLabel();
        lblPlateNo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(210, 180, 145));
        jPanel2.setLayout(null);

        lblad.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblad.setForeground(new java.awt.Color(62, 39, 35));
        lblad.setText("RIDER'S PROFILE");
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

        btnEditProfile.setBackground(new java.awt.Color(111, 78, 55));
        btnEditProfile.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnEditProfile.setForeground(new java.awt.Color(243, 233, 220));
        btnEditProfile.setText("EDIT PROFILE");
        btnEditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProfileActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditProfile);
        btnEditProfile.setBounds(60, 360, 120, 23);

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

        btnBacktoDashboard.setBackground(new java.awt.Color(111, 78, 55));
        btnBacktoDashboard.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnBacktoDashboard.setForeground(new java.awt.Color(243, 233, 220));
        btnBacktoDashboard.setText("BACK");
        btnBacktoDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacktoDashboardActionPerformed(evt);
            }
        });
        jPanel2.add(btnBacktoDashboard);
        btnBacktoDashboard.setBounds(190, 360, 120, 23);

        lblFullname.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblFullname.setForeground(new java.awt.Color(62, 39, 35));
        lblFullname.setText("-");
        jPanel2.add(lblFullname);
        lblFullname.setBounds(150, 200, 210, 16);

        lblAddress.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(62, 39, 35));
        lblAddress.setText("-");
        jPanel2.add(lblAddress);
        lblAddress.setBounds(150, 230, 210, 16);

        lblContactNo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblContactNo.setForeground(new java.awt.Color(62, 39, 35));
        lblContactNo.setText("-");
        jPanel2.add(lblContactNo);
        lblContactNo.setBounds(150, 260, 210, 16);

        lblVehicleType.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblVehicleType.setForeground(new java.awt.Color(62, 39, 35));
        lblVehicleType.setText("-");
        jPanel2.add(lblVehicleType);
        lblVehicleType.setBounds(150, 290, 210, 16);

        lblPlateNo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblPlateNo.setForeground(new java.awt.Color(62, 39, 35));
        lblPlateNo.setText("-");
        jPanel2.add(lblPlateNo);
        lblPlateNo.setBounds(150, 320, 210, 16);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 370, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProfileActionPerformed
     new EditProfile(rider).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEditProfileActionPerformed

    private void btnBacktoDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacktoDashboardActionPerformed
     new RiderDashboard(rider).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBacktoDashboardActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
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
    private javax.swing.JButton btnBacktoDashboard;
    private javax.swing.JButton btnEditProfile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblFullname;
    private javax.swing.JLabel lblPlateNo;
    private javax.swing.JLabel lblRidersId;
    private javax.swing.JLabel lblVehicleType;
    private javax.swing.JLabel lblad;
    private javax.swing.JLabel lblpfp;
    // End of variables declaration//GEN-END:variables
}
