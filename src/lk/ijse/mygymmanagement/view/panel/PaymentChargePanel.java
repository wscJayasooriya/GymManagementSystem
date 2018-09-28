/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.view.panel;


import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import lk.ijse.mygymmanagement.controller.ManageInstructorController;
import lk.ijse.mygymmanagement.controller.ManageInventoryController;
import lk.ijse.mygymmanagement.controller.PaymentChargeController;
import lk.ijse.mygymmanagementsystem.commmon.IDGenarator;
import lk.ijse.mygymmanagementsystem.core.dto.InstructorDTO;
import lk.ijse.mygymmanagementsystem.core.dto.InventoryDTO;
import lk.ijse.mygymmanagementsystem.core.dto.PaymentChargeDTO;
import lk.ijse.mygymmanagementsystem.view.HomePage;

/**
 *
 * @author Chinthaka
 */
public class PaymentChargePanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public PaymentChargePanel() {
        initComponents();
        loadAllCharge();
        getPaymentChargeID();

        tblCharge.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                if (tblCharge.getSelectedRow() == -1) {
                    return;
                }

                String paymentTypeID = tblCharge.getValueAt(tblCharge.getSelectedRow(), 0).toString();
                String paymentType = tblCharge.getValueAt(tblCharge.getSelectedRow(), 1).toString();
                String charge = tblCharge.getValueAt(tblCharge.getSelectedRow(), 2).toString();

