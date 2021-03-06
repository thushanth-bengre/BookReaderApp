/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CampaignManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Minal
 */
public class CampaignManagerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CampaignManagerJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private Enterprise enterprise;
    private UserAccount account;
    private Organization organization;
    public CampaignManagerJPanel(JPanel userProcessContainer, EcoSystem business, Enterprise enterprise, UserAccount account, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise=enterprise;
        this.business=business;
        this.organization=organization;
        this.account=account;
        jLabelName.setText(account.getEmployee().getFirstName() + " " + account.getEmployee().getLastName());        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCampaignDirectory = new javax.swing.JButton();
        btnCreateCampaign = new javax.swing.JButton();
        btnBid = new javax.swing.JButton();
        btnOutgoingRevenue = new javax.swing.JButton();
        btnNotification = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();

        btnCampaignDirectory.setText("Campaign Directory");
        btnCampaignDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCampaignDirectoryActionPerformed(evt);
            }
        });

        btnCreateCampaign.setText("Create Campaign");
        btnCreateCampaign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCampaignActionPerformed(evt);
            }
        });

        btnBid.setText("Bid");
        btnBid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBidActionPerformed(evt);
            }
        });

        btnOutgoingRevenue.setText("Outgoing Revenue");
        btnOutgoingRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutgoingRevenueActionPerformed(evt);
            }
        });

        btnNotification.setText("Notification");
        btnNotification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotificationActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Campaign Manager Work Area");

        jLabelName.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(283, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCampaignDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCreateCampaign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOutgoingRevenue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNotification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(291, 291, 291))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(jLabelName)
                .addGap(66, 66, 66)
                .addComponent(btnCampaignDirectory)
                .addGap(54, 54, 54)
                .addComponent(btnCreateCampaign)
                .addGap(66, 66, 66)
                .addComponent(btnBid)
                .addGap(70, 70, 70)
                .addComponent(btnOutgoingRevenue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnNotification)
                .addGap(55, 55, 55))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCampaignDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCampaignDirectoryActionPerformed
        // TODO add your handling code here:
        CampaignDirectoryPanel panel = new CampaignDirectoryPanel(userProcessContainer,organization);
        userProcessContainer.add("Campaign Directory", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
       
    }//GEN-LAST:event_btnCampaignDirectoryActionPerformed

    private void btnCreateCampaignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCampaignActionPerformed
        // TODO add your handling code here:
        CreateCampaignPanel panel = new CreateCampaignPanel(userProcessContainer,organization,account,business,enterprise);
        userProcessContainer.add("Create Campaign", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateCampaignActionPerformed

    private void btnBidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBidActionPerformed
        // TODO add your handling code here:
        BidPanel panel = new BidPanel(userProcessContainer,organization,account,business,enterprise);
        userProcessContainer.add("Bid", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBidActionPerformed

    private void btnOutgoingRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutgoingRevenueActionPerformed
        // TODO add your handling code here:
        OutgoingRevenuePanel panel = new OutgoingRevenuePanel(userProcessContainer,organization,enterprise);
        userProcessContainer.add("Outgoing Revenue", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOutgoingRevenueActionPerformed

    private void btnNotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotificationActionPerformed
        // TODO add your handling code here:
        NotificationPanel panel = new NotificationPanel(userProcessContainer, organization);
        userProcessContainer.add("Notification", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnNotificationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBid;
    private javax.swing.JButton btnCampaignDirectory;
    private javax.swing.JButton btnCreateCampaign;
    private javax.swing.JButton btnNotification;
    private javax.swing.JButton btnOutgoingRevenue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelName;
    // End of variables declaration//GEN-END:variables
}
