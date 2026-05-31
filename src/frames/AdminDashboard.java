package frames;

import java.io.BufferedReader; // used to read text files line by line
import java.io.FileReader; // used to open and read files
import java.io.IOException; // handles file reading errors
import javax.swing.JOptionPane; // used for popup messages
import javax.swing.JComboBox; // used for combo box component
import javax.swing.table.DefaultTableModel; // used to manage table data
import utility.FileHandler; // import file handling utility class
import models.Delivery; // import delivery model class


public class AdminDashboard extends javax.swing.JFrame { // create admin dashboard form
    public AdminDashboard() { // constructor for admin dashboard
        initComponents(); // initialize form components
        loadDeliveries(); // load delivery data into table
        loadStats(); // load delivery statistics
    }

    public void loadDeliveries() { // method to load deliveries from file
    try { // start try block to catch errors
        BufferedReader br = new BufferedReader(new FileReader("deliveries.txt")); // open deliveries file for reading
        String line; // variable to store each line from file
        DefaultTableModel model = (DefaultTableModel) tblRecentDelivery.getModel(); // get table model of delivery table
        model.setRowCount(0); // clear existing rows in table

        while ((line = br.readLine()) != null) { // read each line until end of file
            String[] data = line.split(",",6); // split line into 6 parts using comma
            if (data.length < 6) continue; // skip line if data is incomplete
            Delivery d = new Delivery(data[0], data[1], data[2], data[3], data[4], data[5]); // create delivery object
            model.addRow(new Object[]{ // add delivery data into table row
                d.getDeliveryID(), // get delivery id
                d.getAssignedRider(), // get assigned rider
                d.getStatus(), // get delivery status
                d.getNotes() // get delivery notes
        });
    }
        br.close(); // close the file reader
    } catch (Exception e) { // catch any errors
        System.out.println(e); // print error in console
        }
    }
    public void loadStats() { // method to load delivery statistics
    int[] stats = FileHandler.getDeliveryStats(); // get delivery statistics from filehandler
    lblCountPending.setText(String.valueOf(stats[0])); // display pending count
    lblCountOutDelivery.setText(String.valueOf(stats[1])); // display out for delivery count
    lblCountDeliver.setText(String.valueOf(stats[2])); // display delivered count
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminDashboard = new javax.swing.JPanel();
        RecentDelivery = new javax.swing.JScrollPane();
        tblRecentDelivery = new javax.swing.JTable();
        lblAdminDashboard = new javax.swing.JLabel();
        lblRecentDelivery = new javax.swing.JLabel();
        riderDateUpdate = new javax.swing.JLabel();
        pendingDeliveries = new javax.swing.JPanel();
        lblCountPending = new javax.swing.JLabel();
        lblPending = new javax.swing.JLabel();
        pendingIcon = new javax.swing.JLabel();
        activeRiders = new javax.swing.JPanel();
        lblOutDelivery = new javax.swing.JLabel();
        lblCountOutDelivery = new javax.swing.JLabel();
        activeRidersIcon = new javax.swing.JLabel();
        completeDelivery = new javax.swing.JPanel();
        lblCompleted = new javax.swing.JLabel();
        lblCountDeliver = new javax.swing.JLabel();
        completeIcon = new javax.swing.JLabel();
        AdminInfo = new javax.swing.JPanel();
        btnAssignDelivery = new javax.swing.JButton();
        btnRiders = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblAdmin = new javax.swing.JLabel();
        lblAdminName = new javax.swing.JLabel();
        lblAdminProfile = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AdminDashboard.setBackground(new java.awt.Color(210, 180, 140));
        AdminDashboard.setLayout(null);

        RecentDelivery.setForeground(new java.awt.Color(62, 39, 35));

        tblRecentDelivery.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblRecentDelivery.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblRecentDelivery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Delivery ID", "Rider", "Status"
            }
        ));
        RecentDelivery.setViewportView(tblRecentDelivery);

        AdminDashboard.add(RecentDelivery);
        RecentDelivery.setBounds(20, 240, 550, 140);

        lblAdminDashboard.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblAdminDashboard.setForeground(new java.awt.Color(62, 39, 35));
        lblAdminDashboard.setText("ADMIN DASHBOARD");
        AdminDashboard.add(lblAdminDashboard);
        lblAdminDashboard.setBounds(30, 40, 260, 32);

        lblRecentDelivery.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblRecentDelivery.setText("RECENT DELIVERIES");
        AdminDashboard.add(lblRecentDelivery);
        lblRecentDelivery.setBounds(30, 210, 150, 16);

        riderDateUpdate.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        riderDateUpdate.setForeground(new java.awt.Color(62, 39, 35));
        riderDateUpdate.setText("June 01, 2026");
        AdminDashboard.add(riderDateUpdate);
        riderDateUpdate.setBounds(500, 40, 90, 16);

        pendingDeliveries.setBackground(new java.awt.Color(243, 233, 220));
        pendingDeliveries.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(62, 39, 35), 2, true));
        pendingDeliveries.setLayout(null);

        lblCountPending.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblCountPending.setForeground(new java.awt.Color(62, 39, 35));
        lblCountPending.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCountPending.setText("10");
        pendingDeliveries.add(lblCountPending);
        lblCountPending.setBounds(80, 20, 60, 45);

        lblPending.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblPending.setForeground(new java.awt.Color(62, 39, 35));
        lblPending.setText("Pending");
        pendingDeliveries.add(lblPending);
        lblPending.setBounds(90, 60, 50, 16);

        pendingIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pendingIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/list2.png"))); // NOI18N
        pendingDeliveries.add(pendingIcon);
        pendingIcon.setBounds(0, 10, 90, 70);

        AdminDashboard.add(pendingDeliveries);
        pendingDeliveries.setBounds(30, 100, 160, 90);

        activeRiders.setBackground(new java.awt.Color(243, 233, 220));
        activeRiders.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(62, 39, 35), 2, true));
        activeRiders.setLayout(null);

        lblOutDelivery.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblOutDelivery.setForeground(new java.awt.Color(62, 39, 35));
        lblOutDelivery.setText("Out for Delivery");
        activeRiders.add(lblOutDelivery);
        lblOutDelivery.setBounds(70, 70, 90, 16);

        lblCountOutDelivery.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblCountOutDelivery.setForeground(new java.awt.Color(62, 39, 35));
        lblCountOutDelivery.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCountOutDelivery.setText("5");
        activeRiders.add(lblCountOutDelivery);
        lblCountOutDelivery.setBounds(80, 20, 60, 45);

        activeRidersIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        activeRidersIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/motor3.png"))); // NOI18N
        activeRiders.add(activeRidersIcon);
        activeRidersIcon.setBounds(10, 10, 70, 70);

        AdminDashboard.add(activeRiders);
        activeRiders.setBounds(220, 100, 160, 90);

        completeDelivery.setBackground(new java.awt.Color(243, 233, 220));
        completeDelivery.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(62, 39, 35), 2, true));
        completeDelivery.setLayout(null);

        lblCompleted.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblCompleted.setForeground(new java.awt.Color(62, 39, 35));
        lblCompleted.setText("Delivered");
        completeDelivery.add(lblCompleted);
        lblCompleted.setBounds(80, 60, 70, 16);

        lblCountDeliver.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblCountDeliver.setForeground(new java.awt.Color(62, 39, 35));
        lblCountDeliver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCountDeliver.setText("8");
        completeDelivery.add(lblCountDeliver);
        lblCountDeliver.setBounds(80, 20, 60, 45);

        completeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        completeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/check2.png"))); // NOI18N
        completeDelivery.add(completeIcon);
        completeIcon.setBounds(0, 12, 90, 70);

        AdminDashboard.add(completeDelivery);
        completeDelivery.setBounds(410, 100, 160, 90);

        AdminInfo.setBackground(new java.awt.Color(111, 78, 55));
        AdminInfo.setLayout(null);

        btnAssignDelivery.setBackground(new java.awt.Color(243, 233, 220));
        btnAssignDelivery.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAssignDelivery.setForeground(new java.awt.Color(62, 39, 35));
        btnAssignDelivery.setText("ASSIGN DELIVERY");
        btnAssignDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDeliveryActionPerformed(evt);
            }
        });
        AdminInfo.add(btnAssignDelivery);
        btnAssignDelivery.setBounds(10, 150, 160, 23);

        btnRiders.setBackground(new java.awt.Color(243, 233, 220));
        btnRiders.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnRiders.setForeground(new java.awt.Color(62, 39, 35));
        btnRiders.setText("RIDERS LIST");
        btnRiders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRidersActionPerformed(evt);
            }
        });
        AdminInfo.add(btnRiders);
        btnRiders.setBounds(20, 200, 140, 23);

        btnLogout.setBackground(new java.awt.Color(243, 233, 220));
        btnLogout.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(62, 39, 35));
        btnLogout.setText("LOG OUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        AdminInfo.add(btnLogout);
        btnLogout.setBounds(20, 330, 140, 23);

        lblAdmin.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin.setText("Admin");
        AdminInfo.add(lblAdmin);
        lblAdmin.setBounds(70, 100, 37, 17);

        lblAdminName.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        lblAdminName.setForeground(new java.awt.Color(255, 255, 255));
        lblAdminName.setText("Admin's Name");
        AdminInfo.add(lblAdminName);
        lblAdminName.setBounds(50, 80, 80, 17);

        lblAdminProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdminProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/profile2.png"))); // NOI18N
        lblAdminProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AdminInfo.add(lblAdminProfile);
        lblAdminProfile.setBounds(60, 30, 54, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AdminInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AdminDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AdminInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDeliveryActionPerformed
        new AssignDelivery().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAssignDeliveryActionPerformed

    private void btnRidersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRidersActionPerformed
       new RidersList().setVisible(true);
       dispose();
    }//GEN-LAST:event_btnRidersActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int choice = JOptionPane.showConfirmDialog(this,  "Are you sure you want to log out?", "Confirm Logout", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            this.dispose(); // close current dashboard
            new Login().setVisible(true); // go back to login
        }
            dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminDashboard;
    private javax.swing.JPanel AdminInfo;
    private javax.swing.JScrollPane RecentDelivery;
    private javax.swing.JPanel activeRiders;
    private javax.swing.JLabel activeRidersIcon;
    private javax.swing.JButton btnAssignDelivery;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRiders;
    private javax.swing.JPanel completeDelivery;
    private javax.swing.JLabel completeIcon;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblAdminDashboard;
    private javax.swing.JLabel lblAdminName;
    private javax.swing.JLabel lblAdminProfile;
    private javax.swing.JLabel lblCompleted;
    private javax.swing.JLabel lblCountDeliver;
    private javax.swing.JLabel lblCountOutDelivery;
    private javax.swing.JLabel lblCountPending;
    private javax.swing.JLabel lblOutDelivery;
    private javax.swing.JLabel lblPending;
    private javax.swing.JLabel lblRecentDelivery;
    private javax.swing.JPanel pendingDeliveries;
    private javax.swing.JLabel pendingIcon;
    private javax.swing.JLabel riderDateUpdate;
    private javax.swing.JTable tblRecentDelivery;
    // End of variables declaration//GEN-END:variables
}