                txtPTID.setText(paymentTypeID);
                txtPType.setText(paymentType);
                txtCharge.setText(charge);
            }
        });

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
        jLabel21 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtPTID = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtCharge = new javax.swing.JTextField();
        lblAddNew = new javax.swing.JLabel();
        lblModify = new javax.swing.JLabel();
        lblRemove = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCharge = new javax.swing.JTable();
        txtPType = new javax.swing.JTextField();
        lblSave = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(970, 570));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Stencil Std", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/mygymmanagementsystem/image/linecons_e020(0)_48.png"))); // NOI18N
        jLabel2.setText("Payment Type..");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 280, 50);

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

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Payment Type ID");
        add(jLabel27);
        jLabel27.setBounds(80, 150, 140, 30);

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText(":");
        add(jLabel33);
        jLabel33.setBounds(230, 150, 20, 30);

        txtPTID.setBackground(new Color(0,0,0,0f));
        txtPTID.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPTID.setForeground(new java.awt.Color(255, 255, 255));
        txtPTID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPTID.setAutoscrolls(false);
        txtPTID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));
        txtPTID.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPTID.setOpaque(false);
        txtPTID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPTIDActionPerformed(evt);
            }
        });
        txtPTID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPTIDKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPTIDKeyReleased(evt);
            }
        });
        add(txtPTID);
        txtPTID.setBounds(260, 150, 140, 30);

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText(":");
        add(jLabel32);
        jLabel32.setBounds(230, 190, 20, 30);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Payment Type");
        add(jLabel20);
        jLabel20.setBounds(80, 190, 140, 30);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Charge");
        add(jLabel22);
        jLabel22.setBounds(80, 230, 140, 30);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText(":");
        add(jLabel24);
        jLabel24.setBounds(230, 230, 20, 30);

        txtCharge.setBackground(new Color(0,0,0,0f));
        txtCharge.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtCharge.setForeground(new java.awt.Color(255, 255, 255));
        txtCharge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCharge.setAutoscrolls(false);
        txtCharge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));
        txtCharge.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCharge.setOpaque(false);
        txtCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChargeActionPerformed(evt);
            }
        });
        txtCharge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtChargeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtChargeKeyReleased(evt);
            }
        });
        add(txtCharge);
        txtCharge.setBounds(260, 230, 140, 30);

        lblAddNew.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblAddNew.setForeground(new java.awt.Color(255, 255, 255));
        lblAddNew.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/mygymmanagementsystem/image/add.png"))); // NOI18N
        lblAddNew.setText("Add New ");
        lblAddNew.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAddNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAddNewMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddNewMouseClicked(evt);
            }
        });
        add(lblAddNew);
        lblAddNew.setBounds(50, 100, 150, 30);

        lblModify.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblModify.setForeground(new java.awt.Color(255, 255, 255));
        lblModify.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModify.setText("Modify");
        lblModify.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblModify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblModifyMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModifyMouseClicked(evt);
            }
        });
        add(lblModify);
        lblModify.setBounds(120, 420, 110, 30);

        lblRemove.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblRemove.setForeground(new java.awt.Color(255, 255, 255));
        lblRemove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRemove.setText("Remove");
        lblRemove.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRemoveMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRemoveMouseClicked(evt);
            }
        });
        add(lblRemove);
        lblRemove.setBounds(260, 420, 140, 30);

        tblCharge.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Payment ID", "Payment Type", "Charge"
            }
        ));
        jScrollPane1.setViewportView(tblCharge);

        add(jScrollPane1);
        jScrollPane1.setBounds(460, 150, 452, 300);

        txtPType.setBackground(new Color(0,0,0,0f));
        txtPType.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPType.setForeground(new java.awt.Color(255, 255, 255));
        txtPType.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPType.setAutoscrolls(false);
        txtPType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));
        txtPType.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPType.setOpaque(false);
        txtPType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPTypeActionPerformed(evt);
            }
        });
        txtPType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPTypeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPTypeKeyReleased(evt);
            }
        });
        add(txtPType);
        txtPType.setBounds(260, 190, 140, 30);

        lblSave.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblSave.setForeground(new java.awt.Color(255, 255, 255));
        lblSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/mygymmanagementsystem/image/save.png"))); // NOI18N
        lblSave.setText("Save");
        lblSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSaveMouseClicked(evt);
            }
        });
        add(lblSave);
        lblSave.setBounds(310, 290, 90, 40);

        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 153, 51), new java.awt.Color(255, 153, 51), new java.awt.Color(255, 153, 51), new java.awt.Color(255, 153, 51)));
        add(jLabel3);
        jLabel3.setBounds(20, 70, 910, 490);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/mygymmanagementsystem/image/Untitled-1.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 3));
        add(jLabel1);
        jLabel1.setBounds(0, 0, 970, 570);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        SettingPanel settingPanel = new SettingPanel();
        JPanel middlePanel = HomePage.getMainPanel();
        middlePanel.removeAll();
        settingPanel.setSize(middlePanel.getSize());
        middlePanel.add(settingPanel);
        middlePanel.revalidate();
        middlePanel.repaint();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void txtPTIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPTIDActionPerformed
        txtPType.requestFocus();
    }//GEN-LAST:event_txtPTIDActionPerformed

    private void txtPTIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPTIDKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPTIDKeyPressed

    private void txtPTIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPTIDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPTIDKeyReleased

    private void txtChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChargeActionPerformed

    private void txtChargeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChargeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChargeKeyPressed

    private void txtChargeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChargeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChargeKeyReleased

    private void lblAddNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddNewMouseClicked
        clearAllTextFileds();
        getPaymentChargeID();
        txtPTID.requestFocusInWindow();
    }//GEN-LAST:event_lblAddNewMouseClicked

    private void lblAddNewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddNewMousePressed

    }//GEN-LAST:event_lblAddNewMousePressed

    private void lblModifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModifyMouseClicked

            PaymentChargeDTO charge = new PaymentChargeDTO(
                    txtPTID.getText(),
                    txtPType.getText(),
                    txtCharge.getText());

            try {
                boolean result = PaymentChargeController.updateCharge(charge);

                if (result) {
                    JOptionPane.showMessageDialog(this, "Charge has been successfully Updated.");
                    loadAllCharge();
                    clearAllTextFileds();
                    txtPTID.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Charge hasn't been Updated due to some error");
                }

            } catch (Exception ex) {
             //   Logger.getLogger(.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_lblModifyMouseClicked

    private void lblModifyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModifyMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblModifyMousePressed

    private void lblRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemoveMouseClicked
        PaymentChargeDTO charge = new PaymentChargeDTO(
                txtPTID.getText(),
                txtPType.getText(),
                txtCharge.getText());
        try {
            boolean result = PaymentChargeController.deleteCharge(charge);

            if (result) {
                JOptionPane.showMessageDialog(this, "New Charge has been successfully deleted.");
                loadAllCharge();
            } else {
                JOptionPane.showMessageDialog(this, "New Charge hasn't been deleted due to some error");
            }

        } catch (Exception ex) {
            Logger.getLogger(PaymentChargePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        clearAllTextFileds();
        txtPTID.requestFocus();
    }//GEN-LAST:event_lblRemoveMouseClicked

    private void lblRemoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemoveMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRemoveMousePressed

    private void lblSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseClicked
        try {
            PaymentChargeDTO charge = new PaymentChargeDTO(
                    txtPTID.getText(),
                    txtPType.getText(),
                    txtCharge.getText());

            boolean result = PaymentChargeController.addCharge(charge);

            if (result) {
                JOptionPane.showMessageDialog(this, "New Charge has been successfully Saved.");
                loadAllCharge();
                getPaymentChargeID();
            } else {
                JOptionPane.showMessageDialog(this, "New Charge hasn't been Saved due to some error");
            }
        } catch (Exception ex) {
            Logger.getLogger(PaymentChargePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        clearAllTextFileds();
        txtPType.requestFocus();
    }//GEN-LAST:event_lblSaveMouseClicked

    private void txtPTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPTypeActionPerformed
        txtCharge.requestFocus();
    }//GEN-LAST:event_txtPTypeActionPerformed

    private void txtPTypeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPTypeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPTypeKeyPressed

    private void txtPTypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPTypeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPTypeKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddNew;
    private javax.swing.JLabel lblModify;
    private javax.swing.JLabel lblRemove;
    private javax.swing.JLabel lblSave;
    private javax.swing.JTable tblCharge;
    private javax.swing.JTextField txtCharge;
    private javax.swing.JTextField txtPTID;
    private javax.swing.JTextField txtPType;
    // End of variables declaration//GEN-END:variables

    private void clearAllTextFileds() {
        // txtPTID.setText("");
        txtPType.setText("");
        txtCharge.setText("");
    }

    private void loadAllCharge() {
        try {
            ArrayList<PaymentChargeDTO> allCharges = PaymentChargeController.getAllCharge();

            DefaultTableModel dtm = (DefaultTableModel) tblCharge.getModel();

            dtm.setRowCount(0);

            if (allCharges != null) {

                for (PaymentChargeDTO charge : allCharges) {

                    Object[] rowData = {
                        charge.getPaymentTypeID(),
                        charge.getPaymentType(),
                        charge.getCharge()
                    };

                    dtm.addRow(rowData);

                }

            }

        } catch (Exception ex) {
            Logger.getLogger(PaymentChargePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getPaymentChargeID() {
        String newID;
        try {
            newID = IDGenarator.getNewID("paymentcharge", "Payment_Charge_ID", "Pc");
            txtPTID.setText(newID);

        } catch (SQLException ex) {
            Logger.getLogger(RegMemberPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegMemberPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}