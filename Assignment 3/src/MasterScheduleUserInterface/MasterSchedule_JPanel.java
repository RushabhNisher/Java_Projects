/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterScheduleUserInterface;
import Business.Airliner;
import Business.Airplane;
import Business.AirplaneCatalog;
import Business.AirlinerCatalog;
import Business.CustomerBooking;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import Business.CustomerCatalog;
import Business.PaymentCatalog;
/**
 *
 * @author rusha
 */
public class MasterSchedule_JPanel extends javax.swing.JPanel {
private AirplaneCatalog airplanecatalog;
private Airplane airplane;
private AirlinerCatalog airlinercatalog;
private Airliner airliner;
private JPanel Display_JPanel;
private CustomerBooking customerbooking;
private CustomerCatalog customercatalog;

    /**
     * Creates new form MasterSchedule_JPanel
     */
    public MasterSchedule_JPanel(JPanel Display_JPanel, AirlinerCatalog airlinercatalog) {
        initComponents();
        this.Display_JPanel=Display_JPanel;
        this.airlinercatalog=airlinercatalog;
        this.airliner=new Airliner();
        this.airplane= new Airplane();
        refreshTable();
    }
        public void refreshTable(){
        int rowCount=MasterView_JTable.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)MasterView_JTable.getModel();
        //dtm.setRowCount(0);
        for(int i=rowCount-1;i>=0;i--){
        dtm.removeRow(i);
        }
       for(Airliner a:airlinercatalog.getAirlinerCatalog()){ 
        for(Airplane ai : a.getAirplanecatalog().getAirplaneCatalog()){
            
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=a.getAirlinerName();
            row[1]=ai;
            row[2]=ai.getFrom();
            row[3]=ai.getTo();
            row[4]=ai.getPrice();
            dtm.addRow(row);
        }
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

        ManageView_JLabel = new javax.swing.JLabel();
        JScrollPane = new javax.swing.JScrollPane();
        MasterView_JTable = new javax.swing.JTable();
        Search_JLabel = new javax.swing.JLabel();
        Search_JTextfield = new javax.swing.JTextField();
        ViewDetails_JButton = new javax.swing.JButton();
        Book_JButton = new javax.swing.JButton();

        ManageView_JLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ManageView_JLabel.setText("Master Schedule");

        MasterView_JTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MasterView_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner Name ", "Airplane Name", "From", "To", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MasterView_JTable.getTableHeader().setReorderingAllowed(false);
        JScrollPane.setViewportView(MasterView_JTable);

        Search_JLabel.setText("Search Keyword");

        Search_JTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Search_JTextfieldKeyTyped(evt);
            }
        });

        ViewDetails_JButton.setText("ViewDetails");
        ViewDetails_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetails_JButtonActionPerformed(evt);
            }
        });

        Book_JButton.setText("Book");
        Book_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ManageView_JLabel)
                        .addGap(251, 251, 251))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ViewDetails_JButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Search_JLabel)
                                .addGap(37, 37, 37)
                                .addComponent(Search_JTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(62, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(Book_JButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(ManageView_JLabel)
                .addGap(34, 34, 34)
                .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewDetails_JButton)
                    .addComponent(Search_JLabel)
                    .addComponent(Search_JTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(Book_JButton)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Search_JTextfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_JTextfieldKeyTyped
        // TODO add your handling code here:
        DefaultTableModel SearchTableOutput = (DefaultTableModel)MasterView_JTable.getModel();

        String search=Search_JTextfield.getText();
        TableRowSorter<DefaultTableModel> SearchTableSort = new TableRowSorter<DefaultTableModel>(SearchTableOutput);
        MasterView_JTable.setRowSorter(SearchTableSort);
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
    }//GEN-LAST:event_Search_JTextfieldKeyTyped

    private void ViewDetails_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetails_JButtonActionPerformed
        // TODO add your handling code here:
        
        int SelectedRow=MasterView_JTable.getSelectedRow();
        
        //int SelectedCol=MasterView_JTable.getSelectedColumn();
        if(SelectedRow>=0){
        //String airlinern=(String)MasterView_JTable.getValueAt(SelectedRow,0);
        //Airliner airliner=(Airliner)MasterView_JTable.getValueAt(SelectedRow,0);
            //int rowCount = MasterView_JTable.getRowCount(), i;
        //Airplane airplane=(Airplane)MasterView_JTable.getValueAt(SelectedRow, 0);
            
      //  AirlinerName_JTextField.setText((String)MasterView_JTable.getValueAt(SelectedRow, 0));
      String air=(String)MasterView_JTable.getValueAt(SelectedRow, 0);
        Airplane airplane=(Airplane)MasterView_JTable.getValueAt(SelectedRow, 1);
        MasterScheduleView_JPanel msvPanel=new MasterScheduleView_JPanel(Display_JPanel,airplane,air);
            Display_JPanel.add("MasterScheduleViewPanel",msvPanel);
           CardLayout layout=(CardLayout) Display_JPanel.getLayout();
           layout.next(Display_JPanel);
        
           /* AirlinerName_JTextField.setText(airliner.getAirlinerName());

            PlaneName_JTextField.setText(airplane.getPlaneName());
            Price_JTextField.setText(String.valueOf(airplane.getPrice()));
            Seats_JTextField.setText(String.valueOf(airplane.getSeats()));
            ID_JTextField.setText(String.valueOf(airplane.getPlaneID()));
            Description_JTextField.setText(airplane.getDescription());
            From_JTextField.setText(airplane.getFrom());
            To_JTextField.setText(airplane.getTo());
            
            
            */
        }
        else{
            JOptionPane.showMessageDialog(null,"Please Select a Row!");
        }
    }//GEN-LAST:event_ViewDetails_JButtonActionPerformed

    private void Book_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_JButtonActionPerformed
        // TODO add your handling code here:
           // CustomerBooking customerbooking=CustomerBooking;
            BookingForm_JPanel bookingformjpanel=new BookingForm_JPanel(Display_JPanel,customercatalog);
            Display_JPanel.add("BookingForm_JPanel",bookingformjpanel);
            CardLayout layout=(CardLayout) Display_JPanel.getLayout();
            layout.next(Display_JPanel);
    }//GEN-LAST:event_Book_JButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Book_JButton;
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JLabel ManageView_JLabel;
    private javax.swing.JTable MasterView_JTable;
    private javax.swing.JLabel Search_JLabel;
    private javax.swing.JTextField Search_JTextfield;
    private javax.swing.JButton ViewDetails_JButton;
    // End of variables declaration//GEN-END:variables
}
