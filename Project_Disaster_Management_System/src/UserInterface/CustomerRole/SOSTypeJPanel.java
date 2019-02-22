/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.Customer.CustomerDirectory;
import Business.Disaster;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author janiv
 */
public class SOSTypeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SOSType
     */
    private Disaster disaster;
    private JPanel userProcessContainer;
    private CustomerDirectory cusDir;

    SOSTypeJPanel(JPanel userProcessContainer, CustomerDirectory cusDir, String street, String type,Disaster disaster) {
         initComponents();
         this.userProcessContainer=userProcessContainer;
         this.cusDir=cusDir;
         this.disaster=disaster;
         Street_JTextField.setText(street);
         if(type=="RED"){
           
         CodeRed_JButton.setEnabled(true);
       CodeBlue_JButton.setEnabled(false);
         userProcessContainer.setBackground(Color.red);
        
         
         }
         else if(type=="BLUE"){
         CodeRed_JButton.setEnabled(false);
         CodeBlue_JButton.setEnabled(true);
         userProcessContainer.setBackground(Color.blue);
        
         
         
         }
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CodeRed_JButton = new javax.swing.JButton();
        CodeBlue_JButton = new javax.swing.JButton();
        LifeThreatning_JLabel = new javax.swing.JLabel();
        Street_JLabel = new javax.swing.JLabel();
        Street_JTextField = new javax.swing.JTextField();
        Back_JButton = new javax.swing.JButton();

        CodeRed_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CodeRed_JButton.setForeground(new java.awt.Color(255, 51, 51));
        CodeRed_JButton.setText("CODE RED");
        CodeRed_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodeRed_JButtonActionPerformed(evt);
            }
        });

        CodeBlue_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CodeBlue_JButton.setForeground(new java.awt.Color(51, 51, 255));
        CodeBlue_JButton.setText("CODE BLUE");
        CodeBlue_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodeBlue_JButtonActionPerformed(evt);
            }
        });

        LifeThreatning_JLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LifeThreatning_JLabel.setText("(Life Threatning)");

        Street_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Street_JLabel.setText("Street :");

        Street_JTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Street_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Street_JTextFieldActionPerformed(evt);
            }
        });

        Back_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back_JButton.setText("<< Back");
        Back_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back_JButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CodeRed_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Street_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Street_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(CodeBlue_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(LifeThreatning_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(410, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back_JButton)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Street_JLabel)
                    .addComponent(Street_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodeRed_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodeBlue_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(LifeThreatning_JLabel)
                .addContainerGap(411, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CodeRed_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodeRed_JButtonActionPerformed
        // TODO add your handling code here:
        
            PoliceCustomerPanel rpcp = new PoliceCustomerPanel(userProcessContainer,cusDir,disaster);
            userProcessContainer.add("CodeBlueJPanel",rpcp);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        
        
        
    }//GEN-LAST:event_CodeRed_JButtonActionPerformed

    private void Street_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Street_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Street_JTextFieldActionPerformed

    private void Back_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_JButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerWorkPanel customerWorkPanel = (CustomerWorkPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_Back_JButtonActionPerformed

    private void CodeBlue_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodeBlue_JButtonActionPerformed
        // TODO add your handling code here:
            CodeBlueJPanel codeBlueJPanel = new CodeBlueJPanel(userProcessContainer, disaster,cusDir);
            userProcessContainer.add("CodeBlueJPanel",codeBlueJPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_CodeBlue_JButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_JButton;
    private javax.swing.JButton CodeBlue_JButton;
    private javax.swing.JButton CodeRed_JButton;
    private javax.swing.JLabel LifeThreatning_JLabel;
    private javax.swing.JLabel Street_JLabel;
    private javax.swing.JTextField Street_JTextField;
    // End of variables declaration//GEN-END:variables
}
