
package frames;

public class RidersList extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RidersList.class.getName());


    public RidersList() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RiderStatusBoard = new javax.swing.JPanel();
        RiderInfo = new javax.swing.JScrollPane();
        tblRiderInfo = new javax.swing.JTable();
        lblRiderStatus = new javax.swing.JLabel();
        btnBacktoDashboard = new javax.swing.JButton();
        btnAddRider = new javax.swing.JButton();
        btnDeleteRider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        RiderStatusBoard.setBackground(new java.awt.Color(210, 180, 140));
        RiderStatusBoard.setLayout(null);

        tblRiderInfo.setForeground(new java.awt.Color(62, 39, 35));
        tblRiderInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rider ID", "Rider Name", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        RiderInfo.setViewportView(tblRiderInfo);

        RiderStatusBoard.add(RiderInfo);
        RiderInfo.setBounds(20, 60, 350, 200);

        lblRiderStatus.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblRiderStatus.setForeground(new java.awt.Color(62, 39, 35));
        lblRiderStatus.setText("RIDERS STATUS");
        RiderStatusBoard.add(lblRiderStatus);
        lblRiderStatus.setBounds(30, 30, 150, 24);

        btnBacktoDashboard.setBackground(new java.awt.Color(111, 78, 55));
        btnBacktoDashboard.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnBacktoDashboard.setForeground(new java.awt.Color(243, 233, 220));
        btnBacktoDashboard.setText("BACK TO DASHBOARD");
        btnBacktoDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacktoDashboardActionPerformed(evt);
            }
        });
        RiderStatusBoard.add(btnBacktoDashboard);
        btnBacktoDashboard.setBounds(50, 300, 280, 23);

        btnAddRider.setBackground(new java.awt.Color(111, 78, 55));
        btnAddRider.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAddRider.setForeground(new java.awt.Color(243, 233, 220));
        btnAddRider.setText("ADD RIDER");
        btnAddRider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRiderActionPerformed(evt);
            }
        });
        RiderStatusBoard.add(btnAddRider);
        btnAddRider.setBounds(50, 270, 120, 23);

        btnDeleteRider.setBackground(new java.awt.Color(111, 78, 55));
        btnDeleteRider.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnDeleteRider.setForeground(new java.awt.Color(243, 233, 220));
        btnDeleteRider.setText("DELETE RIDER");
        btnDeleteRider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRiderActionPerformed(evt);
            }
        });
        RiderStatusBoard.add(btnDeleteRider);
        btnDeleteRider.setBounds(210, 270, 120, 23);

        getContentPane().add(RiderStatusBoard);
        RiderStatusBoard.setBounds(0, 0, 390, 350);

        setBounds(0, 0, 400, 358);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBacktoDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacktoDashboardActionPerformed
        new RiderDashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBacktoDashboardActionPerformed

    private void btnAddRiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRiderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddRiderActionPerformed

    private void btnDeleteRiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRiderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteRiderActionPerformed

   
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new RidersList().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane RiderInfo;
    private javax.swing.JPanel RiderStatusBoard;
    private javax.swing.JButton btnAddRider;
    private javax.swing.JButton btnBacktoDashboard;
    private javax.swing.JButton btnDeleteRider;
    private javax.swing.JLabel lblRiderStatus;
    private javax.swing.JTable tblRiderInfo;
    // End of variables declaration//GEN-END:variables
}
