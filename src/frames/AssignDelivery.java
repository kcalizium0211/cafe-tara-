package frames;


public class AssignDelivery extends javax.swing.JFrame {
   
    public AssignDelivery() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDeliveryDetails = new javax.swing.JLabel();
        lblcustomer = new javax.swing.JLabel();
        lbladd = new javax.swing.JLabel();
        lblselectrider = new javax.swing.JLabel();
        lblchooserider = new javax.swing.JLabel();
        cmbRider = new javax.swing.JComboBox<>();
        lblnotes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea_Notes = new javax.swing.JTextArea();
        btnAssignDelivery = new javax.swing.JButton();
        btnBacktoDashboard = new javax.swing.JButton();
        lblcustomer1 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtDeliveryId = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(210, 180, 140));
        jPanel1.setLayout(null);

        lblDeliveryDetails.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblDeliveryDetails.setForeground(new java.awt.Color(62, 39, 35));
        lblDeliveryDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeliveryDetails.setText("DELIVERY DETAILS");
        jPanel1.add(lblDeliveryDetails);
        lblDeliveryDetails.setBounds(20, 30, 190, 20);

        lblcustomer.setForeground(new java.awt.Color(62, 39, 35));
        lblcustomer.setText("Delivery ID:");
        jPanel1.add(lblcustomer);
        lblcustomer.setBounds(30, 60, 100, 16);

        lbladd.setForeground(new java.awt.Color(62, 39, 35));
        lbladd.setText("Address:");
        jPanel1.add(lbladd);
        lbladd.setBounds(30, 100, 50, 16);

        lblselectrider.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblselectrider.setForeground(new java.awt.Color(62, 39, 35));
        lblselectrider.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblselectrider.setText("SELECT RIDER");
        jPanel1.add(lblselectrider);
        lblselectrider.setBounds(20, 230, 110, 16);

        lblchooserider.setForeground(new java.awt.Color(62, 39, 35));
        lblchooserider.setText("Choose Rider:");
        jPanel1.add(lblchooserider);
        lblchooserider.setBounds(40, 250, 100, 30);

        cmbRider.setBackground(new java.awt.Color(111, 78, 55));
        cmbRider.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cmbRider.setForeground(new java.awt.Color(62, 39, 35));
        cmbRider.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kim", "Sam", "Janah" }));
        cmbRider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRiderActionPerformed(evt);
            }
        });
        jPanel1.add(cmbRider);
        cmbRider.setBounds(130, 250, 150, 30);

        lblnotes.setForeground(new java.awt.Color(62, 39, 35));
        lblnotes.setText("Notes (Optional):");
        jPanel1.add(lblnotes);
        lblnotes.setBounds(30, 130, 100, 16);

        textArea_Notes.setColumns(20);
        textArea_Notes.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        textArea_Notes.setRows(5);
        jScrollPane1.setViewportView(textArea_Notes);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 150, 280, 70);

        btnAssignDelivery.setBackground(new java.awt.Color(111, 78, 55));
        btnAssignDelivery.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAssignDelivery.setForeground(new java.awt.Color(243, 233, 220));
        btnAssignDelivery.setText("ASSIGN DELIVERY");
        btnAssignDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDeliveryActionPerformed(evt);
            }
        });
        jPanel1.add(btnAssignDelivery);
        btnAssignDelivery.setBounds(40, 300, 260, 23);

        btnBacktoDashboard.setBackground(new java.awt.Color(111, 78, 55));
        btnBacktoDashboard.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnBacktoDashboard.setForeground(new java.awt.Color(243, 233, 220));
        btnBacktoDashboard.setText("BACK TO DASHBOARD");
        btnBacktoDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacktoDashboardActionPerformed(evt);
            }
        });
        jPanel1.add(btnBacktoDashboard);
        btnBacktoDashboard.setBounds(40, 330, 260, 23);

        lblcustomer1.setForeground(new java.awt.Color(62, 39, 35));
        lblcustomer1.setText("Customer Name:");
        jPanel1.add(lblcustomer1);
        lblcustomer1.setBounds(30, 80, 100, 16);
        jPanel1.add(txtAddress);
        txtAddress.setBounds(140, 100, 160, 22);
        jPanel1.add(txtDeliveryId);
        txtDeliveryId.setBounds(140, 60, 160, 22);
        jPanel1.add(txtCustomerName);
        txtCustomerName.setBounds(140, 80, 160, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 340, 390);

        setBounds(0, 0, 355, 395);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbRiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRiderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRiderActionPerformed

    private void btnAssignDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDeliveryActionPerformed

    }//GEN-LAST:event_btnAssignDeliveryActionPerformed

    private void btnBacktoDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacktoDashboardActionPerformed
       new AdminDashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBacktoDashboardActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> new AssignDelivery().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignDelivery;
    private javax.swing.JButton btnBacktoDashboard;
    private javax.swing.JComboBox<String> cmbRider;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDeliveryDetails;
    private javax.swing.JLabel lbladd;
    private javax.swing.JLabel lblchooserider;
    private javax.swing.JLabel lblcustomer;
    private javax.swing.JLabel lblcustomer1;
    private javax.swing.JLabel lblnotes;
    private javax.swing.JLabel lblselectrider;
    private javax.swing.JTextArea textArea_Notes;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtDeliveryId;
    // End of variables declaration//GEN-END:variables
}
