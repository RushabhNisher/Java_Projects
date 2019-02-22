/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageAirlinerUserInterface;
import Business.Airliner;
import Business.AirlinerCatalog;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author rusha
 */
public class ManageViewAirliner_JPanel extends javax.swing.JPanel {
private AirlinerCatalog airlinercatalog;
private JPanel Display_JPanel;
    /**
     * Creates new form ManageViewAirliner_JPanel
     */
    public ManageViewAirliner_JPanel(JPanel Display_JPanel, AirlinerCatalog airlinercatalog) {
        initComponents();
        this.Display_JPanel=Display_JPanel;
        this.airlinercatalog=airlinercatalog;
        refreshTable();
    }

    public void refreshTable(){
        int rowCount=AirlinerView_JTable.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)AirlinerView_JTable.getModel();
        //dtm.setRowCount(0);
        for(int i=rowCount-1;i>=0;i--){
        dtm.removeRow(i);
        }
        
        for(Airliner airliner : airlinercatalog.getAirlinerCatalog()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=airliner;
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

        SearchAirliner_JTextfield = new javax.swing.JTextField();
        Search_JLabel = new javax.swing.JLabel();
        JScrollPane = new javax.swing.JScrollPane();
        AirlinerView_JTable = new javax.swing.JTable();
        ManageViewAirliner_JLabel = new javax.swing.JLabel();
        ViewAirlinerDetails_JButton = new javax.swing.JButton();
        DeleteAirliner_JButton = new javax.swing.JButton();
        Back_JButton = new javax.swing.JButton();

        SearchAirliner_JTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SearchAirliner_JTextfieldKeyTyped(evt);
            }
        });

        Search_JLabel.setText("Search Keyword");

        AirlinerView_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner Name "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JScrollPane.setViewportView(AirlinerView_JTable);

        ManageViewAirliner_JLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ManageViewAirliner_JLabel.setText("Manage/View Airliner");

        ViewAirlinerDetails_JButton.setText("ViewDetails");
        ViewAirlinerDetails_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAirlinerDetails_JButtonActionPerformed(evt);
            }
        });

        DeleteAirliner_JButton.setText("Delete Airliner");
        DeleteAirliner_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAirliner_JButtonActionPerformed(evt);
            }
        });

        Back_JButton.setText("Back");
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
                        .addGap(226, 226, 226)
                        .addComponent(ManageViewAirliner_JLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Back_JButton)
                                .addGap(114, 114, 114)
                                .addComponent(ViewAirlinerDetails_JButton))
                            .addComponent(DeleteAirliner_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(Search_JLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(SearchAirliner_JTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(ManageViewAirliner_JLabel)
                .addGap(18, 18, 18)
                .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search_JLabel)
                    .addComponent(SearchAirliner_JTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteAirliner_JButton)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back_JButton)
                    .addComponent(ViewAirlinerDetails_JButton))
                .addContainerGap(182, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchAirliner_JTextfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchAirliner_JTextfieldKeyTyped
        // TODO add your handling code here:
        DefaultTableModel SearchTableOutput = (DefaultTableModel)AirlinerView_JTable.getModel();

        String search=SearchAirliner_JTextfield.getText();
        TableRowSorter<DefaultTableModel> SearchTableSort = new TableRowSorter<DefaultTableModel>(SearchTableOutput);
        AirlinerView_JTable.setRowSorter(SearchTableSort);
        SearchTableSort.setRowFilter(RowFilter.regexFilter(search));

        /*SearchTableOutput.setRowCount(0);
        for(Product a:prodDir.getProductDirectory()){
            if(searchTextfield.getText().equals(a.getName())){
                Object[] row = new Object[SearchTableOutput.getColumnCount()];
                row[0]=a;
                row[1]=a.getAvailNum();
                row[2]=a.getPrice();
                SearchTableOutput.addRow(row);
            }
        }*/
    }//GEN-LAST:event_SearchAirliner_JTextfieldKeyTyped

    private void ViewAirlinerDetails_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAirlinerDetails_JButtonActionPerformed
        // TODO add your handling code here:
        int SelectedRow=AirlinerView_JTable.getSelectedRow();

        if(SelectedRow>=0){
            Airliner airliner=(Airliner)AirlinerView_JTable.getValueAt(SelectedRow, 0);
            ViewAirliner_JPanel viewairlinerPanel=new ViewAirliner_JPanel(Display_JPanel,airliner);
            Display_JPanel.add("ViewAirlinerPanel",viewairlinerPanel);
            CardLayout layout=(CardLayout) Display_JPanel.getLayout();
            layout.next(Display_JPanel);}
        else{
            JOptionPane.showMessageDialog(null,"Please Select a Row!");
        }
    }//GEN-LAST:event_ViewAirlinerDetails_JButtonActionPerformed

    private void DeleteAirliner_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAirliner_JButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = AirlinerView_JTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Airliner airliner = (Airliner)AirlinerView_JTable.getValueAt(selectedRow, 0);
                airlinercatalog.removeAirliner(airliner);
                refreshTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_DeleteAirliner_JButtonActionPerformed

    private void Back_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_JButtonActionPerformed
        // TODO add your handling code here:
        Display_JPanel.remove(this);
        CardLayout cardLayout=(CardLayout)Display_JPanel.getLayout();
        cardLayout.previous(Display_JPanel);
    }//GEN-LAST:event_Back_JButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AirlinerView_JTable;
    private javax.swing.JButton Back_JButton;
    private javax.swing.JButton DeleteAirliner_JButton;
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JLabel ManageViewAirliner_JLabel;
    private javax.swing.JTextField SearchAirliner_JTextfield;
    private javax.swing.JLabel Search_JLabel;
    private javax.swing.JButton ViewAirlinerDetails_JButton;
    // End of variables declaration//GEN-END:variables
}
