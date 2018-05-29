/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Chen
 */
public class PanelLanding extends javax.swing.JPanel {

    /**
     * Creates new form PanelHome
     */
    public PanelLanding() {
        initComponents();
        
        PanelAnnouncement pa = new PanelAnnouncement();
    
        panelContent.setLayout(new java.awt.BorderLayout());
        panelContent.add(pa);
        panelContent.repaint();
        panelContent.revalidate();
    }

    public JLabel getLblUsername() {
        return lblUsername;
    }

    public void setLblUsername(JLabel lblUsername) {
        this.lblUsername = lblUsername;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSidebar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLibrary = new javax.swing.JButton();
        btnAnnouncement1 = new javax.swing.JButton();
        btnCanteen = new javax.swing.JButton();
        btnCanteenPOS = new javax.swing.JButton();
        btnCanteenInventory = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        panelHeader = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        panelContent = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1366, 768));
        setLayout(null);

        panelSidebar.setBackground(new java.awt.Color(38, 48, 58));
        panelSidebar.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Oswald Regular", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGO HERE");
        panelSidebar.add(jLabel1);
        jLabel1.setBounds(80, 80, 80, 30);

        btnLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnLibraryOrange.png"))); // NOI18N
        btnLibrary.setText("jButton1");
        btnLibrary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibraryActionPerformed(evt);
            }
        });
        panelSidebar.add(btnLibrary);
        btnLibrary.setBounds(0, 390, 220, 40);

        btnAnnouncement1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnAnnouncement.png"))); // NOI18N
        btnAnnouncement1.setText("jButton1");
        btnAnnouncement1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnouncement1ActionPerformed(evt);
            }
        });
        panelSidebar.add(btnAnnouncement1);
        btnAnnouncement1.setBounds(0, 170, 220, 40);

        btnCanteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnCanteenOrange.png"))); // NOI18N
        btnCanteen.setText("jButton1");
        btnCanteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanteenActionPerformed(evt);
            }
        });
        panelSidebar.add(btnCanteen);
        btnCanteen.setBounds(0, 230, 220, 40);

        btnCanteenPOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnPosBlue.png"))); // NOI18N
        btnCanteenPOS.setText("jButton1");
        btnCanteenPOS.setBorder(null);
        btnCanteenPOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanteenPOSActionPerformed(evt);
            }
        });
        panelSidebar.add(btnCanteenPOS);
        btnCanteenPOS.setBounds(0, 330, 220, 40);

        btnCanteenInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnInventoryBlue.png"))); // NOI18N
        btnCanteenInventory.setText("jButton1");
        btnCanteenInventory.setBorder(null);
        btnCanteenInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanteenInventoryActionPerformed(evt);
            }
        });
        panelSidebar.add(btnCanteenInventory);
        btnCanteenInventory.setBounds(0, 280, 220, 40);

        add(panelSidebar);
        panelSidebar.setBounds(0, 0, 210, 770);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        lblUsername.setFont(new java.awt.Font("Oswald Regular", 0, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 84, 38));
        lblUsername.setText("User User");
        jPanel4.add(lblUsername);
        lblUsername.setBounds(910, 0, 80, 60);

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnLogout.png"))); // NOI18N
        btnLogout.setContentAreaFilled(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel4.add(btnLogout);
        btnLogout.setBounds(1050, 0, 50, 60);

        btnProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img-user.png"))); // NOI18N
        btnProfile.setContentAreaFilled(false);
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        jPanel4.add(btnProfile);
        btnProfile.setBounds(990, 0, 70, 60);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnClose.png"))); // NOI18N
        btnClose.setContentAreaFilled(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel4.add(btnClose);
        btnClose.setBounds(1100, 0, 50, 60);

        add(jPanel4);
        jPanel4.setBounds(210, 0, 1160, 60);

        panelHeader.setBackground(new java.awt.Color(47, 55, 66));

        lblHeader.setFont(new java.awt.Font("Oswald Regular", 0, 36)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText("Announcement");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(910, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        add(panelHeader);
        panelHeader.setBounds(210, 60, 1160, 110);

        panelContent.setBackground(new java.awt.Color(255, 255, 255));
        panelContent.setLayout(null);
        add(panelContent);
        panelContent.setBounds(230, 190, 1160, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLibraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibraryActionPerformed
        // TODO add your handling code here:
        lblHeader.setText("Library");

        panelContent.removeAll();
        panelContent.repaint();
        panelContent.revalidate();

        // pnlContent.add(pnlLibrary);
        panelContent.repaint();
        panelContent.revalidate();
    }//GEN-LAST:event_btnLibraryActionPerformed

    private void btnAnnouncement1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnouncement1ActionPerformed
        // TODO add your handling code here:
        lblHeader.setText("Announcement");

        PanelAnnouncement pa = new PanelAnnouncement();
        panelContent.removeAll();
        panelContent.repaint();
        panelContent.revalidate();

        panelContent.setLayout(new java.awt.BorderLayout());
        panelContent.add(pa);
        panelContent.repaint();
        panelContent.revalidate();
    }//GEN-LAST:event_btnAnnouncement1ActionPerformed

    private void btnCanteenPOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanteenPOSActionPerformed
        // TODO add your handling code here:
        lblHeader.setText("Canteen");

        PanelCanteenPOS pc = new PanelCanteenPOS();
        panelContent.removeAll();
        panelContent.repaint();
        panelContent.revalidate();

        panelContent.setLayout(new java.awt.BorderLayout());
        panelContent.add(pc);
        panelContent.revalidate();
        panelContent.repaint();
    }//GEN-LAST:event_btnCanteenPOSActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        PanelHome pl = new PanelHome();
        this.removeAll();
        this.repaint();
        this.revalidate();

        this.setLayout(new java.awt.BorderLayout());
        this.add(pl);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        
        lblHeader.setText("Profile");

        PanelProfile pp = new PanelProfile();
        panelContent.removeAll();
        panelContent.repaint();
        panelContent.revalidate();

        panelContent.setLayout(new java.awt.BorderLayout());
        panelContent.add(pp);
        panelContent.revalidate();
        panelContent.repaint();
        
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnCanteenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanteenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCanteenActionPerformed

    private void btnCanteenInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanteenInventoryActionPerformed
        // TODO add your handling code here:
        lblHeader.setText("Canteen");

        PanelCanteenInventory pc = new PanelCanteenInventory();
        panelContent.removeAll();
        panelContent.repaint();
        panelContent.revalidate();

        panelContent.setLayout(new java.awt.BorderLayout());
        panelContent.add(pc);
        panelContent.revalidate();
        panelContent.repaint();
    }//GEN-LAST:event_btnCanteenInventoryActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnouncement1;
    private javax.swing.JButton btnCanteen;
    private javax.swing.JButton btnCanteenInventory;
    private javax.swing.JButton btnCanteenPOS;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnLibrary;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel panelContent;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelSidebar;
    // End of variables declaration//GEN-END:variables
}
