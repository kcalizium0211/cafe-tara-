package frames;
import java.io.BufferedReader; // used to read text files line by line
import java.io.FileReader; // used to open and read files
import javax.swing.table.DefaultTableModel; // used to manage table data
import models.Rider; // import rider model class

public class RidersList extends javax.swing.JFrame { // create riders list form
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RidersList.class.getName()); // create logger for errors and messages
 
    public RidersList() { // constructor for riders list form
        initComponents(); // initialize form components
        loadRiderList(); // load rider data into table
    }
    
    public void loadRiderList() { // method to load rider list
    try { // start try block
        BufferedReader br = new BufferedReader(new FileReader("userinfo.txt")); // open user info file
        String line; // variable to store each line
        DefaultTableModel model = (DefaultTableModel) tblRiderInfo.getModel(); // get table model
        model.setRowCount(0); // clear existing table rows

        while ((line = br.readLine()) != null) { // read file line by line
            String[] data = line.split(","); // split line using comma
            if (data.length < 4) continue; // skip incomplete data
            String riderId = data[0].trim(); // get rider id
            String username = data[1].trim(); // get username
            String role = data[3].trim(); // get user role

            if (role.equalsIgnoreCase("Rider")) { // check if role is rider
                Rider r = new Rider(username, data[2]); // create rider object
                model.addRow(new Object[]{ // add rider data into table
                riderId, // display rider id
                r.getUsername(), // display username
                "Available"}); // display rider status
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
        RiderStatusBoard.setBounds(0, 0, 390, 370);

        setSize(new java.awt.Dimension(400, 375));
        setLocationRelativeTo(null);
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
