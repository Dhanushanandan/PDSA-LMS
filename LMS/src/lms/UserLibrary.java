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
public class UserLibrary extends javax.swing.JFrame {

    /**
     * Creates new form UserLibrary
     */
    MyLinkedList<Object> list = new MyLinkedList<>();
    MyLinkedList<Object> list1 = new MyLinkedList<>();
    MyStack stack = new MyStack();
    Database db = new Database();
    Connection con = db.DBConnect();

    String uid1 = "";
    String name1 = "";
    String pass1 = "";
    String address1 = "";
    int mobile1 = 0;
    String email1 = "";
    String Type1 = "";

    public UserLibrary() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("<html> <p align=\"justify\">A library is a collection of books, periodicals, newspapers, and other materials that are available for public use or loan. Giving everyone access to knowledge and information regardless of background or ability to pay. Libraries act as a hub for research, education, and leisure, enabling people to broaden their horizons, explore new ideas, and connect with like-minded individuals. Libraries also provide services beyond book lending, such as computer access, educational programs, and community events.</p></html");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 310, 430));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close all jframe.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, 30, 30));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("View Books");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 130, 40));

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
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 130, 40));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("FEED BACK");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 130, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.jpeg"))); // NOI18N
        jLabel1.setText("\n");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -70, 1070, 670));

        jTabbedPane1.addTab("Dash Board", jPanel1);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("BOOK DETAILS");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 270, 40));

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

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 800, 310));

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("HOME");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 120, 40));

        jButton11.setBackground(new java.awt.Color(116, 105, 182));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 0));
        jButton11.setText("Search");
        jButton11.setBorder(null);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 80, 30));
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 190, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/photo-1485322551133-3a4c27a9d925.jpeg"))); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 670));

        jTabbedPane1.addTab("View Book", jPanel5);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Give Your feedback here:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 530, 150));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 550, 180));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 140, 50));

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setText("HOME");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 120, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IMG-20240822-WA0002.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 910, 590));

        jTabbedPane1.addTab("Feed Back", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Userdash d = new Userdash(uid1, name1, pass1, address1, mobile1, email1, Type1);
        d.show();
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Userdash d = new Userdash(uid1, name1, pass1, address1, mobile1, email1, Type1);
        d.show();
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
        //if clicked again refresh the table to avoid the duplicate values
        jTable1.setModel(new DefaultTableModel());
        list.head = null;
        try {
            String qry = "Select * from book";
            PreparedStatement p = con.prepareStatement(qry);
            ResultSet rs = p.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for (int i = 0; i < cols; i++) {
                colName[i] = rsmd.getColumnName(i + 1);

                String bid, bname, bauthor;
                while (rs.next()) {
                    bid = rs.getString(1);
                    bname = rs.getString(2);
                    bauthor = rs.getString(3);
                    Books b = new Books(bid, bname, bauthor);
                    list.add(b);
                }

            }

            //            list.display();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setColumnCount(0);

            String[] columnNames = {"Book ID", "Book Name", "Book Author"};
            model.setColumnIdentifiers(columnNames);

            Node currentNode = list.head;
            while (currentNode != null) {
                Books b1 = (Books) currentNode.data;
                model.addRow(new Object[]{b1.getBookid(), b1.getBookname(), b1.getBookauthor()});
                currentNode = currentNode.next;
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        //if clicked again refresh the table to avoid the duplicate values
        jTable1.setModel(new DefaultTableModel());
        list.head = null;
        try {
            String qry = "Select * from book";
            PreparedStatement p = con.prepareStatement(qry);
            ResultSet rs = p.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for (int i = 0; i < cols; i++) {
                colName[i] = rsmd.getColumnName(i + 1);

                String bid, bname, bauthor;
                while (rs.next()) {
                    bid = rs.getString(1);
                    bname = rs.getString(2);
                    bauthor = rs.getString(3);
                    Books b = new Books(bid, bname, bauthor);
                    list.add(b);
                }

            }

            //            list.display();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setColumnCount(0);

            String[] columnNames = {"Book ID", "Book Name", "Book Author"};
            model.setColumnIdentifiers(columnNames);

            Node currentNode = list.head;
            while (currentNode != null) {
                Books b1 = (Books) currentNode.data;
                model.addRow(new Object[]{b1.getBookid(), b1.getBookname(), b1.getBookauthor()});
                currentNode = currentNode.next;
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:

        jTable1.setModel(new DefaultTableModel());
        String search = jTextField1.getText();
        list1.head = null;

        if (search.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter a valid input Book Id,Name or which Author ");
            jTextField1.setText("");
            jTextField1.requestFocus();

        } else {
            Node currentNode = list.head;
            while (currentNode != null) {
                Books b1 = (Books) currentNode.data;
                String tid = b1.getBookid();
                String tname = b1.getBookname();
                String tauthor = b1.getBookauthor();
                if (tid.equals(search) || tname.equals(search) || tauthor.equals(search)) {
                    list1.add(b1);
                }
                currentNode = currentNode.next;
            }

            if (list1.isempty()) {
                JOptionPane.showMessageDialog(null, "NO Result found");
                jTable1.setModel(new DefaultTableModel());
                //                list.head = null;
                try {
                    //                    String qry = "Select * from book";
                    //                    PreparedStatement p = con.prepareStatement(qry);
                    //                    ResultSet rs = p.executeQuery();
                    //                    ResultSetMetaData rsmd = rs.getMetaData();
                    //
                    //                    int cols = rsmd.getColumnCount();
                    //                    String[] colName = new String[cols];
                    //                    for (int i = 0; i < cols; i++) {
                    //                        colName[i] = rsmd.getColumnName(i + 1);
                    //
                    //                        String bid, bname, bauthor;
                    //                        while (rs.next()) {
                    //                            bid = rs.getString(1);
                    //                            bname = rs.getString(2);
                    //                            bauthor = rs.getString(3);
                    //                            Books b = new Books(bid, bname, bauthor);
                    //                            list.add(b);
                    //                        }
                    //
                    //                    }

                    //            list.display();
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    model.setColumnCount(0);

                    String[] columnNames = {"Book ID", "Book Name", "Book Author"};
                    model.setColumnIdentifiers(columnNames);

                    Node currentNode1 = list.head;
                    while (currentNode1 != null) {
                        Books b1 = (Books) currentNode1.data;
                        model.addRow(new Object[]{b1.getBookid(), b1.getBookname(), b1.getBookauthor()});
                        currentNode1 = currentNode1.next;
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }

            } else {
                jTable1.setModel(new DefaultTableModel());
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setColumnCount(0);

                String[] columnNames = {"Book ID", "Book Name", "Book Author"};
                model.setColumnIdentifiers(columnNames);

                Node currentNode1 = list1.head;
                while (currentNode1 != null) {
                    Books b1 = (Books) currentNode1.data;
                    model.addRow(new Object[]{b1.getBookid(), b1.getBookname(), b1.getBookauthor()});
                    currentNode1 = currentNode1.next;
                }
            }
        }

        //                PreparedStatement p = con.prepareStatement("Select * from book Where bookid=? OR bookName=? OR bookauthor=?");
        //                p.setString(1, search);
        //                p.setString(2, search);
        //                p.setString(3, search);
        //                ResultSet rs = p.executeQuery();
        //                ResultSetMetaData rsmd = rs.getMetaData();
        //                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        //
        //                int cols = rsmd.getColumnCount();
        //                String[] colName = new String[cols];
        //                for (int i = 0; i < cols; i++) {
        //                    colName[i] = rsmd.getColumnName(i + 1);
        //                    model.setColumnIdentifiers(colName);
        //
        //                    String id, name, sp;
        //                    while (rs.next()) {
        //                        id = rs.getString(1);
        //                        name = rs.getString(2);
        //                        sp = rs.getString(3);
        //                        Name = name;
        //                        String[] row = {id, name, sp};
        //                        model.addRow(row);
        //                    }
        //
        //                }
        //                if (Name.equals("")) {
        //                    JOptionPane.showMessageDialog(null, "NO Result found");
        //                    try {
        //                        //if clicked again refresh the table to avoid the duplicate values
        //                        jTable1.setModel(new DefaultTableModel());
        //
        //                        String qry = "Select * from book";
        //                        PreparedStatement p1 = con.prepareStatement(qry);
        //                        ResultSet rs1 = p1.executeQuery(qry);
        //                        ResultSetMetaData rsmd1 = rs1.getMetaData();
        //                        DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
        //
        //                        int cols1 = rsmd1.getColumnCount();
        //                        String[] colName1 = new String[cols1];
        //                        for (int i = 0; i < cols1; i++) {
        //                            colName1[i] = rsmd1.getColumnName(i + 1);
        //                            model1.setColumnIdentifiers(colName1);
        //
        //                            String id, name, sp;
        //                            while (rs1.next()) {
        //                                id = rs1.getString(1);
        //                                name = rs1.getString(2);
        //                                sp = rs1.getString(3);
        //
        //                                String[] row1 = {id, name, sp};
        //                                model1.addRow(row1);
        //                            }
        //                        }
        //
        //                    } catch (Exception ex) {
        //                        JOptionPane.showMessageDialog(null, ex);
        //                    }
        //                }
        //            }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String feed = jTextArea1.getText();
        if (feed.equals("")) {
            JOptionPane.showMessageDialog(null, "Write Some Feed backs");
            jTextArea1.requestFocus();
        } else {
            stack.push(feed);
            JOptionPane.showMessageDialog(null, "Feed back Submitted");
            jTextArea1.setText("");
            jTextArea1.requestFocus();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        try {
            while (!stack.isEmpty()) {

                String sql = "insert into feedback values(?)";
                PreparedStatement p = con.prepareStatement(sql);

                p.setString(1, stack.peek());
                p.executeUpdate();
                stack.pop();
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        Userdash d = new Userdash(uid1, name1, pass1, address1, mobile1, email1, Type1);
        d.show();
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(UserLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLibrary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}