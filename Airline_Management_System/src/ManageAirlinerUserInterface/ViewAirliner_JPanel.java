/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageAirlinerUserInterface;
import javax.swing.JOptionPane;
import Business.AirlinerCatalog;
import Business.Airliner;
import Business.Airplane;
import Business.AirplaneCatalog;
import ManageAirplaneUserInterface.ViewAirplane_JPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author rusha
 */
public class ViewAirliner_JPanel extends javax.swing.JPanel {
private AirlinerCatalog airlinercatalog;
private JPanel Display_JPanel;
private Airliner airliner;
private AirplaneCatalog airplanecatalog;
    /**
     * Creates new form ViewAirliner_JPanel
     */
    public ViewAirliner_JPanel(JPanel Display_JPanel,Airliner airliner) {
        initComponents();
        this.airliner=airliner;
        this.airlinercatalog=airlinercatalog;
        this.Display_JPanel=Display_JPanel;
        AirlinerName_JTextField.setText(airliner.getAirlinerName());
     
        refreshTable();
    }
        public void refreshTable(){
        int rowCount=View_JTable.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)View_JTable.getModel();
        //dtm.setRowCount(0);
        for(int i=rowCount-1;i>=0;i--){
        dtm.removeRow(i);
        }
        
        for(Airplane airplane : airliner.getAirplanecatalog().getAirplaneCatalog()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=airplane;
            row[1]=airplane.getPrice();
            row[2]=airplane.getPlaneID();
            dtm.addRow(row);
        }
    }
    private ViewAirliner_JPanel(JPanel Display_JPanel, Airplane airplane, AirplaneCatalog airplanecatalog) {
        initComponents();
        this.airliner=airliner;
        this.airplanecatalog=airplanecatalog;
        this.Display_JPanel=Display_JPanel;
        populate();
    }
        public void populate(){
        DefaultTableModel dtm = (DefaultTableModel)View_JTable.getModel();
        dtm.setRowCount(0);
        
        for(Airplane a : airplanecatalog.getAirplaneCatalog()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=a;
            row[1]=a.getPrice();
            row[2]=a.getPlaneID();
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

        AirlinerName_JTextField = new javax.swing.JTextField();
        ViewAirliner_JLabel = new javax.swing.JLabel();
        AirlinerName_JLabel = new javax.swing.JLabel();
        Save_JButton = new javax.swing.JButton();
        Back_JButton = new javax.swing.JButton();
        Update_JButton = new javax.swing.JButton();
        JScrollPane = new javax.swing.JScrollPane();
        View_JTable = new javax.swing.JTable();
        ViewDetails_JButton = new javax.swing.JButton();

        AirlinerName_JTextField.setEditable(false);
        AirlinerName_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlinerName_JTextFieldActionPerformed(evt);
            }
        });

        ViewAirliner_JLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ViewAirliner_JLabel.setText("View Airliner");

        AirlinerName_JLabel.setText("Airliner Name:");

        Save_JButton.setText("Save");
        Save_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_JButtonActionPerformed(evt);
            }
        });

        Back_JButton.setText("Back");
        Back_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_JButtonActionPerformed(evt);
            }
        });

        Update_JButton.setText("Update");
        Update_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_JButtonActionPerformed(evt);
            }
        });

        View_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner Name ", "Price", "From", "To"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        View_JTable.getTableHeader().setReorderingAllowed(false);
        JScrollPane.setViewportView(View_JTable);

        ViewDetails_JButton.setText("ViewDetails");
        ViewDetails_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetails_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(ViewAirliner_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(AirlinerName_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Save_JButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Update_JButton))
                            .addComponent(AirlinerName_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(Back_JButton)
                        .addGap(123, 123, 123)
                        .addComponent(ViewDetails_JButton)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ViewAirliner_JLabel)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AirlinerName_JLabel)
                            .addComponent(AirlinerName_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Save_JButton)
                            .addComponent(Update_JButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewDetails_JButton)
                    .addComponent(Back_JButton))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AirlinerName_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AirlinerName_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AirlinerName_JTextFieldActionPerformed

    private void Save_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_JButtonActionPerformed
        // TODO add your handling code here:

        AirlinerName_JTextField.setEditable(false);
        Save_JButton.setEnabled(false);
        Update_JButton.setEnabled(true);

        try{
            airliner.setAirlinerName(AirlinerName_JTextField.getText());
             if(AirlinerName_JTextField.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please add all the Values");
            }
            else{
                JOptionPane.showMessageDialog(null, "Airliner Created Successfully");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid values");
        }
    }//GEN-LAST:event_Save_JButtonActionPerformed

    private void Back_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_JButtonActionPerformed
        // TODO add your handling code here:
        Display_JPanel.remove(this);
        CardLayout layout=(CardLayout)Display_JPanel.getLayout();
        layout.previous(Display_JPanel);

    }//GEN-LAST:event_Back_JButtonActionPerformed

    private void Update_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_JButtonActionPerformed
        // TODO add your handling code here:
        AirlinerName_JTextField.setEditable(true);
        Save_JButton.setEnabled(true);
        Update_JButton.setEnabled(false);

    }//GEN-LAST:event_Update_JButtonActionPerformed

    private void ViewDetails_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetails_JButtonActionPerformed
        // TODO add your handling code here:
        int SelectedRow=View_JTable.getSelectedRow();

        if(SelectedRow>=0){
            Airplane airplane=(Airplane)View_JTable.getValueAt(SelectedRow, 0);
            ViewAirplane_JPanel vPanel=new ViewAirplane_JPanel(Display_JPanel,airplane);
            Display_JPanel.add("ViewPanel",vPanel);
            CardLayout layout=(CardLayout) Display_JPanel.getLayout();
            layout.next(Display_JPanel);}
        else{
            JOptionPane.showMessageDialog(null,"Please Select a Row!");
        }
    }//GEN-LAST:event_ViewDetails_JButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AirlinerName_JLabel;
    private javax.swing.JTextField AirlinerName_JTextField;
    private javax.swing.JButton Back_JButton;
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JButton Save_JButton;
    private javax.swing.JButton Update_JButton;
    private javax.swing.JLabel ViewAirliner_JLabel;
    private javax.swing.JButton ViewDetails_JButton;
    private javax.swing.JTable View_JTable;
    // End of variables declaration//GEN-END:variables
}
