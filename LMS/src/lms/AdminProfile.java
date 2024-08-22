/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lms;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author danus
 */
public class AdminProfile extends javax.swing.JFrame {

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

    public AdminProfile(String uid1, String name1, String pass1, String address1, int mobile1, String email1, String Type1) {
        initComponents();
        this.uid1 = uid1;
        this.name1 = name1;
        this.pass1 = pass1;
        this.address1 = address1;
        this.mobile1 = mobile1;
        this.email1 = email1;
        this.Type1 = Type1;
    }

    private AdminProfile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel21 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jTextField13 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("User ID");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jTextField15.setBackground(new java.awt.Color(255, 255, 255));
        jTextField15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 290, -1));

        jTextField14.setBackground(new java.awt.Color(255, 255, 255));
        jTextField14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 290, -1));

        jPasswordField3.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPasswordField3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 290, -1));

        jTextField13.setBackground(new java.awt.Color(255, 255, 255));
        jTextField13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 290, -1));

        jTextField12.setBackground(new java.awt.Color(255, 255, 255));
        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 290, -1));

        jTextField11.setBackground(new java.awt.Color(255, 255, 255));
        jTextField11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(0, 0, 0));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 290, -1));

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("Update");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 150, 50));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("E-mail");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Mobile");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Address");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Password");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Name");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, 120, 50));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Previous data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 160, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminProfileback.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try {

            Email_validation v = new Email_validation();

            if (jTextField15.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter a ID");
                jTextField15.requestFocus();
            } else if (jTextField14.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter a Name");
                jTextField14.requestFocus();
            } else if (jPasswordField3.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter a Password");
                jPasswordField3.requestFocus();
            } else if (jTextField13.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter a Address");
                jTextField13.requestFocus();
            } else if (jTextField11.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter a email");
                jTextField11.requestFocus();
            } else if (!v.isvalid(jTextField11.getText())) {
                JOptionPane.showMessageDialog(null, "invalid Email");
                jTextField11.setText("");
                jTextField11.requestFocus();
            } else if (jTextField12.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter a 10 digit number");
                jTextField12.requestFocus();
            } else {
                //validating mobile number is 10 digit
                String number = jTextField12.getText();
                number = number.replace(" ", ""); //if user use space in the mobile field
                boolean valid = number.matches("[0-9]{9,10}");
                if (valid == false) {
                    JOptionPane.showMessageDialog(null, "Enter a 10 digit number");
                    jTextField12.setText("");
                    jTextField12.requestFocus();
                } else if (uid1.equals(jTextField15.getText())) {

                    try {
                        String uid = jTextField15.getText();
                        String name = jTextField14.getText();
                        String pass = jPasswordField3.getText();
                        String address = jTextField13.getText();
                        int mobile = Integer.parseInt(jTextField12.getText());
                        String email = jTextField11.getText();
                        String Type = "Admin";

                        User u = new User(uid, name, pass, address, mobile, email, Type);
                        list.add(u);
//                        list.display();
                        JOptionPane.showMessageDialog(null, "Update Complete");

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "ID Cannot be change");
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
//        list.head = null;
//        list.head.next = null;

        try {
            String sql = "Select * from details WHERE UserID=? AND Type=?;";
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, uid1);
            p.setString(2, "Admin");
            ResultSet rs = p.executeQuery();
//            ResultSetMetaData rsmd = rs.getMetaData();
//
//            int cols = rsmd.getColumnCount();
//            String[] colName = new String[cols];
//            for (int i = 0; i < cols; i++) {
//                colName[i] = rsmd.getColumnName(i + 1);

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
                jTextField15.setText(uid);
                jTextField14.setText(name);
                jPasswordField3.setText(pass);
                jTextField13.setText(address);
                jTextField12.setText(Integer.toString(mobile));
                jTextField11.setText(email);
            }
//            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
//
//            User beforeuser = (User) list.getbeforelast();
//            jTextField15.setText(uid1);
//            jTextField14.setText(name1);
//            jPasswordField3.setText(pass1);
//            jTextField13.setText(address1);
//            jTextField12.setText(Integer.toString(mobile1));
//            jTextField11.setText(email1);
//
//            User u = new User(uid1, name1, pass1, address1, mobile1, email1, Type1);
//            list.add(u);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Node currentNode = list.tail;
            User user = (User) currentNode.data;

            String sql = "UPDATE details SET name=?,pass=?,Address=?,Mobile=?,Email=?,Type=? WHERE UserID=?;";
            PreparedStatement p = con.prepareStatement(sql);

            p.setString(1, user.getName());
            p.setString(2, user.getPass());
            p.setString(3, user.getAddress());
            p.setInt(4, user.getMobile());
            p.setString(5, user.getEmail());
            p.setString(6, "Admin");
            p.setString(7, user.getUid());
            p.executeUpdate();

            Admindash d = new Admindash(uid1, name1, pass1, address1, mobile1, email1, Type1);
            d.show();
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        User beforeuser = (User) list.getbeforelast();
        if (beforeuser == null) {
            JOptionPane.showMessageDialog(null, "NO Previous Data");
        } else {
            jTextField15.setText(beforeuser.getUid());
            jTextField14.setText(beforeuser.getName());
            jPasswordField3.setText(beforeuser.getPass());
            jTextField13.setText(beforeuser.getAddress());
            jTextField12.setText(Integer.toString(beforeuser.getMobile()));
            jTextField11.setText(beforeuser.getEmail());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    // End of variables declaration//GEN-END:variables
}