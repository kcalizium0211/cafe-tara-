package frames;

import frames.AdminDashboard; // import admin dashboard frame
import frames.RiderDashboard; // import rider dashboard frame
import java.io.BufferedWriter; // used to write text into a file
import java.io.FileWriter; // used to create or write files
import java.io.IOException; // handles file errors
import javax.swing.JOptionPane; // used for popup messages
import utility.FileHandler; // import file handling utility
import models.Admin; // import admin class
import models.Rider; // import rider class
import models.User; // import user class

public class Login extends javax.swing.JFrame { // create login form window
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName()); // create logger for errors and messages

    public Login() { // constructor for login form
        initComponents(); // initialize all form components
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginInfo = new javax.swing.JPanel();
        cafeName = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        LoginIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginInfo.setBackground(new java.awt.Color(210, 180, 140));
        LoginInfo.setLayout(null);

        cafeName.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        cafeName.setForeground(new java.awt.Color(62, 39, 35));
        cafeName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cafeName.setText("KAPE, Ano Tara?");
        LoginInfo.add(cafeName);
        cafeName.setBounds(30, 110, 240, 32);

        title.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        title.setForeground(new java.awt.Color(62, 39, 35));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("DELIVERY MONITORING SYSTEM");
        LoginInfo.add(title);
        title.setBounds(50, 150, 190, 14);

        txtUsername.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        LoginInfo.add(txtUsername);
        txtUsername.setBounds(90, 180, 180, 30);

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        LoginInfo.add(txtPassword);
        txtPassword.setBounds(90, 220, 180, 30);

        lblUsername.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(62, 39, 35));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("Username:");
        LoginInfo.add(lblUsername);
        lblUsername.setBounds(20, 190, 70, 19);

        lblPassword.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(62, 39, 35));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("Password:");
        LoginInfo.add(lblPassword);
        lblPassword.setBounds(20, 230, 70, 19);

        btnLogin.setBackground(new java.awt.Color(62, 39, 35));
        btnLogin.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        LoginInfo.add(btnLogin);
        btnLogin.setBounds(100, 300, 90, 24);

        LoginIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/coffee bean.png"))); // NOI18N
        LoginInfo.add(LoginIcon);
        LoginIcon.setBounds(90, 20, 110, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(315, 409));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
    String username = txtUsername.getText(); // get the username input from textbox
    String password = String.valueOf(txtPassword.getPassword()); // get the password input from password field
        
    if (username.isEmpty() || password.isEmpty()) { // check if username or password is empty
        JOptionPane.showMessageDialog(this, "Please enter username and password."); // show message if fields are empty
        return; // stop the code from continuing
    }
    
    User user = FileHandler.loginUser(username, password); // check if username and password match a user
    
    if (user != null) { // check if login is successful
    JOptionPane.showMessageDialog(this, "Login Successful"); // show success message

    if (user instanceof Admin) { // check if user is an admin
        AdminDashboard ad = new AdminDashboard(); // create admin dashboard
        ad.setVisible(true); // show admin dashboard

    } else if (user instanceof Rider) { // check if user is a rider
        Rider rider = (Rider) user; // convert user into rider object
        String fileUser = username; // store username into variable
        RiderDashboard rd = new RiderDashboard(rider); // create rider dashboard
        rd.setVisible(true); // show rider dashboard
    }

    dispose(); // close the login form

    } else { // if login fails
        JOptionPane.showMessageDialog(this,"Invalid username or password"); // show error message
    }
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginIcon;
    private javax.swing.JPanel LoginInfo;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel cafeName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel title;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
