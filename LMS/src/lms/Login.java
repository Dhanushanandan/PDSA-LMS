/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lms;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;

/**
 *
 * @author danus
 */
public class Login extends javax.swing.JFrame {

    MyLinkedList<Object> list = new MyLinkedList<>();
    Database db = new Database();
    Connection con = db.DBConnect();
    
    String uid1 = "";
    String name1 = "";
    String pass1 = "";
    String address1 = "";
    int mobile1 = 0;
    String email1 = "";
    String Type1 = "";

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUserpass = new javax.swing.JPasswordField();
        txtUserId = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hello, Friend!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 320, 50));

        jPanel1.setBackground(new java.awt.Color(255, 230, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setForeground(new java.awt.Color(255, 204, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close all jframe.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 30, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(204, 204, 204)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("Show Password?");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("User ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 100, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 100, -1));

        txtUserpass.setBackground(new java.awt.Color(204, 204, 204));
        txtUserpass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(txtUserpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 230, 30));

        txtUserId.setBackground(new java.awt.Color(204, 204, 204));
        txtUserId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(txtUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 230, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 300, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 120, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Sign in");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 130, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Use your account");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 80, 40));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 410, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 530, 560));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("<html> <p>Education is Important So Learn more and start journry with us !</p> </html> ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 300, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/body.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 0, 980, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            txtUserpass.setEchoChar((char) 0);
        } else {
            txtUserpass.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int value = 0, typet = 0;

        try {
            String inname = txtUserId.getText();
            String inpass = txtUserpass.getText();
            if (inname.equals("") && inpass.equals("")) {
                JOptionPane.showMessageDialog(null, "Enter a ID AND PASSWORD");
                txtUserId.requestFocus();
            } else if (inname.equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter a ID");
                    txtUserId.requestFocus();
            } else if (inpass.equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter a PASSWORD");
                    txtUserpass.requestFocus();
            } else {

                String qry = "Select * from details";
                PreparedStatement p = con.prepareStatement(qry);
                ResultSet rs = p.executeQuery();
//                ResultSetMetaData rsmd = rs.getMetaData();
//
//                int cols = rsmd.getColumnCount();
//                String[] colName = new String[cols];
//                for (int i = 0; i < cols; i++) {
//                    colName[i] = rsmd.getColumnName(i + 1);

                    while (rs.next()) {

                        String uid = rs.getString(1);
                        String name = rs.getString(2);
                        String pass = rs.getString(3);
                        String address = rs.getString(4);
                        int mobile = Integer.parseInt(rs.getString(5));
                        String email = rs.getString(6);
                        String Type = rs.getString(7);
                        User u = new User(uid, name, pass, address, mobile, email, Type);
                        list.add(u);
                    }

//                }

                Node currentNode = list.head;
                while (currentNode != null) {
                    User user = (User) currentNode.data;
                    if (inname.equals(user.getUid()) && inpass.equals(user.getPass())) {
                        value = 1;
                        if (user.getType().equals("Admin")) {
                            typet = 1;
                        } else {
                            typet = 0;
                        }
                        uid1 = user.getUid();
                        name1 = user.getName();
                        pass1 = user.getPass();
                        address1 = user.getAddress();
                        mobile1 = user.getMobile();
                        email1 = user.getEmail();
                        Type1 = user.getType();
                        break;
                    } else {
                        value = 0;
                        currentNode = currentNode.next;
                    }

                }
                if (value == 1) {
                    if (typet == 1) {
                        JOptionPane.showMessageDialog(null, "LOGGED IN SUCCESSFULL AS ADMIN");
                        value = 0;
                        typet = 0;
                        list.head = null;
                        Admindash d = new Admindash(uid1, name1, pass1, address1, mobile1, email1, Type1);
                        d.show();
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "LOGGED IN SUCCESSFULL AS USER");
                        value = 0;
                        list.head = null;
                        Userdash d = new Userdash(uid1, name1, pass1, address1, mobile1, email1, Type1);
                        d.show();
                        this.dispose();
                    }
                } else if (value == 0) {
                    JOptionPane.showMessageDialog(null, "WRONG UID OR PASSWORD PLEASE RECHECK");
                    txtUserId.setText("");
                    txtUserpass.setText("");
                    txtUserId.requestFocus();
                }

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtUserId.setText("");
        txtUserpass.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JPasswordField txtUserpass;
    // End of variables declaration//GEN-END:variables
}
