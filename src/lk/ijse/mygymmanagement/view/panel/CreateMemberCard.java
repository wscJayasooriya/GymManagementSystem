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
public class CreateMemberCard extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public CreateMemberCard() {
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

        jLabel2 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        txtMemberRegNo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtFname16 = new javax.swing.JTextField();
        txtFname14 = new javax.swing.JTextField();
        txtFname11 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblCreate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(970, 570));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Stencil Std", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/mygymmanagementsystem/image/createcard.png"))); // NOI18N
        jLabel2.setText("create member card..");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 380, 50);

        lblBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblBack.setForeground(new java.awt.Color(255, 255, 255));
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/mygymmanagementsystem/image/back.png"))); // NOI18N
        lblBack.setText("BACK");
        lblBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        add(lblBack);
        lblBack.setBounds(840, 10, 120, 50);

        txtMemberRegNo.setBackground(new Color(0,0,0,0f));
        txtMemberRegNo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtMemberRegNo.setForeground(new java.awt.Color(255, 255, 255));
        txtMemberRegNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMemberRegNo.setAutoscrolls(false);
        txtMemberRegNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));
        txtMemberRegNo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtMemberRegNo.setOpaque(false);
        txtMemberRegNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberRegNoActionPerformed(evt);
            }
        });
        txtMemberRegNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMemberRegNoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMemberRegNoKeyReleased(evt);
            }
        });
        add(txtMemberRegNo);
        txtMemberRegNo.setBounds(290, 180, 230, 30);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText(":");
        add(jLabel16);
        jLabel16.setBounds(250, 180, 20, 30);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Member Reg.No");
        add(jLabel19);
        jLabel19.setBounds(90, 180, 140, 30);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("User Name");
        add(jLabel23);
        jLabel23.setBounds(90, 230, 140, 30);

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText(":");
        add(jLabel29);
        jLabel29.setBounds(250, 230, 20, 30);

        txtFname16.setBackground(new Color(0,0,0,0f));
        txtFname16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtFname16.setForeground(new java.awt.Color(255, 255, 255));
        txtFname16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFname16.setAutoscrolls(false);
        txtFname16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));
        txtFname16.setCaretColor(new java.awt.Color(255, 255, 255));
        txtFname16.setOpaque(false);
        txtFname16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFname16ActionPerformed(evt);
            }
        });
        txtFname16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFname16KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFname16KeyReleased(evt);
            }
        });
        add(txtFname16);
        txtFname16.setBounds(290, 230, 230, 30);

        txtFname14.setBackground(new Color(0,0,0,0f));
        txtFname14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtFname14.setForeground(new java.awt.Color(255, 255, 255));
        txtFname14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFname14.setAutoscrolls(false);
        txtFname14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));
        txtFname14.setCaretColor(new java.awt.Color(255, 255, 255));
        txtFname14.setOpaque(false);
        txtFname14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFname14ActionPerformed(evt);
            }
        });
        txtFname14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFname14KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFname14KeyReleased(evt);
            }
        });
        add(txtFname14);
        txtFname14.setBounds(290, 280, 230, 30);

        txtFname11.setBackground(new Color(0,0,0,0f));
        txtFname11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtFname11.setForeground(new java.awt.Color(255, 255, 255));
        txtFname11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFname11.setAutoscrolls(false);
        txtFname11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));
        txtFname11.setCaretColor(new java.awt.Color(255, 255, 255));
        txtFname11.setOpaque(false);
        txtFname11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFname11ActionPerformed(evt);
            }
        });
        txtFname11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFname11KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFname11KeyReleased(evt);
            }
        });
        add(txtFname11);
        txtFname11.setBounds(290, 330, 230, 30);

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText(":");
        add(jLabel30);
        jLabel30.setBounds(250, 330, 20, 30);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText(":");
        add(jLabel17);
        jLabel17.setBounds(250, 280, 20, 30);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Phone No");
        add(jLabel25);
        jLabel25.setBounds(90, 280, 140, 30);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Payment Date");
        add(jLabel26);
        jLabel26.setBounds(90, 330, 140, 30);

        lblCreate.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblCreate.setForeground(new java.awt.Color(255, 255, 255));
        lblCreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreate.setText("Create");
        lblCreate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        lblCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCreateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCreateMouseExited(evt);
            }
        });
        add(lblCreate);
        lblCreate.setBounds(410, 400, 110, 40);

        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 153, 51), new java.awt.Color(255, 153, 51), new java.awt.Color(255, 153, 51), new java.awt.Color(255, 153, 51)));
        add(jLabel3);
        jLabel3.setBounds(20, 70, 910, 490);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/mygymmanagementsystem/image/Untitled-1.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 3));
        add(jLabel1);
        jLabel1.setBounds(0, 0, 970, 570);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        SettingPanel settingPanel = new SettingPanel();
        JPanel middlePanel = HomePage.getMainPanel();
        middlePanel.removeAll();
        settingPanel.setSize(middlePanel.getSize());
        middlePanel.add(settingPanel);
        middlePanel.revalidate();
        middlePanel.repaint();
    }//GEN-LAST:event_lblBackMouseClicked

    private void txtMemberRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberRegNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberRegNoActionPerformed

    private void txtMemberRegNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMemberRegNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberRegNoKeyPressed

    private void txtMemberRegNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMemberRegNoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberRegNoKeyReleased

    private void txtFname16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFname16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFname16ActionPerformed

    private void txtFname16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFname16KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFname16KeyPressed

    private void txtFname16KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFname16KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFname16KeyReleased

    private void txtFname14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFname14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFname14ActionPerformed

    private void txtFname14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFname14KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFname14KeyPressed

    private void txtFname14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFname14KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFname14KeyReleased

    private void txtFname11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFname11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFname11ActionPerformed

    private void txtFname11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFname11KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFname11KeyPressed

    private void txtFname11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFname11KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFname11KeyReleased

    private void lblCreateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateMouseEntered
        lblCreate.setSize(140,50);
    }//GEN-LAST:event_lblCreateMouseEntered

    private void lblCreateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateMouseExited
        lblCreate.setSize(110, 40);
    }//GEN-LAST:event_lblCreateMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblCreate;
    private javax.swing.JTextField txtFname11;
    private javax.swing.JTextField txtFname14;
    private javax.swing.JTextField txtFname16;
    private javax.swing.JTextField txtMemberRegNo;
    // End of variables declaration//GEN-END:variables
}
