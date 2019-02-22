/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageAirlinerUserInterface;
import Business.Airliner;
import Business.AirlinerCatalog;
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author rusha
 */
public class ManageAirliner_JPanel extends javax.swing.JPanel {
private AirlinerCatalog airlinercatalog;
private JPanel Display_JPanel;
private Airliner airliner;

    /**
     * Creates new form ManageAirliner_JPanel
     */
    public ManageAirliner_JPanel(JPanel Display_JPanel, AirlinerCatalog airlinercatalog) {
        initComponents();
        this.airliner=airliner;
        this.airlinercatalog=airlinercatalog;
        this.Display_JPanel=Display_JPanel;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Create_JButton = new javax.swing.JButton();
        ManageView_JButton = new javax.swing.JButton();

        Create_JButton.setText("Create");
        Create_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_JButtonActionPerformed(evt);
            }
        });

        ManageView_JButton.setText("Manage/ View");
        ManageView_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageView_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Create_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageView_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(Create_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ManageView_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Create_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_JButtonActionPerformed
        // TODO add your handling code here:
        CreateAirliner_JPanel createairlinerpanel=new CreateAirliner_JPanel(Display_JPanel, airlinercatalog);
        Display_JPanel.add("CreateAirliner_JPanel",createairlinerpanel);
        CardLayout layout=(CardLayout) Display_JPanel.getLayout();
        layout.next(Display_JPanel);

    }//GEN-LAST:event_Create_JButtonActionPerformed

    private void ManageView_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageView_JButtonActionPerformed
        // TODO add your handling code here:
        ManageViewAirliner_JPanel manageviewairlinerpanel=new ManageViewAirliner_JPanel(Display_JPanel, airlinercatalog);
        Display_JPanel.add("ManageViewAirliner_JPanel",manageviewairlinerpanel);
        CardLayout layout=(CardLayout) Display_JPanel.getLayout();
        layout.next(Display_JPanel);
        /*
        ViewAirplane_JPanel viewairplanepanel=new ViewAirplane_JPanel(Display_JPanel,airplane,airplanecatalog);
        Display_JPanel.add("ViewAirplane_JPanel",viewairplanepanel);
        CardLayout layout=(CardLayout) Display_JPanel.getLayout();
        layout.next(Display_JPanel);*/

    }//GEN-LAST:event_ManageView_JButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Create_JButton;
    private javax.swing.JButton ManageView_JButton;
    // End of variables declaration//GEN-END:variables
}