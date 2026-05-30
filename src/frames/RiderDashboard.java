
package frames;


public class RiderDashboard extends javax.swing.JFrame {

    public RiderDashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplRiderDashboard = new javax.swing.JPanel();
        AssignedDeliveryInfo = new javax.swing.JScrollPane();
        tblAssignedDeliveryInfo = new javax.swing.JTable();
        lblRiderDashboard = new javax.swing.JLabel();
        totalDeliveries = new javax.swing.JPanel();
        lblCompleted = new javax.swing.JLabel();
        lblCountDeliveries = new javax.swing.JLabel();
        completedIcon = new javax.swing.JLabel();
        lblrecentdeliveries1 = new javax.swing.JLabel();
        pendingDeliveries = new javax.swing.JPanel();
        lblCountPending = new javax.swing.JLabel();
        lblPending = new javax.swing.JLabel();
        pendingIcon = new javax.swing.JLabel();
        outofDeliveries = new javax.swing.JPanel();
        lblOutDelivery = new javax.swing.JLabel();
        lblCountOutDelivery = new javax.swing.JLabel();
        outdeliveryIcon = new javax.swing.JLabel();
        riderDateUpdate = new javax.swing.JLabel();
        RiderInfo = new javax.swing.JPanel();
        btnUpdateStatus = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblRider = new javax.swing.JLabel();
        lblRiderName = new javax.swing.JLabel();
        lblRiderIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jplRiderDashboard.setBackground(new java.awt.Color(210, 180, 140));
        jplRiderDashboard.setLayout(null);

        tblAssignedDeliveryInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblAssignedDeliveryInfo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        tblAssignedDeliveryInfo.setForeground(new java.awt.Color(62, 39, 35));
        tblAssignedDeliveryInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Delivery ID", "Calendar", "Address", "Status"
            }
        ));
        AssignedDeliveryInfo.setViewportView(tblAssignedDeliveryInfo);

        jplRiderDashboard.add(AssignedDeliveryInfo);
        AssignedDeliveryInfo.setBounds(20, 240, 550, 140);

        lblRiderDashboard.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblRiderDashboard.setForeground(new java.awt.Color(62, 39, 35));
        lblRiderDashboard.setText("RIDER DASHBOARD");
        jplRiderDashboard.add(lblRiderDashboard);
        lblRiderDashboard.setBounds(30, 40, 260, 32);

        totalDeliveries.setBackground(new java.awt.Color(243, 233, 220));
        totalDeliveries.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(62, 39, 35), 2, true));
        totalDeliveries.setLayout(null);

        lblCompleted.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblCompleted.setForeground(new java.awt.Color(62, 39, 35));
        lblCompleted.setText("Completed");
        totalDeliveries.add(lblCompleted);
        lblCompleted.setBounds(80, 60, 70, 16);

        lblCountDeliveries.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblCountDeliveries.setForeground(new java.awt.Color(62, 39, 35));
        lblCountDeliveries.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCountDeliveries.setText("8");
        totalDeliveries.add(lblCountDeliveries);
        lblCountDeliveries.setBounds(80, 20, 60, 45);

        completedIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        completedIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/check2.png"))); // NOI18N
        totalDeliveries.add(completedIcon);
        completedIcon.setBounds(0, 12, 90, 70);

        jplRiderDashboard.add(totalDeliveries);
        totalDeliveries.setBounds(410, 100, 160, 90);

        lblrecentdeliveries1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblrecentdeliveries1.setText("MY ASSIGNED DELIVERIES");
        jplRiderDashboard.add(lblrecentdeliveries1);
        lblrecentdeliveries1.setBounds(30, 210, 170, 16);

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

        jplRiderDashboard.add(pendingDeliveries);
        pendingDeliveries.setBounds(30, 100, 160, 90);

        outofDeliveries.setBackground(new java.awt.Color(243, 233, 220));
        outofDeliveries.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(62, 39, 35), 2, true));
        outofDeliveries.setLayout(null);

        lblOutDelivery.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblOutDelivery.setForeground(new java.awt.Color(62, 39, 35));
        lblOutDelivery.setText("Out for Delivery");
        outofDeliveries.add(lblOutDelivery);
        lblOutDelivery.setBounds(70, 60, 90, 16);

        lblCountOutDelivery.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblCountOutDelivery.setForeground(new java.awt.Color(62, 39, 35));
        lblCountOutDelivery.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCountOutDelivery.setText("5");
        outofDeliveries.add(lblCountOutDelivery);
        lblCountOutDelivery.setBounds(80, 20, 60, 45);

        outdeliveryIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        outdeliveryIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/motor3.png"))); // NOI18N
        outofDeliveries.add(outdeliveryIcon);
        outdeliveryIcon.setBounds(10, 10, 70, 70);

        jplRiderDashboard.add(outofDeliveries);
        outofDeliveries.setBounds(220, 100, 160, 90);

        riderDateUpdate.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        riderDateUpdate.setForeground(new java.awt.Color(62, 39, 35));
        riderDateUpdate.setText("May, 27, 2026");
        jplRiderDashboard.add(riderDateUpdate);
        riderDateUpdate.setBounds(500, 40, 90, 16);

        RiderInfo.setBackground(new java.awt.Color(111, 78, 55));
        RiderInfo.setLayout(null);

        btnUpdateStatus.setBackground(new java.awt.Color(243, 233, 220));
        btnUpdateStatus.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnUpdateStatus.setForeground(new java.awt.Color(62, 39, 35));
        btnUpdateStatus.setText("UPDATE STATUS");
        btnUpdateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStatusActionPerformed(evt);
            }
        });
        RiderInfo.add(btnUpdateStatus);
        btnUpdateStatus.setBounds(20, 190, 130, 23);

        btnProfile.setBackground(new java.awt.Color(243, 233, 220));
        btnProfile.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(62, 39, 35));
        btnProfile.setText("PROFILE");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        RiderInfo.add(btnProfile);
        btnProfile.setBounds(20, 150, 130, 23);

        btnLogout.setBackground(new java.awt.Color(243, 233, 220));
        btnLogout.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(62, 39, 35));
        btnLogout.setText("LOG OUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        RiderInfo.add(btnLogout);
        btnLogout.setBounds(20, 350, 130, 23);

        lblRider.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        lblRider.setForeground(new java.awt.Color(255, 255, 255));
        lblRider.setText("Rider");
        RiderInfo.add(lblRider);
        lblRider.setBounds(70, 100, 37, 17);

        lblRiderName.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        lblRiderName.setForeground(new java.awt.Color(255, 255, 255));
        lblRiderName.setText("Rider's Name");
        RiderInfo.add(lblRiderName);
        lblRiderName.setBounds(50, 80, 80, 17);

        lblRiderIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRiderIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/profile2.png"))); // NOI18N
        lblRiderIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RiderInfo.add(lblRiderIcon);
        lblRiderIcon.setBounds(60, 30, 54, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RiderInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jplRiderDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jplRiderDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RiderInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        new RiderProfile().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnUpdateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStatusActionPerformed
        new UpdateStatus().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnUpdateStatusActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RiderDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AssignedDeliveryInfo;
    private javax.swing.JPanel RiderInfo;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnUpdateStatus;
    private javax.swing.JLabel completedIcon;
    private javax.swing.JPanel jplRiderDashboard;
    private javax.swing.JLabel lblCompleted;
    private javax.swing.JLabel lblCountDeliveries;
    private javax.swing.JLabel lblCountOutDelivery;
    private javax.swing.JLabel lblCountPending;
    private javax.swing.JLabel lblOutDelivery;
    private javax.swing.JLabel lblPending;
    private javax.swing.JLabel lblRider;
    private javax.swing.JLabel lblRiderDashboard;
    private javax.swing.JLabel lblRiderIcon;
    private javax.swing.JLabel lblRiderName;
    private javax.swing.JLabel lblrecentdeliveries1;
    private javax.swing.JLabel outdeliveryIcon;
    private javax.swing.JPanel outofDeliveries;
    private javax.swing.JPanel pendingDeliveries;
    private javax.swing.JLabel pendingIcon;
    private javax.swing.JLabel riderDateUpdate;
    private javax.swing.JTable tblAssignedDeliveryInfo;
    private javax.swing.JPanel totalDeliveries;
    // End of variables declaration//GEN-END:variables
}
