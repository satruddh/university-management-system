/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SPN RAO
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login 
     */
    public login() {
        initComponents();
        this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage("img\\mmmutlogo-64.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        closeButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user_id = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        signin = new javax.swing.JLabel();
        user = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bx-x-circle-red.png"))); // NOI18N
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });
        jPanel1.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 31, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/key.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        user_id.setBackground(new java.awt.Color(51, 204, 255));
        user_id.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        user_id.setForeground(new java.awt.Color(255, 255, 255));
        user_id.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        user_id.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        user_id.setCaretColor(new java.awt.Color(255, 255, 255));
        user_id.setMargin(new java.awt.Insets(0, 10, 2, 0));
        jPanel1.add(user_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 180, 30));

        password.setBackground(new java.awt.Color(51, 204, 255));
        password.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        password.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 180, 30));

        signin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signin.setForeground(new java.awt.Color(255, 255, 255));
        signin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signin.setText("Sign In");
        signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinMouseClicked(evt);
            }
        });
        jPanel1.add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 271, 90, 29));

        user.setBackground(new java.awt.Color(51, 153, 255));
        user.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Login As--", "Administrator", "Faculty", "Student" }));
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 180, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Login As :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, 27));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseClicked
        this.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.WAIT_CURSOR));
        try {
            connectionManager.connect();
            String q1,q2;
            q1="select name,pass from users where name = ? and pass=? and type = ?";
            connectionManager.connect();
            connectionManager.pstmt=connectionManager.conn.prepareStatement(q1);
            connectionManager.pstmt.setString(1,user_id.getText());
            connectionManager.pstmt.setString(2,new String(password.getPassword()));
            connectionManager.pstmt.setString(3, user.getSelectedItem().toString().toLowerCase());
            connectionManager.rs=connectionManager.pstmt.executeQuery();
            if(connectionManager.rs.next())
            {
                if(user.getSelectedIndex()==1)
                {
                    this.setCursor(java.awt.Cursor.getDefaultCursor());
                    javax.swing.JOptionPane.showMessageDialog(null,"Login Success","Success",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    Dashboard d=new Dashboard();
                    d.setVisible(true);
                    dispose();
                }
                else if(user.getSelectedIndex()==2)
                {
                    this.setCursor(java.awt.Cursor.getDefaultCursor());
                    javax.swing.JOptionPane.showMessageDialog(null,"Login Success","Success",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    new Faculty_Dashboard(user_id.getText());
                    dispose();
                }
                else
                {
                    this.setCursor(java.awt.Cursor.getDefaultCursor());
                    javax.swing.JOptionPane.showMessageDialog(null,"Login Success","Success",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    new Student_dashboard(user_id.getText());
                    dispose();
                }
            }
            else{
                this.setCursor(java.awt.Cursor.getDefaultCursor());
                javax.swing.JOptionPane.showMessageDialog(null,"Failed","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_signinMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel signin;
    private javax.swing.JComboBox<String> user;
    private javax.swing.JTextField user_id;
    // End of variables declaration//GEN-END:variables
}