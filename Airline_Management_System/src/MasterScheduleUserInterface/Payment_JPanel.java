/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterScheduleUserInterface;
import Business.Payment;
import Business.CustomerBooking;
import javax.swing.JOptionPane;
import Business.AirplaneCatalog;
import Business.Airplane;
import Business.Airliner;
import java.awt.CardLayout;
import javax.swing.JPanel;
import MasterScheduleUserInterface.PaymentViewJPanel;
import javax.swing.table.DefaultTableModel;
import Business.CustomerCatalog;
import Business.PaymentCatalog;

/**
 *
 * @author rusha
 */
public class Payment_JPanel extends javax.swing.JPanel {
private AirplaneCatalog airplanecatalog;
private JPanel Display_JPanel;
private Airplane airplane;
private Airliner airliner;
private CustomerBooking customerbooking;
private Payment payment;
private CustomerCatalog customercatalog;
private PaymentCatalog paymentcatalog;
    /**
     * Creates new form Payment_JPanel
     */
    public Payment_JPanel(JPanel Display_JPanel,PaymentCatalog paymentcatalog) {
        initComponents();
        this.Display_JPanel=Display_JPanel;
        this.airplane=airplane;
        this.payment=payment;
        this.paymentcatalog=paymentcatalog;
        
        refreshTable();
    }
    public void refreshTable(){
        int rowCount=BookingView_JTable.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)BookingView_JTable.getModel();
        for(int i=rowCount-1;i>=0;i--){
        dtm.removeRow(i);
        }
        for(Payment payment : paymentcatalog.getPaymentCatalog()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=payment;
            dtm.addRow(row);
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

        JScrollPane = new javax.swing.JScrollPane();
        BookingView_JTable = new javax.swing.JTable();
        PaymentDetails_JLabel = new javax.swing.JLabel();
        ViewDetails_JButton = new javax.swing.JButton();
        Next_JButton = new javax.swing.JButton();
        CardNumber_JTextField = new javax.swing.JTextField();
        GoodThrough_JLabel1 = new javax.swing.JLabel();
        CVV_JTextField = new javax.swing.JTextField();
        CVV_JLabel = new javax.swing.JLabel();
        NameOnCard_JLabel = new javax.swing.JLabel();
        NameOnCard_JTextField = new javax.swing.JTextField();
        GoodThrough_JTextField = new javax.swing.JTextField();
        CardNumber_JLabel = new javax.swing.JLabel();
        Save_JButton = new javax.swing.JButton();

        BookingView_JTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BookingView_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name ", "SSN", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BookingView_JTable.getTableHeader().setReorderingAllowed(false);
        JScrollPane.setViewportView(BookingView_JTable);

        PaymentDetails_JLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PaymentDetails_JLabel.setText("Payment Details");

        ViewDetails_JButton.setText("View Entered Details");
        ViewDetails_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetails_JButtonActionPerformed(evt);
            }
        });

        Next_JButton.setText("Next");
        Next_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_JButtonActionPerformed(evt);
            }
        });

        CardNumber_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardNumber_JTextFieldActionPerformed(evt);
            }
        });

        GoodThrough_JLabel1.setText("Good Through");

        CVV_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CVV_JTextFieldActionPerformed(evt);
            }
        });

        CVV_JLabel.setText("CVV");

        NameOnCard_JLabel.setText(" Name on Card");

        NameOnCard_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameOnCard_JTextFieldActionPerformed(evt);
            }
        });

        GoodThrough_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoodThrough_JTextFieldActionPerformed(evt);
            }
        });

        CardNumber_JLabel.setText("Card Number");

        Save_JButton.setText("Save");
        Save_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(PaymentDetails_JLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CVV_JLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CVV_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(CardNumber_JLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CardNumber_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(NameOnCard_JLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(NameOnCard_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(GoodThrough_JLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(GoodThrough_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(ViewDetails_JButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(Save_JButton)
                        .addGap(32, 32, 32)
                        .addComponent(Next_JButton)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(PaymentDetails_JLabel)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewDetails_JButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameOnCard_JLabel)
                    .addComponent(NameOnCard_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CardNumber_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CardNumber_JLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GoodThrough_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoodThrough_JLabel1))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CVV_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CVV_JLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save_JButton)
                    .addComponent(Next_JButton))
                .addContainerGap(118, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ViewDetails_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetails_JButtonActionPerformed
        // TODO add your handling code here:
        int SelectedRow=BookingView_JTable.getSelectedRow();       
        if(SelectedRow>=0){
            CustomerCatalog customercatalog=(CustomerCatalog)BookingView_JTable.getValueAt(SelectedRow,0);
            //Airplane airplane=(Airplane)BookingView_JTable.getValueAt(SelectedRow, 0);
            PaymentViewJPanel pvPanel=new PaymentViewJPanel(Display_JPanel,customercatalog);
            Display_JPanel.add("PaymentViewJPanel",pvPanel);
            CardLayout layout=(CardLayout) Display_JPanel.getLayout();
            layout.next(Display_JPanel);}
        else{
            JOptionPane.showMessageDialog(null,"Please Select a Row!");
        }
    }//GEN-LAST:event_ViewDetails_JButtonActionPerformed

    private void CardNumber_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardNumber_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CardNumber_JTextFieldActionPerformed

    private void CVV_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CVV_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CVV_JTextFieldActionPerformed

    private void NameOnCard_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameOnCard_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameOnCard_JTextFieldActionPerformed

    private void GoodThrough_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoodThrough_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GoodThrough_JTextFieldActionPerformed

    private void Save_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_JButtonActionPerformed
        // TODO add your handling code here:
        //CustomerBooking customerbooking=airliner.getAirplanecatalog().addAirplane();
        payment.setNameOnCard(NameOnCard_JTextField.getText());
        payment.setCardNumber(Integer.parseInt(CardNumber_JTextField.getText()));
        payment.setCVV(Integer.parseInt(CVV_JTextField.getText()));
        payment.setGoodThrough(GoodThrough_JTextField.getText());
    }//GEN-LAST:event_Save_JButtonActionPerformed

    private void Next_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_JButtonActionPerformed
        // TODO add your handling code here:

            JOptionPane.showMessageDialog(null,"Booking Made");
    }//GEN-LAST:event_Next_JButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BookingView_JTable;
    private javax.swing.JLabel CVV_JLabel;
    private javax.swing.JTextField CVV_JTextField;
    private javax.swing.JLabel CardNumber_JLabel;
    private javax.swing.JTextField CardNumber_JTextField;
    private javax.swing.JLabel GoodThrough_JLabel1;
    private javax.swing.JTextField GoodThrough_JTextField;
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JLabel NameOnCard_JLabel;
    private javax.swing.JTextField NameOnCard_JTextField;
    private javax.swing.JButton Next_JButton;
    private javax.swing.JLabel PaymentDetails_JLabel;
    private javax.swing.JButton Save_JButton;
    private javax.swing.JButton ViewDetails_JButton;
    // End of variables declaration//GEN-END:variables
}
