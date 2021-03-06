/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.view.panel;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import lk.ijse.mygymmanagementsystem.view.HomePage;

/**
 *
 * @author Chinthaka
 */
public class SettingPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
     
    public SettingPanel() {
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
        lblManageUser = new javax.swing.JLabel();
        lblManageUserPic = new javax.swing.JLabel();
        lblManageInventory = new javax.swing.JLabel();
        lblManageInventoryPic = new javax.swing.JLabel();
        lblCreateCard = new javax.swing.JLabel();
        lblCreateCardPic = new javax.swing.JLabel();
        lblManageMember = new javax.swing.JLabel();
        lblMAnageMemberPic = new javax.swing.JLabel();
        lblPaymentDetaails = new javax.swing.JLabel();
        lblPayementDetailsPic = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(970, 570));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Stencil Std", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/mygymmanagementsystem/image/setting-2.png"))); // NOI18N
        jLabel2.setText("Setting..");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 190, 50);

        lblManageUser.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblManageUser.setForeground(new java.awt.Color(255, 255, 255));
        lblManageUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageUser.setText("Manage User");
        lblManageUser.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblManageUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        lblManageUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManageUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblManageUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblManageUserMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageUserMousePressed(evt);
            }
        });
        add(lblManageUser);
        lblManageUser.setBounds(70, 100, 200, 200);

        lblManageUserPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/mygymmanagementsystem/image/SettingManageUser.png"))); // NOI18N
        add(lblManageUserPic);
        lblManageUserPic.setBounds(90, 100, 165, 165);

        lblManageInventory.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblManageInventory.setForeground(new java.awt.Color(255, 255, 255));
        lblManageInventory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageInventory.setText("Manage Inventory");
        lblManageInventory.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblManageInventory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        lblManageInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManageInventoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblManageInventoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblManageInventoryMouseExited(evt);
            }
        });
        add(lblManageInventory);
        lblManageInventory.setBounds(360, 100, 200, 200);

        lblManageInventoryPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/mygymmanagementsystem/image/SettingManageInvenory.png"))); // NOI18N
        add(lblManageInventoryPic);
        lblManageInventoryPic.setBounds(380, 100, 165, 165);

        lblCreateCard.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblCreateCard.setForeground(new java.awt.Color(255, 255, 255));
        lblCreateCard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateCard.setText("Create Card");
        lblCreateCard.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblCreateCard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        lblCreateCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreateCardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCreateCardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCreateCardMouseExited(evt);
            }
        });
        add(lblCreateCard);
        lblCreateCard.setBounds(210, 340, 200, 200);

        lblCreateCardPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/mygymmanagementsystem/image/SettingCreateCard.png"))); // NOI18N
        add(lblCreateCardPic);
        lblCreateCardPic.setBounds(230, 340, 165, 165);

        lblManageMember.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblManageMember.setForeground(new java.awt.Color(255, 255, 255));
        lblManageMember.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageMember.setText("Manage Member");
        lblManageMember.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblManageMember.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        lblManageMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManageMemberMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblManageMemberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblManageMemberMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageMemberMousePressed(evt);
            }
        });
        add(lblManageMember);
        lblManageMember.setBounds(650, 100, 200, 200);

        lblMAnageMemberPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/mygymmanagementsystem/image/member_1.png"))); // NOI18N
        add(lblMAnageMemberPic);
        lblMAnageMemberPic.setBounds(670, 100, 165, 165);

        lblPaymentDetaails.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblPaymentDetaails.setForeground(new java.awt.Color(255, 255, 255));
        lblPaymentDetaails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPaymentDetaails.setText("Paymet Charge");
        lblPaymentDetaails.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblPaymentDetaails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        lblPaymentDetaails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPaymentDetaailsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPaymentDetaailsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPaymentDetaailsMouseExited(evt);
            }
        });
        add(lblPaymentDetaails);
        lblPaymentDetaails.setBounds(500, 340, 200, 200);

        lblPayementDetailsPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/mygymmanagementsystem/image/linecons_e021(0)_256.png"))); // NOI18N
        add(lblPayementDetailsPic);
        lblPayementDetailsPic.setBounds(520, 340, 160, 160);

        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 153, 51), new java.awt.Color(255, 153, 51), new java.awt.Color(255, 153, 51), new java.awt.Color(255, 153, 51)));
        add(jLabel3);
        jLabel3.setBounds(20, 70, 910, 490);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/mygymmanagementsystem/image/Untitled-1.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 3));
        add(jLabel1);
        jLabel1.setBounds(0, 0, 970, 570);
    }// </editor-fold>//GEN-END:initComponents

    private void lblManageUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageUserMousePressed
       
        
    }//GEN-LAST:event_lblManageUserMousePressed

    private void lblManageUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageUserMouseEntered
        lblManageUser.setBorder(new LineBorder(new Color(255, 153, 51), 3));
        lblManageUser.setForeground(new Color(255, 153, 51));

    }//GEN-LAST:event_lblManageUserMouseEntered

    private void lblManageUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageUserMouseExited
        lblManageUser.setBorder(new LineBorder(Color.WHITE, 3));
        lblManageUser.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblManageUserMouseExited

    private void lblManageInventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageInventoryMouseEntered
        lblManageInventory.setBorder(new LineBorder(new Color(255, 153, 51), 3));
        lblManageInventory.setForeground(new Color(255, 153, 51));
    }//GEN-LAST:event_lblManageInventoryMouseEntered

    private void lblManageInventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageInventoryMouseExited
        lblManageInventory.setBorder(new LineBorder(Color.WHITE, 3));
        lblManageInventory.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblManageInventoryMouseExited

    private void lblCreateCardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateCardMouseEntered
        lblCreateCard.setBorder(new LineBorder(new Color(255, 153, 51), 3));
        lblCreateCard.setForeground(new Color(255, 153, 51));
    }//GEN-LAST:event_lblCreateCardMouseEntered

    private void lblCreateCardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateCardMouseExited
        lblCreateCard.setBorder(new LineBorder(Color.WHITE, 3));
        lblCreateCard.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblCreateCardMouseExited

    private void lblManageUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageUserMouseClicked
        ManageUserPanel manageUserPanel = new ManageUserPanel();
        JPanel middlePanel = HomePage.getMainPanel();
        middlePanel.removeAll();
        manageUserPanel.setSize(middlePanel.getSize());
        middlePanel.add(manageUserPanel);
        middlePanel.revalidate();
        middlePanel.repaint();
    }//GEN-LAST:event_lblManageUserMouseClicked

    private void lblManageInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageInventoryMouseClicked
        ManageInventoryPanel manageInventoryPanel = new ManageInventoryPanel();
        JPanel middlePanel = HomePage.getMainPanel();
        middlePanel.removeAll();
        manageInventoryPanel.setSize(middlePanel.getSize());
        middlePanel.add(manageInventoryPanel);
        middlePanel.revalidate();
        middlePanel.repaint();
    }//GEN-LAST:event_lblManageInventoryMouseClicked

    private void lblManageMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageMemberMouseClicked
        ManageMemberPanel manageMemberPanel = new ManageMemberPanel();
        JPanel middlePanel = HomePage.getMainPanel();
        middlePanel.removeAll();
        manageMemberPanel.setSize(middlePanel.getSize());
        middlePanel.add(manageMemberPanel);
        middlePanel.revalidate();
        middlePanel.repaint();
    }//GEN-LAST:event_lblManageMemberMouseClicked

    private void lblManageMemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageMemberMouseEntered
        lblManageMember.setBorder(new LineBorder(new Color(255, 153, 51), 3));
        lblManageMember.setForeground(new Color(255, 153, 51));
    }//GEN-LAST:event_lblManageMemberMouseEntered

    private void lblManageMemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageMemberMouseExited
        lblManageMember.setBorder(new LineBorder(Color.WHITE, 3));
        lblManageMember.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblManageMemberMouseExited

    private void lblManageMemberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageMemberMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManageMemberMousePressed

    private void lblCreateCardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateCardMouseClicked
        CreateMemberCard card = new CreateMemberCard();
        JPanel middlePanel = HomePage.getMainPanel();
        middlePanel.removeAll();
        card.setSize(middlePanel.getSize());
        middlePanel.add(card);
        middlePanel.revalidate();
        middlePanel.repaint();
    }//GEN-LAST:event_lblCreateCardMouseClicked

    private void lblPaymentDetaailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPaymentDetaailsMouseClicked
        PaymentChargePanel ptp = new PaymentChargePanel();
        JPanel middlePanel = HomePage.getMainPanel();
        middlePanel.removeAll();
        ptp.setSize(middlePanel.getSize());
        middlePanel.add(ptp);
        middlePanel.revalidate();
        middlePanel.repaint();
    }//GEN-LAST:event_lblPaymentDetaailsMouseClicked

    private void lblPaymentDetaailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPaymentDetaailsMouseEntered
        lblPaymentDetaails.setBorder(new LineBorder(new Color(255, 153, 51), 3));
        lblPaymentDetaails.setForeground(new Color(255, 153, 51));
    }//GEN-LAST:event_lblPaymentDetaailsMouseEntered

    private void lblPaymentDetaailsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPaymentDetaailsMouseExited
        lblPaymentDetaails.setBorder(new LineBorder(Color.WHITE, 3));
        lblPaymentDetaails.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblPaymentDetaailsMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCreateCard;
    private javax.swing.JLabel lblCreateCardPic;
    private javax.swing.JLabel lblMAnageMemberPic;
    private javax.swing.JLabel lblManageInventory;
    private javax.swing.JLabel lblManageInventoryPic;
    private javax.swing.JLabel lblManageMember;
    private javax.swing.JLabel lblManageUser;
    private javax.swing.JLabel lblManageUserPic;
    private javax.swing.JLabel lblPayementDetailsPic;
    private javax.swing.JLabel lblPaymentDetaails;
    // End of variables declaration//GEN-END:variables
}
