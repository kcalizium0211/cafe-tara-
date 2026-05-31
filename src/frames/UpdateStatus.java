package frames;

import frames.RiderDashboard;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import models.Delivery;
import models.Rider;


public class UpdateStatus extends javax.swing.JFrame {

        private Delivery delivery;
        private Rider rider;

    public UpdateStatus(Delivery delivery, Rider rider) {
    initComponents();
    this.delivery = delivery;
    this.rider = rider;
    lblDeliveryId.setText(delivery.getDeliveryID());
    lblCustomer.setText(delivery.getCustomerName());
    lblAddress.setText(delivery.getAddress());
    lblStatus.setText(delivery.getStatus());
    textArea_Notes.setText(delivery.getNotes());
    
}
    public void loadDetails(String deliveryId) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("deliveries.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",",6);
                if (data[0].equals(deliveryId)) {
                    lblDeliveryId.setText(data[0]);
                    lblCustomer.setText(data[1]);
                    lblAddress.setText(data[2]);
                    textArea_Notes.setText(data[3]);             
                    break;
                }
            }

            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // ✅ ADD THIS INSIDE CLASS (NOT OUTSIDE)
    public void loadDelivery(String riderName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("deliveries.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if (data[4].equalsIgnoreCase(riderName)) {
                    lblDeliveryId.setText(data[0]);
                    lblCustomer.setText(data[1]);
                    lblAddress.setText(data[2]);
                    textArea_Notes.setText(data[3]);
                    cmbStatus.setSelectedItem(data[5]);
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

        DeliveryStatusBoard = new javax.swing.JPanel();
        lblDeliveryDetails = new javax.swing.JLabel();
        DeliveryID = new javax.swing.JLabel();
        Customer = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        CurrentStatus = new javax.swing.JLabel();
        UpdateStatus = new javax.swing.JLabel();
        lblSelectNewStat = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        lblusnotes = new javax.swing.JLabel();
        btnUpdateStatus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea_Notes = new javax.swing.JTextArea();
        lblStatus = new javax.swing.JLabel();
        lblCustomer = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblDeliveryId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        DeliveryStatusBoard.setBackground(new java.awt.Color(210, 180, 140));
        DeliveryStatusBoard.setLayout(null);

        lblDeliveryDetails.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblDeliveryDetails.setForeground(new java.awt.Color(62, 39, 35));
        lblDeliveryDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeliveryDetails.setText("DELIVERY DETAILS");
        DeliveryStatusBoard.add(lblDeliveryDetails);
        lblDeliveryDetails.setBounds(20, 20, 190, 20);

        DeliveryID.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        DeliveryID.setForeground(new java.awt.Color(62, 39, 35));
        DeliveryID.setText("Delivery ID:");
        DeliveryStatusBoard.add(DeliveryID);
        DeliveryID.setBounds(30, 50, 70, 16);

        Customer.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Customer.setForeground(new java.awt.Color(62, 39, 35));
        Customer.setText("Customer:");
        DeliveryStatusBoard.add(Customer);
        Customer.setBounds(30, 70, 60, 16);

        Address.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Address.setForeground(new java.awt.Color(62, 39, 35));
        Address.setText("Address:");
        DeliveryStatusBoard.add(Address);
        Address.setBounds(30, 90, 50, 16);

        CurrentStatus.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        CurrentStatus.setForeground(new java.awt.Color(62, 39, 35));
        CurrentStatus.setText("Current Status:");
        DeliveryStatusBoard.add(CurrentStatus);
        CurrentStatus.setBounds(30, 110, 90, 16);

        UpdateStatus.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        UpdateStatus.setForeground(new java.awt.Color(62, 39, 35));
        UpdateStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UpdateStatus.setText("UPDATE STATUS");
        DeliveryStatusBoard.add(UpdateStatus);
        UpdateStatus.setBounds(20, 140, 140, 19);

        lblSelectNewStat.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblSelectNewStat.setForeground(new java.awt.Color(62, 39, 35));
        lblSelectNewStat.setText("Select New Status:");
        DeliveryStatusBoard.add(lblSelectNewStat);
        lblSelectNewStat.setBounds(30, 170, 100, 16);

        cmbStatus.setBackground(new java.awt.Color(111, 78, 55));
        cmbStatus.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cmbStatus.setForeground(new java.awt.Color(62, 39, 35));
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Out for Delivery", "Delivered" }));
        DeliveryStatusBoard.add(cmbStatus);
        cmbStatus.setBounds(150, 170, 150, 22);

        lblusnotes.setBackground(new java.awt.Color(243, 233, 220));
        lblusnotes.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblusnotes.setForeground(new java.awt.Color(62, 39, 35));
        lblusnotes.setText("Notes (Optional):");
        DeliveryStatusBoard.add(lblusnotes);
        lblusnotes.setBounds(40, 200, 110, 16);

        btnUpdateStatus.setBackground(new java.awt.Color(111, 78, 55));
        btnUpdateStatus.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnUpdateStatus.setForeground(new java.awt.Color(243, 233, 220));
        btnUpdateStatus.setText("UPDATE STATUS");
        btnUpdateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStatusActionPerformed(evt);
            }
        });
        DeliveryStatusBoard.add(btnUpdateStatus);
        btnUpdateStatus.setBounds(50, 300, 260, 23);

        textArea_Notes.setColumns(20);
        textArea_Notes.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        textArea_Notes.setRows(5);
        jScrollPane1.setViewportView(textArea_Notes);

        DeliveryStatusBoard.add(jScrollPane1);
        jScrollPane1.setBounds(30, 220, 300, 70);

        lblStatus.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblStatus.setText("-");
        DeliveryStatusBoard.add(lblStatus);
        lblStatus.setBounds(140, 110, 170, 20);

        lblCustomer.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblCustomer.setText("-");
        DeliveryStatusBoard.add(lblCustomer);
        lblCustomer.setBounds(140, 70, 170, 20);

        lblAddress.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblAddress.setText("-");
        DeliveryStatusBoard.add(lblAddress);
        lblAddress.setBounds(140, 90, 170, 20);

        lblDeliveryId.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblDeliveryId.setText("-");
        DeliveryStatusBoard.add(lblDeliveryId);
        lblDeliveryId.setBounds(140, 50, 170, 20);

        getContentPane().add(DeliveryStatusBoard);
        DeliveryStatusBoard.setBounds(0, 0, 360, 350);

        setBounds(0, 0, 375, 355);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStatusActionPerformed
    String newStatus = cmbStatus.getSelectedItem().toString();
    String id = delivery.getDeliveryID();
    delivery.setStatus(newStatus);

    try {
        BufferedReader br = new BufferedReader(new FileReader("deliveries.txt"));
        StringBuilder sb = new StringBuilder();

        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",",6);

            if (data[0].equals(id) && data.length >= 6) {
                data[5] = newStatus; // update status column
                line = String.join(",", data);
            }

            sb.append(line).append("\n");
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("deliveries.txt"));
        bw.write(sb.toString());
        bw.close();

        JOptionPane.showMessageDialog(this, "Status updated to: " + newStatus);

        // Go back to dashboard with refreshed stats
        RiderDashboard rd = new RiderDashboard(rider);
        rd.setVisible(true);
        dispose();

    } catch (Exception e) {
        System.out.println(e);
    }

    }//GEN-LAST:event_btnUpdateStatusActionPerformed

    public static void main(String args[]) {
      
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel CurrentStatus;
    private javax.swing.JLabel Customer;
    private javax.swing.JLabel DeliveryID;
    private javax.swing.JPanel DeliveryStatusBoard;
    private javax.swing.JLabel UpdateStatus;
    private javax.swing.JButton btnUpdateStatus;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblDeliveryDetails;
    private javax.swing.JLabel lblDeliveryId;
    private javax.swing.JLabel lblSelectNewStat;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblusnotes;
    private javax.swing.JTextArea textArea_Notes;
    // End of variables declaration//GEN-END:variables
}