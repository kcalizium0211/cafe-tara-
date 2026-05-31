
package frames;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.table.DefaultTableModel;
import models.Rider;

public class RidersList extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RidersList.class.getName());


    public RidersList() {
        initComponents();
        loadRiderList();
        
    }
    public void loadRiderList() {

    try {
        BufferedReader br = new BufferedReader(new FileReader("userinfo.txt"));

        String line;

        DefaultTableModel model = (DefaultTableModel) tblRiderInfo.getModel();
        model.setRowCount(0);

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            if (data.length < 4) continue;

            String riderId = data[0].trim();
            String username = data[1].trim();
            String role = data[3].trim();

            if (role.equalsIgnoreCase("Rider")) {
                Rider r = new Rider(username, data[2]);
                model.addRow(new Object[]{
                riderId, r.getUsername(),"Available"});
}
        }

        br.close();

    } catch (Exception e) {
        System.out.println(e);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RiderStatusBoard = new javax.swing.JPanel();
        RiderInfo = new javax.swing.JScrollPane();
        tblRiderInfo = new javax.swing.JTable();
        lblRiderStatus = new javax.swing.JLabel();
        btnBacktoDashboard = new javax.swing.JButton();

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
        btnBacktoDashboard.setBounds(50, 270, 280, 23);

        getContentPane().add(RiderStatusBoard);
        RiderStatusBoard.setBounds(0, 0, 390, 350);

        setBounds(0, 0, 400, 358);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBacktoDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacktoDashboardActionPerformed
        new AdminDashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBacktoDashboardActionPerformed

   
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
    private javax.swing.JButton btnBacktoDashboard;
    private javax.swing.JLabel lblRiderStatus;
    private javax.swing.JTable tblRiderInfo;
    // End of variables declaration//GEN-END:variables
}
