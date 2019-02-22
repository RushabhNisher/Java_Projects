/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JOptionPane;
import Business.ProductDirectory;
import Business.Product;
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author info
 */
public class CreateProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAccontJPanel
     */
    private ProductDirectory prodDir;
    private JPanel rightPanel;
    public CreateProductJPanel(JPanel rightPanel, ProductDirectory prodDir) {
        initComponents();
        this.prodDir = prodDir;
        this.rightPanel=rightPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHead = new javax.swing.JLabel();
        ProductName1_JLabel = new javax.swing.JLabel();
        Availability1_JLabel = new javax.swing.JLabel();
        Price1_JLabel = new javax.swing.JLabel();
        Description1_JLabel = new javax.swing.JLabel();
        txtProdName = new javax.swing.JTextField();
        txtAvailablity = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        Back_JButton = new javax.swing.JButton();
        Availability_JLabel = new javax.swing.JLabel();
        Price_JLabel = new javax.swing.JLabel();
        ProductName_JLabel = new javax.swing.JLabel();
        Description_JLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));

        lblHead.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHead.setText("Create Product");

        ProductName1_JLabel.setText("Product Name*");

        Availability1_JLabel.setText("Availiblity*");

        Price1_JLabel.setText("Price*");

        Description1_JLabel.setText("Description");

        txtProdName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProdNameKeyTyped(evt);
            }
        });

        txtAvailablity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAvailablityKeyTyped(evt);
            }
        });

        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });

        txtDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescriptionKeyTyped(evt);
            }
        });

        btnCreate.setText("Create Product");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        Back_JButton.setText("Back");
        Back_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_JButtonActionPerformed(evt);
            }
        });

        Availability_JLabel.setBackground(new java.awt.Color(255, 51, 51));
        Availability_JLabel.setForeground(new java.awt.Color(102, 255, 204));

        Price_JLabel.setBackground(new java.awt.Color(255, 51, 51));
        Price_JLabel.setForeground(new java.awt.Color(102, 255, 204));

        ProductName_JLabel.setBackground(new java.awt.Color(255, 51, 51));
        ProductName_JLabel.setForeground(new java.awt.Color(102, 255, 204));

        Description_JLabel.setBackground(new java.awt.Color(255, 51, 51));
        Description_JLabel.setForeground(new java.awt.Color(102, 255, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(lblHead))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProductName1_JLabel)
                            .addComponent(Availability1_JLabel)
                            .addComponent(Price1_JLabel)
                            .addComponent(Description1_JLabel))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAvailablity, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(txtPrice)
                            .addComponent(txtDescription)
                            .addComponent(txtProdName))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Availability_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Price_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProductName_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Description_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Back_JButton)
                            .addComponent(btnCreate))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblHead)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ProductName1_JLabel)
                                .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ProductName_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Availability1_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAvailablity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Availability_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Price1_JLabel)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Price_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Description1_JLabel)
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Description_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreate)
                .addGap(31, 31, 31)
                .addComponent(Back_JButton)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
            
            try
            {  
            Double.parseDouble(txtPrice.getText());
            Integer.parseInt(txtAvailablity.getText());
            Product prod = prodDir.addProduct();
            prod.setName(txtProdName.getText());
            prod.setAvailNum(Integer.parseInt(txtAvailablity.getText()));
            prod.setPrice(Double.parseDouble(txtPrice.getText()));
            prod.setDescription(txtDescription.getText());
            if(txtProdName.getText().isEmpty()||txtAvailablity.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please add all the Values");
            }else{    
            JOptionPane.showMessageDialog(null, "Account Created Successfully");
            }
            txtProdName.setText("");
            txtPrice.setText("");
            txtAvailablity.setText("");
            txtDescription.setText("");
            }
           catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid values");
           }
            
                 
            
   
    }//GEN-LAST:event_btnCreateActionPerformed

    private void Back_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_JButtonActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_Back_JButtonActionPerformed

    private void txtAvailablityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAvailablityKeyTyped
        // TODO add your handling code here:
        try{
        int Availablity=Integer.parseInt(txtAvailablity.getText());   
        Availability_JLabel.setText("");
        }
        catch(Exception e){
        Availability_JLabel.setText("Please Add Correct Availability");
        }
    }//GEN-LAST:event_txtAvailablityKeyTyped

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        // TODO add your handling code here:
        try{
        double Price=Double.parseDouble(txtPrice.getText());      
        Price_JLabel.setText("");
        }  
        catch(Exception e){
              Price_JLabel.setText("Please Add Correct Price");
        }
    }//GEN-LAST:event_txtPriceKeyTyped

    private void txtProdNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdNameKeyTyped
        // TODO add your handling code here:
         if(txtProdName.getText().trim().isEmpty()){
        ProductName_JLabel.setText("Please add values");
        }
        String ProdName=txtProdName.getText();  
        ProductName_JLabel.setText("");

    }//GEN-LAST:event_txtProdNameKeyTyped

    private void txtDescriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionKeyTyped
        // TODO add your handling code here:
        if(txtDescription.getText().trim().isEmpty()){
        Description_JLabel.setText("Please add values");
        }
        String Description=txtDescription.getText();      
        Description_JLabel.setText("");

    }//GEN-LAST:event_txtDescriptionKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Availability1_JLabel;
    private javax.swing.JLabel Availability_JLabel;
    private javax.swing.JButton Back_JButton;
    private javax.swing.JLabel Description1_JLabel;
    private javax.swing.JLabel Description_JLabel;
    private javax.swing.JLabel Price1_JLabel;
    private javax.swing.JLabel Price_JLabel;
    private javax.swing.JLabel ProductName1_JLabel;
    private javax.swing.JLabel ProductName_JLabel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel lblHead;
    private javax.swing.JTextField txtAvailablity;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProdName;
    // End of variables declaration//GEN-END:variables
}
