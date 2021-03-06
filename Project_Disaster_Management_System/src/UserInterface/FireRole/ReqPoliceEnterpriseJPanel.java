package UserInterface.FireRole;

import Business.Boston.Boston;
import Business.Disaster;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.PoliceEnterprise;
import Business.Enterprise.FireEnterprise;
import Business.Organisation.PoliceOrganisation;
import Business.Organisation.Organisation;
import Business.Organisation.FireOrganisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FireToPoliceRequest;
import UserInterface.FireRole.FireWorkAreaJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ReqPoliceEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private PoliceOrganisation policeOrganisation;
    private FireOrganisation fireOrganisation;
    private UserAccount userAccount;
    private EnterpriseDirectory entdir;
    private Disaster disaster;
    
    public ReqPoliceEnterpriseJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, FireOrganisation fireOrganisation, EnterpriseDirectory enterdir,Disaster disaster) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.fireOrganisation=fireOrganisation;
        this.userAccount=account;
        this.entdir=enterdir;
        this.disaster=disaster;
        Value_JLabel.setText(enterprise.getName());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Enterprise_JLabel = new javax.swing.JLabel();
        Value_JLabel = new javax.swing.JLabel();
        Back_JButton = new javax.swing.JButton();
        RequestAvailability_TestJButton = new javax.swing.JButton();
        Availability_JLabel = new javax.swing.JLabel();
        Availability_JTextField = new javax.swing.JTextField();
        Reset_JButton = new javax.swing.JButton();

        Enterprise_JLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Enterprise_JLabel.setText("EnterPrise :");

        Value_JLabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Value_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Value_JLabel.setText("<value>");

        Back_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back_JButton.setText("<<Back");
        Back_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_JButtonActionPerformed(evt);
            }
        });

        RequestAvailability_TestJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RequestAvailability_TestJButton.setText("Request Availabilty >>");
        RequestAvailability_TestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestAvailability_TestJButtonActionPerformed(evt);
            }
        });

        Availability_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Availability_JLabel.setText("Availabilty of Hospital Organisation");

        Availability_JTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Availability_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Availability_JTextFieldActionPerformed(evt);
            }
        });

        Reset_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Reset_JButton.setText("Reset");
        Reset_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_JButtonActionPerformed(evt);
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
                        .addComponent(Back_JButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Reset_JButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Availability_JLabel)
                            .addComponent(Enterprise_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RequestAvailability_TestJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Availability_JTextField)
                            .addComponent(Value_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 470, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back_JButton)
                    .addComponent(Reset_JButton))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enterprise_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Value_JLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Availability_JLabel)
                    .addComponent(Availability_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(RequestAvailability_TestJButton)
                .addContainerGap(464, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Back_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_JButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component[] componentArray = userProcessContainer.getComponents();
        for(Component c:componentArray){

            if(c instanceof  FireWorkAreaJPanel ){
                FireWorkAreaJPanel pthw = (FireWorkAreaJPanel) c;
                pthw. populateFireRehabRequestTable();
                pthw.populateRequestInfoTable();
                pthw.populateFiretoHospitalTable();
                pthw.populateFiretoPoliceTable();

            }
        }
    }//GEN-LAST:event_Back_JButtonActionPerformed

    private void RequestAvailability_TestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestAvailability_TestJButtonActionPerformed
        String message = Availability_JTextField.getText();
        FireToPoliceRequest request = new FireToPoliceRequest();
        request.setMessage(message);
        request.setSender(userAccount);
        request.setStatus("Sent");
        Organisation org = null;
        for (Organisation organisation : enterprise.getOrganisationDirectory().getOrganisationList()){
            if (organisation instanceof FireOrganisation){
                org = organisation;
                break;
            }
        }
        if (org!=null){
            fireOrganisation.getFtppqueue().add(request);
            //org.getWorkQueue().getWorkRequestList().add(request);
            for(Boston net:disaster.getNetworkList() ){
                for(Enterprise enter:net.getEnterpriseDirectory().getEnterpriseList()){

                    if(enter instanceof PoliceEnterprise){

                        for(Organisation or:enter.getOrganisationDirectory().getOrganisationList()){
                            if (or instanceof PoliceOrganisation){
                                policeOrganisation=(PoliceOrganisation) or;
                                policeOrganisation.getFtpqueue().add(request);
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_RequestAvailability_TestJButtonActionPerformed

    private void Availability_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Availability_JTextFieldActionPerformed
    }//GEN-LAST:event_Availability_JTextFieldActionPerformed

    private void Reset_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_JButtonActionPerformed
        Availability_JTextField.setText("");
    }//GEN-LAST:event_Reset_JButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Availability_JLabel;
    private javax.swing.JTextField Availability_JTextField;
    private javax.swing.JButton Back_JButton;
    private javax.swing.JLabel Enterprise_JLabel;
    private javax.swing.JButton RequestAvailability_TestJButton;
    private javax.swing.JButton Reset_JButton;
    private javax.swing.JLabel Value_JLabel;
    // End of variables declaration//GEN-END:variables
}
