/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.view.panel;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import lk.ijse.mygymmanagement.controller.ManageInventoryController;
import lk.ijse.mygymmanagementsystem.core.dto.InventoryDTO;
import lk.ijse.mygymmanagementsystem.view.HomePage;

/**
 *
 * @author Chinthaka
 */
public class SearchInventoryPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public SearchInventoryPanel() {
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
        jLabel19 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtFname10 = new javax.swing.JTextField();
        txtInventoryName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtBrandName = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(970, 570));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Stencil Std", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/mygymmanagementsystem/image/searchInventory.png"))); // NOI18N
        jLabel2.setText("search Inventory..");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 360, 50);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Inventory ID");
        add(jLabel19);
        jLabel19.setBounds(70, 130, 140, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText(":");
        add(jLabel15);
        jLabel15.setBounds(230, 130, 20, 30);

        txtFname10.setBackground(new Color(0,0,0,0f));
        txtFname10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtFname10.setForeground(new java.awt.Color(255, 255, 255));
        txtFname10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFname10.setAutoscrolls(false);
        txtFname10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));
        txtFname10.setCaretColor(new java.awt.Color(255, 255, 255));
        txtFname10.setOpaque(false);
        txtFname10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFname10ActionPerformed(evt);
            }
        });
        txtFname10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFname10KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFname10KeyReleased(evt);
            }
        });
        add(txtFname10);
        txtFname10.setBounds(260, 130, 180, 30);

        txtInventoryName.setBackground(new Color(0,0,0,0f));
        txtInventoryName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtInventoryName.setForeground(new java.awt.Color(255, 255, 255));
        txtInventoryName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInventoryName.setAutoscrolls(false);
        txtInventoryName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));
        txtInventoryName.setCaretColor(new java.awt.Color(255, 255, 255));
        txtInventoryName.setOpaque(false);
        txtInventoryName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInventoryNameActionPerformed(evt);
            }
        });
        txtInventoryName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtInventoryNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInventoryNameKeyReleased(evt);
            }
        });
        add(txtInventoryName);
        txtInventoryName.setBounds(260, 180, 180, 30);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText(":");
        add(jLabel16);
        jLabel16.setBounds(230, 180, 20, 30);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Inventory Name");
        add(jLabel20);
        jLabel20.setBounds(70, 180, 140, 30);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Brand Name");
        add(jLabel21);
        jLabel21.setBounds(70, 230, 150, 30);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText(":");
        add(jLabel17);
        jLabel17.setBounds(230, 230, 20, 30);

        txtBrandName.setBackground(new Color(0,0,0,0f));
        txtBrandName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtBrandName.setForeground(new java.awt.Color(255, 255, 255));
        txtBrandName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBrandName.setAutoscrolls(false);
        txtBrandName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));
        txtBrandName.setCaretColor(new java.awt.Color(255, 255, 255));
        txtBrandName.setOpaque(false);
        txtBrandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandNameActionPerformed(evt);
            }
        });
        txtBrandName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBrandNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBrandNameKeyReleased(evt);
            }
        });
        add(txtBrandName);
        txtBrandName.setBounds(260, 230, 180, 30);

        txtQty.setBackground(new Color(0,0,0,0f));
        txtQty.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtQty.setForeground(new java.awt.Color(255, 255, 255));
        txtQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQty.setAutoscrolls(false);
        txtQty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));
        txtQty.setCaretColor(new java.awt.Color(255, 255, 255));
        txtQty.setOpaque(false);
        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQtyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyKeyReleased(evt);
            }
        });
        add(txtQty);
        txtQty.setBounds(260, 280, 180, 30);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText(":");
        add(jLabel18);
        jLabel18.setBounds(230, 280, 20, 30);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Qty");
        add(jLabel22);
        jLabel22.setBounds(70, 280, 140, 30);

        lblSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/mygymmanagementsystem/image/search.png"))); // NOI18N
        lblSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchMouseClicked(evt);
            }
        });
        add(lblSearch);
        lblSearch.setBounds(450, 120, 50, 50);

        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 153, 51), new java.awt.Color(255, 153, 51), new java.awt.Color(255, 153, 51), new java.awt.Color(255, 153, 51)));
        add(jLabel3);
        jLabel3.setBounds(20, 70, 910, 490);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/mygymmanagementsystem/image/back.png"))); // NOI18N
        jLabel23.setText("BACK");
        jLabel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        add(jLabel23);
        jLabel23.setBounds(840, 10, 120, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/mygymmanagementsystem/image/Untitled-1.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 3));
        add(jLabel1);
        jLabel1.setBounds(0, 0, 970, 570);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFname10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFname10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFname10ActionPerformed

    private void txtFname10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFname10KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFname10KeyPressed

    private void txtFname10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFname10KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFname10KeyReleased

    private void txtInventoryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInventoryNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInventoryNameActionPerformed

    private void txtInventoryNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInventoryNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInventoryNameKeyPressed

    private void txtInventoryNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInventoryNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInventoryNameKeyReleased

    private void txtBrandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandNameActionPerformed

    private void txtBrandNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBrandNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandNameKeyPressed

    private void txtBrandNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBrandNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandNameKeyReleased

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtyActionPerformed

    private void txtQtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtyKeyPressed

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtyKeyReleased

    private void lblSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchMouseClicked
        try {
            InventoryDTO inventoryDTO = ManageInventoryController.searchInventory(txtFname10.getText());
            txtInventoryName.setText(inventoryDTO.getInventoryName());
            txtBrandName.setText(inventoryDTO.getBrandName());
            txtQty.setText(Integer.toString(inventoryDTO.getQty()));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "No Inventory");
        }
    }//GEN-LAST:event_lblSearchMouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        HomePanel hp = new HomePanel();
        JPanel middlePanel = HomePage.getMainPanel();
        middlePanel.removeAll();
        hp.setSize(middlePanel.getSize());
        middlePanel.add(hp);
        middlePanel.revalidate();
        middlePanel.repaint();
    }//GEN-LAST:event_jLabel23MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtFname10;
    private javax.swing.JTextField txtInventoryName;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables
}