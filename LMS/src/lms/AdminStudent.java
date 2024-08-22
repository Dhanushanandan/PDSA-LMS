/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lms;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danus
 */
public class AdminStudent extends javax.swing.JFrame {

    /**
     * Creates new form AdminStudent
     */
    MyLinkedList<Object> list = new MyLinkedList<>();
    MyLinkedList<Object> list1 = new MyLinkedList<>();
    Database db = new Database();
    Connection con = db.DBConnect();

    String uid1 = "";
    String name1 = "";
    String pass1 = "";
    String address1 = "";
    int mobile1 = 0;
    String email1 = "";
    String Type1 = "";

    public AdminStudent() {
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

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jTextField15 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html> <p align=\"justify\">Students contribute significantly and actively to education as learners. They participate in class discussions, engage with both teachers and students, and exhibit receptive behavior. The function of students in education has shifted from that of facilitator to task monitor as a result of changing circumstances. In addition to gathering resources for learning and assignments, they also monitor their study sessions and return them to their proper locations after use. Among the most important responsibilities that students play as learners in education are having outstanding communication skills, being kind and courteous, and applying what they learn in real-world situations.</p></html");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 390, 410));

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("HOME");
        jButton5.setBorder(new javax.swing.border.MatteBorder(null));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 130, 40));

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("ADD Student");
        jButton6.setBorder(new javax.swing.border.MatteBorder(null));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 150, 40));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("View Student");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 140, 40));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Remove Student");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 150, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/INCuDP.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 570));

        jTabbedPane1.addTab("Dashboard", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("User ID");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Name");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Password");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Address");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Mobile");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("E-mail");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        jTextField11.setBackground(new java.awt.Color(255, 255, 255));
        jTextField11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(0, 0, 0));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 290, -1));

        jTextField12.setBackground(new java.awt.Color(255, 255, 255));
        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 290, -1));

        jTextField13.setBackground(new java.awt.Color(255, 255, 255));
        jTextField13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 290, -1));

        jTextField14.setBackground(new java.awt.Color(255, 255, 255));
        jTextField14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 290, -1));

        jPasswordField3.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPasswordField3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 290, -1));

        jTextField15.setBackground(new java.awt.Color(255, 255, 255));
        jTextField15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 290, -1));

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("Create Account");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 170, 50));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, 120, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/INCuDP.jpg"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        jTabbedPane1.addTab("Add student", jPanel3);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("STUDENTS DETAILS");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 360, 40));

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(jTable1);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 800, 310));

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("HOME");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 120, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/photo-1485322551133-3a4c27a9d925.jpeg"))); // NOI18N
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 670));

        jTabbedPane1.addTab("View Students", jPanel6);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setBackground(new java.awt.Color(153, 153, 153));
        jTable2.setBorder(new javax.swing.border.MatteBorder(null));
        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(0, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(jTable2);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 800, 210));

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 260, 40));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Book ID");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setText("HOME");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 120, 40));

        jButton16.setBackground(new java.awt.Color(204, 204, 204));
        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 0, 0));
        jButton16.setText("REMOVE");
        jButton16.setBorder(new javax.swing.border.MatteBorder(null));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 130, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/R.jpeg"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 950, 680));

        jTabbedPane1.addTab("Remove Students", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 900, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 900, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Admindash d = new Admindash(uid1, name1, pass1, address1, mobile1, email1, Type1);
        d.show();
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
        list.head = null;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
        //if clicked again refresh the table to avoid the duplicate values
        jTable1.setModel(new DefaultTableModel());
        list.head = null;
        try {
            String qry = "Select UserId,name,pass,Address,Mobile,Email from details where Type='User'";
            PreparedStatement p = con.prepareStatement(qry);
            ResultSet rs = p.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for (int i = 0; i < cols; i++) {
                colName[i] = rsmd.getColumnName(i + 1);

                String uid, name, pass, address, email, Type="User";
                int mobile;

                while (rs.next()) {
                    uid = rs.getString(1);
                    name = rs.getString(2);
                    pass = rs.getString(3);
                    address = rs.getString(4);
                    mobile = Integer.parseInt(rs.getString(5));
                    email = rs.getString(6);
//                    Type = rs.getString(7);
                    User b = new User(uid, name, pass, address, mobile, email, Type);
                    list.add(b);
                }

            }

            //            list.display();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setColumnCount(0);

            String[] columnNames = {"User ID", "User Name", "Address", "Mobile", "Email"};
            model.setColumnIdentifiers(columnNames);

            Node currentNode = list.head;
            while (currentNode != null) {
                User b1 = (User) currentNode.data;
                model.addRow(new Object[]{b1.getUid(), b1.getName(), b1.getAddress(), b1.getMobile(), b1.getEmail()});
                currentNode = currentNode.next;
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
        jTabbedPane1.setSelectedIndex(3);
        //if clicked again refresh the table to avoid the duplicate values
        //if clicked again refresh the table to avoid the duplicate values
        jTable2.setModel(new DefaultTableModel());
        list.head = null;
        try {
            String qry = "Select UserId,pass,name,Address,Mobile,Email from details where Type='User'";
            PreparedStatement p = con.prepareStatement(qry);
            ResultSet rs = p.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for (int i = 0; i < cols; i++) {
                colName[i] = rsmd.getColumnName(i + 1);

                String uid, name, pass, address, email, Type="User";
                int mobile;

                while (rs.next()) {
                    uid = rs.getString(1);
                    name = rs.getString(2);
                    pass = rs.getString(3);
                    address = rs.getString(4);
                    mobile = Integer.parseInt(rs.getString(5));
                    email = rs.getString(6);
//                    Type = rs.getString(7);
                    User b = new User(uid, name, pass, address, mobile, email, Type);
                    list.add(b);
                }

            }

            //            list.display();
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setColumnCount(0);

            String[] columnNames = {"User ID", "User Name", "Address", "Mobile", "Email"};
            model.setColumnIdentifiers(columnNames);

            Node currentNode = list.head;
            while (currentNode != null) {
                User b1 = (User) currentNode.data;
                model.addRow(new Object[]{b1.getUid(), b1.getName(), b1.getAddress(), b1.getMobile(), b1.getEmail()});
                currentNode = currentNode.next;
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int value = 1, value1 = 0;
        try {
            String qry = "Select * from details";
            PreparedStatement p = con.prepareStatement(qry);
            ResultSet rs = p.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

//            int cols = rsmd.getColumnCount();
//            String[] colName = new String[cols];
//            for (int i = 0; i < cols; i++) {
//                colName[i] = rsmd.getColumnName(i + 1);
            String uid3, name3, pass3, address3, email3, Type3;
            int mobile3;

            while (rs.next()) {
                uid3 = rs.getString(1);
                name3 = rs.getString(2);
                pass3 = rs.getString(3);
                address3 = rs.getString(4);
                mobile3 = Integer.parseInt(rs.getString(5));
                email3 = rs.getString(6);
                Type3 = rs.getString(7);
                User b = new User(uid3, name3, pass3, address3, mobile3, email3, Type3);
                list1.add(b);
//                }

            }

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
                } else {
                    try {
                        String uid = jTextField15.getText();
                        String name = jTextField14.getText();
                        String pass = jPasswordField3.getText();
                        String address = jTextField13.getText();
                        int mobile = Integer.parseInt(jTextField12.getText());
                        String email = jTextField11.getText();
                        String Type = "User";

                        User u = new User(uid, name, pass, address, mobile, email, Type);

                        Node currentNode = list.head;
                        while (currentNode != null) {
                            User user = (User) currentNode.data;

                            if (user.getUid().equals(uid)) {
                                value = 0;
                                break;
                            }
                            currentNode = currentNode.next;
//                    value=1;
                        }
                        if (value == 1) {

                            String qry5 = "Select * from details";
                            PreparedStatement p5 = con.prepareStatement(qry5);
                            ResultSet rs5 = p5.executeQuery();

                            String uid5, name5, pass5, address5, email5, Type5;
                            int mobile5;

                            while (rs.next()) {
                                uid5 = rs.getString(1);
                                name5 = rs.getString(2);
                                pass5 = rs.getString(3);
                                address5 = rs.getString(4);
                                mobile5 = Integer.parseInt(rs.getString(5));
                                email5 = rs.getString(6);
                                Type5 = rs.getString(7);
                                User b5 = new User(uid5, name5, pass5, address5, mobile5, email5, Type5);
                                list1.add(b5);
                            }

                            Node currentNode1 = list1.head;
                            while (currentNode1 != null) {
                                User user1 = (User) currentNode1.data;

                                if (user1.getUid().equals(uid)) {
                                    value1 = 1;
                                    break;
                                }
                                currentNode1 = currentNode1.next;
//                    value=1;
                            }

                            if (value1 == 1) {
                                JOptionPane.showMessageDialog(null, "User ID Already Exist in database");
//                            jTextField15.setText("");
//                            jTextField15.requestFocus();
                            } else {

                                list.add(u);
                                //                        list.display();
                                JOptionPane.showMessageDialog(null, "Create Complete");
                                jTextField15.setText("");
                                jTextField14.setText("");
                                jPasswordField3.setText("");
                                jTextField13.setText("");
                                jTextField12.setText("");
                                jTextField11.setText("");
                                jTextField15.requestFocus();
                            }

                        } else if(value==0) {
                            JOptionPane.showMessageDialog(null, "User ID Already Exist in List");
                            jTextField15.setText("");
                            jTextField15.requestFocus();
                        }

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex);
                    }
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {

            Node currentNode = list.head;
            while (currentNode != null) {
                User user = (User) currentNode.data;
                String sql = "insert into details values(?,?,?,?,?,?,?)";
                PreparedStatement p = con.prepareStatement(sql);

                p.setString(1, user.getUid());
                p.setString(2, user.getName());
                p.setString(3, user.getPass());
                p.setString(4, user.getAddress());
                p.setInt(5, user.getMobile());
                p.setString(6, user.getEmail());
                p.setString(7, "User");
                p.executeUpdate();
                currentNode = currentNode.next;
            }
            Admindash d = new Admindash(uid1, name1, pass1, address1, mobile1, email1, Type1);
            d.show();
            this.dispose();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Admindash d = new Admindash(uid1, name1, pass1, address1, mobile1, email1, Type1);
        d.show();
        this.dispose();

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        try {
            String sql1 = "Delete from details Where Type='User'";
            PreparedStatement p1 = con.prepareStatement(sql1);
            p1.executeUpdate();

            Node currentNode = list.head;
            while (currentNode != null) {
                User user1 = (User) currentNode.data;
                String sql = "insert into details values(?,?,?,?,?,?,?)";
                PreparedStatement p = con.prepareStatement(sql);

                p.setString(1, user1.getUid());
                p.setString(2, user1.getName());
                p.setString(3, user1.getPass());
                p.setString(4, user1.getAddress());
                p.setInt(5, user1.getMobile());
                p.setString(6, user1.getEmail());
                p.setString(7, "User");
                p.executeUpdate();
                currentNode = currentNode.next;
            }
            Admindash d = new Admindash(uid1, name1, pass1, address1, mobile1, email1, Type1);
            d.show();
            this.dispose();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        //        Admindash d = new Admindash(uid1, name1, pass1, address1, mobile1, email1, Type1);
        //        d.show();
        //        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
//        list.display();
        User ouser = null;
        int value1 = 0;
        String uid = jTextField5.getText();
        if (jTextField5.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter a User ID");
            jTextField5.requestFocus();
        } else {
            Node currentNode1 = list.head;
            while (currentNode1 != null) {
                User user1 = (User) currentNode1.data;

                if (user1.getUid().equals(uid)) {
                    value1 = 1;
                    ouser = user1;
                    break;
                }
                currentNode1 = currentNode1.next;
                //                    value=1;
            }

            if (value1 == 1) {
                list.remove(ouser);
                JOptionPane.showMessageDialog(null, "User REMOVED SUCCESS");
                //                        list.display();

                //if clicked again refresh the table to avoid the duplicate values
                jTable2.setModel(new DefaultTableModel());
                try {
                    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                    model.setColumnCount(0);

                    String[] columnNames = {"User ID", "User Name", "Address", "Mobile", "Email"};
                    model.setColumnIdentifiers(columnNames);

                    Node currentNode = list.head;
                    while (currentNode != null) {
                        User b1 = (User) currentNode.data;
                        model.addRow(new Object[]{b1.getUid(), b1.getName(), b1.getAddress(), b1.getMobile(), b1.getEmail()});
                        currentNode = currentNode.next;
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(null, "USER ID DOES NOT EXIST IN THE DATABASE");
                jTextField5.setText("");
                jTextField5.requestFocus();
            }

        }
    }//GEN-LAST:event_jButton16ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}