/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.view.panel;

import java.awt.Color;
import javax.swing.JPanel;
import lk.ijse.mygymmanagementsystem.view.HomePage;

/**
 *
 * @author Chinthaka
 */
public class ManageUserPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public ManageUserPanel() {
        initComponents();
        
    }

    ManageUserPanel(HomePage homePage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtFname8 = new javax.swing.JTextField();
        lblModifyAccount = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        btnConfirm = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(970, 570));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Stencil Std", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/mygymmanagementsystem/image/manageUser.png"))); // NOI18N
        jLabel2.setText("Manage User..");
        add(jLabel2);
        jLabel2.setBounds(20, 10, 280, 50);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText(":");
        add(jLabel14);
        jLabel14.setBounds(470, 150, 20, 30);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/mygymmanagementsystem/image/back.png"))); // NOI18N
        jLabel21.setText("BACK");
        jLabel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        add(jLabel21);
        jLabel21.setBounds(840, 10, 120, 50);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("User Name");
        add(jLabel17);
        jLabel17.setBounds(300, 150, 140, 30);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("User Type");
        add(jLabel19);
        jLabel19.setBounds(300, 200, 140, 30);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Password");
        add(jLabel20);
        jLabel20.setBounds(300, 250, 140, 30);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Re-Enter Password");
        add(jLabel22);
        jLabel22.setBounds(300, 300, 150, 30);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText(":");
        add(jLabel24);
        jLabel24.setBounds(470, 300, 20, 30);

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText(":");
        add(jLabel27);
        jLabel27.setBounds(470, 250, 20, 30);

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText(":");
        add(jLabel28);
        jLabel28.setBounds(470, 200, 20, 30);

        txtFname8.setBackground(new Color(0,0,0,0f));
        txtFname8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtFname8.setForeground(new java.awt.Color(255, 255, 255));
        txtFname8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFname8.setAutoscrolls(false);
        txtFname8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));
        txtFname8.setCaretColor(new java.awt.Color(255, 255, 255));
        txtFname8.setOpaque(false);
        txtFname8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFname8ActionPerformed(evt);
            }
        });
        txtFname8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFname8KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFname8KeyReleased(evt);
            }
        });
        add(txtFname8);
        txtFname8.setBounds(520, 150, 230, 30);

        lblModifyAccount.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblModifyAccount.setForeground(new java.awt.Color(255, 255, 255));
        lblModifyAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModifyAccount.setText("Modify Account");
        lblModifyAccount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblModifyAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModifyAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblModifyAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblModifyAccountMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblModifyAccountMousePressed(evt);
            }
        });
        add(lblModifyAccount);
        lblModifyAccount.setBounds(600, 420, 150, 30);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Owner" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));
        add(jComboBox1);
        jComboBox1.setBounds(520, 200, 230, 30);

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setText("sadu");
        jPasswordField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        jPasswordField1.setOpaque(false);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        add(jPasswordField1);
        jPasswordField1.setBounds(520, 300, 230, 30);

        jPasswordField2.setBackground(new Color(0,0,0,0f));
        jPasswordField2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField2.setText("sadu");
        jPasswordField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        jPasswordField2.setOpaque(false);
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        add(jPasswordField2);
        jPasswordField2.setBounds(520, 250, 230, 30);

        btnConfirm.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnConfirm.setText("Confirm");
        btnConfirm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfirmMouseExited(evt);
            }
        });
        add(btnConfirm);
        btnConfirm.setBounds(480, 350, 100, 30);

        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 153, 51), new java.awt.Color(255, 153, 51), new java.awt.Color(255, 153, 51), new java.awt.Color(255, 153, 51)));
        add(jLabel3);
        jLabel3.setBounds(260, 110, 520, 370);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/mygymmanagementsystem/image/Untitled-1.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 3));
        add(jLabel1);
        jLabel1.setBounds(0, 0, 970, 570);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFname8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFname8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFname8ActionPerformed

    private void txtFname8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFname8KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFname8KeyPressed

    private void txtFname8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFname8KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFname8KeyReleased

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void lblModifyAccountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModifyAccountMousePressed
        /*this.removeAll();
        RemoveUser r1=new RemoveUser();
        r1.setVisible(true);
        r1.setSize(this.getSize());
        this.add(r1);
        this.repaint();
        this.revalidate();*/
    }//GEN-LAST:event_lblModifyAccountMousePressed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        SettingPanel settingPanel = new SettingPanel();
        JPanel middlePanel = HomePage.getMainPanel();
        middlePanel.removeAll();
        settingPanel.setSize(middlePanel.getSize());
        middlePanel.add(settingPanel);
        middlePanel.revalidate();
        middlePanel.repaint();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void lblModifyAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModifyAccountMouseClicked
        ModifyUser m1 = new ModifyUser();
        JPanel middlePanel = HomePage.getMainPanel();
        middlePanel.removeAll();
        m1.setSize(middlePanel.getSize());
        middlePanel.add(m1);
        middlePanel.revalidate();
        middlePanel.repaint();
    }//GEN-LAST:event_lblModifyAccountMouseClicked

    private void btnConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseEntered
        btnConfirm.setSize(120, 40);
    }//GEN-LAST:event_btnConfirmMouseEntered

    private void btnConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseExited
        btnConfirm.setSize(100, 30);
    }//GEN-LAST:event_btnConfirmMouseExited

    private void lblModifyAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModifyAccountMouseEntered
         lblModifyAccount.setSize(170, 40);
    }//GEN-LAST:event_lblModifyAccountMouseEntered

    private void lblModifyAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModifyAccountMouseExited
        lblModifyAccount.setSize(150, 30);
    }//GEN-LAST:event_lblModifyAccountMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JLabel lblModifyAccount;
    private javax.swing.JTextField txtFname8;
    // End of variables declaration//GEN-END:variables
}
