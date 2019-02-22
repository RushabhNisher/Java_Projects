/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Profile.DriversLicense;
import Profile.Person;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Image;




/**
 *
 * @author rusha
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    private Person person;
    public CreateJPanel(Person person) {
        initComponents();
        this.person=person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        CreateTitle_JLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        DemographicTitle_JLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        FirstName_JLabel = new javax.swing.JLabel();
        FirstName_JTextField = new javax.swing.JTextField();
        LastName_JLabel = new javax.swing.JLabel();
        LastName_JTextField = new javax.swing.JTextField();
        PhoneNumber_JLabel = new javax.swing.JLabel();
        PhoneNumber_JTextField = new javax.swing.JTextField();
        SocialSecurityNumber_JLabel = new javax.swing.JLabel();
        SocialSecurityNumber_JTextField = new javax.swing.JTextField();
        DateOfBirth_MMDDYYYY_JLabel = new javax.swing.JLabel();
        DateOfBirth_JLabel = new javax.swing.JLabel();
        DateOfBirth_JTextField = new javax.swing.JTextField();
        Height_JLabel = new javax.swing.JLabel();
        Height_JTextField = new javax.swing.JTextField();
        Weight_JLabel = new javax.swing.JLabel();
        Weight_JTextField = new javax.swing.JTextField();
        Age_JLabel = new javax.swing.JLabel();
        Age_JTextField = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        AddressTitle_JLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        StreetAddress_JLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        StreetAddress_JTextField = new javax.swing.JTextArea();
        City_JLabel = new javax.swing.JLabel();
        City_JTextField = new javax.swing.JTextField();
        State_JLabel = new javax.swing.JLabel();
        State_JTextField = new javax.swing.JTextField();
        Zipcode_JLabel = new javax.swing.JLabel();
        Zipcode_JTextField = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        BankTitle_JLabel = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        BankName_JLabel = new javax.swing.JLabel();
        BankName_JTextField = new javax.swing.JTextField();
        BankRoutingNumber_JLabel = new javax.swing.JLabel();
        BankRoutingNumber_JTextField = new javax.swing.JTextField();
        AccountType_JLabel1 = new javax.swing.JLabel();
        AccountType_JTextField = new javax.swing.JTextField();
        AccountTypeS_JLabel = new javax.swing.JLabel();
        AccountTypeSavings_JLabel = new javax.swing.JLabel();
        SavingsAccountNumber_JLabel = new javax.swing.JLabel();
        SavingsAccountNumber_JTextField = new javax.swing.JTextField();
        SavingsAccountBalance_JLabel = new javax.swing.JLabel();
        SavingsAccountBalance_JTextField = new javax.swing.JTextField();
        AccountTypeC_JLabel = new javax.swing.JLabel();
        AccountTypeChecking_JLabel = new javax.swing.JLabel();
        CheckingAccountNumber_JLabel = new javax.swing.JLabel();
        CheckingAccountNumber_JTextField = new javax.swing.JTextField();
        CheckingAccountBalance_JLabel = new javax.swing.JLabel();
        CheckingAccountBalance_JTextField = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        DriversLicenseTitle_JLabel = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        LicenseNumber_JLabel = new javax.swing.JLabel();
        LicenseNumber_JTextField = new javax.swing.JTextField();
        DateOfIssue_MMDDYYYY_JLabel = new javax.swing.JLabel();
        DateOfIssue_JLabel = new javax.swing.JLabel();
        DateOfIssue_JTextField = new javax.swing.JTextField();
        BloodType_JLabel = new javax.swing.JLabel();
        BloodType_JTextField = new javax.swing.JTextField();
        DateOfExpiration_JLabel = new javax.swing.JLabel();
        DateOfExpiration_JTextField = new javax.swing.JTextField();
        ImageUpload_JButton = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        MedicalRecordNumberTitle_JLabel = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        MedicalRecordNumber_JLabel = new javax.swing.JLabel();
        MedicalRecordNumber_JTextField = new javax.swing.JTextField();
        Allergy1_JLabel = new javax.swing.JLabel();
        Allergy1_JTextField = new javax.swing.JTextField();
        Allergy2_JLabel = new javax.swing.JLabel();
        Allergy2_JTextField = new javax.swing.JTextField();
        Allergy3_JLabel = new javax.swing.JLabel();
        Allergy3_JTextField = new javax.swing.JTextField();
        Submit_JButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        ImageUpload_JLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(207, 235, 235));
        setPreferredSize(new java.awt.Dimension(670, 900));

        jScrollPane1.setBackground(new java.awt.Color(216, 240, 232));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(670, 900));

        jPanel2.setBackground(new java.awt.Color(207, 235, 235));
        jPanel2.setPreferredSize(new java.awt.Dimension(670, 900));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CreateTitle_JLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        CreateTitle_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CreateTitle_JLabel.setText("Create your Profile");
        jPanel2.add(CreateTitle_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 642, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 719, -1));

        DemographicTitle_JLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DemographicTitle_JLabel.setText("Demographic:");
        jPanel2.add(DemographicTitle_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 38, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 696, -1));

        FirstName_JLabel.setText("First Name:");
        jPanel2.add(FirstName_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, -1, 20));
        jPanel2.add(FirstName_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 64, 102, -1));

        LastName_JLabel.setText("Last Name:");
        jPanel2.add(LastName_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 64, -1, 20));
        jPanel2.add(LastName_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 64, 100, -1));

        PhoneNumber_JLabel.setText("Phone Number:");
        jPanel2.add(PhoneNumber_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));
        jPanel2.add(PhoneNumber_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 110, 102, -1));

        SocialSecurityNumber_JLabel.setText("SSN:");
        jPanel2.add(SocialSecurityNumber_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 108, -1, 25));
        jPanel2.add(SocialSecurityNumber_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 110, 100, -1));

        DateOfBirth_MMDDYYYY_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DateOfBirth_MMDDYYYY_JLabel.setText("MM/DD/YYYY");
        jPanel2.add(DateOfBirth_MMDDYYYY_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 99, 100, -1));

        DateOfBirth_JLabel.setText("Date of Birth:");
        jPanel2.add(DateOfBirth_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 119, -1, 20));

        DateOfBirth_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateOfBirth_JTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(DateOfBirth_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 119, 100, -1));

        Height_JLabel.setText("Height:");
        jPanel2.add(Height_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 20));
        jPanel2.add(Height_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 150, 102, -1));

        Weight_JLabel.setText("Weight:");
        jPanel2.add(Weight_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 150, -1, 20));
        jPanel2.add(Weight_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 150, 100, -1));

        Age_JLabel.setText("Age:");
        jPanel2.add(Age_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 150, -1, 20));

        Age_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Age_JTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(Age_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 150, 50, -1));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 185, 719, -1));

        AddressTitle_JLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddressTitle_JLabel.setText("Address:");
        jPanel2.add(AddressTitle_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 187, -1, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 202, 719, -1));

        StreetAddress_JLabel.setText("Street Address:");
        jPanel2.add(StreetAddress_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 219, -1, 20));

        StreetAddress_JTextField.setColumns(20);
        StreetAddress_JTextField.setRows(5);
        StreetAddress_JTextField.setWrapStyleWord(true);
        jScrollPane2.setViewportView(StreetAddress_JTextField);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 219, 100, 60));

        City_JLabel.setText("City:");
        jPanel2.add(City_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 219, -1, 20));
        jPanel2.add(City_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 219, 98, -1));

        State_JLabel.setText("State:");
        jPanel2.add(State_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 219, 36, 20));

        State_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                State_JTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(State_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 219, 100, -1));

        Zipcode_JLabel.setText("Zipcode:");
        jPanel2.add(Zipcode_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 257, -1, 20));
        jPanel2.add(Zipcode_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 257, 98, -1));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 292, 719, -1));

        BankTitle_JLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BankTitle_JLabel.setText("Bank:");
        jPanel2.add(BankTitle_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 321, 729, -1));

        BankName_JLabel.setText("Bank Name:");
        jPanel2.add(BankName_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 332, -1, -1));

        BankName_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankName_JTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(BankName_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 329, 98, -1));

        BankRoutingNumber_JLabel.setText("Routing Number:");
        jPanel2.add(BankRoutingNumber_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 332, -1, -1));

        BankRoutingNumber_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankRoutingNumber_JTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(BankRoutingNumber_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 329, 100, -1));

        AccountType_JLabel1.setText("Account Type:");
        jPanel2.add(AccountType_JLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 332, -1, -1));

        AccountType_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountType_JTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(AccountType_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 329, 89, -1));

        AccountTypeS_JLabel.setText("Account Type: ");
        jPanel2.add(AccountTypeS_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 366, -1, -1));

        AccountTypeSavings_JLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AccountTypeSavings_JLabel.setText("Savings");
        jPanel2.add(AccountTypeSavings_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 366, -1, -1));

        SavingsAccountNumber_JLabel.setText("A/C Number:");
        jPanel2.add(SavingsAccountNumber_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 389, -1, -1));
        jPanel2.add(SavingsAccountNumber_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 386, 98, -1));

        SavingsAccountBalance_JLabel.setText("Account Balance:");
        jPanel2.add(SavingsAccountBalance_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 389, -1, -1));
        jPanel2.add(SavingsAccountBalance_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 386, 99, -1));

        AccountTypeC_JLabel.setText("Account Type: ");
        jPanel2.add(AccountTypeC_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 417, -1, -1));

        AccountTypeChecking_JLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AccountTypeChecking_JLabel.setText("Checking");
        jPanel2.add(AccountTypeChecking_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 417, -1, -1));

        CheckingAccountNumber_JLabel.setText("A/C Number:");
        jPanel2.add(CheckingAccountNumber_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 440, -1, -1));
        jPanel2.add(CheckingAccountNumber_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 437, 98, -1));

        CheckingAccountBalance_JLabel.setText("Account Balance:");
        jPanel2.add(CheckingAccountBalance_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, -1, -1));

        CheckingAccountBalance_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckingAccountBalance_JTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(CheckingAccountBalance_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 437, 99, -1));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 472, 716, -1));

        DriversLicenseTitle_JLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DriversLicenseTitle_JLabel.setText("Driver's License:");
        jPanel2.add(DriversLicenseTitle_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 495, 706, -1));

        LicenseNumber_JLabel.setText("License Number:");
        jPanel2.add(LicenseNumber_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 542, -1, -1));
        jPanel2.add(LicenseNumber_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 539, 100, -1));

        DateOfIssue_MMDDYYYY_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DateOfIssue_MMDDYYYY_JLabel.setText("MM/DD/YYYY");
        jPanel2.add(DateOfIssue_MMDDYYYY_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 518, 99, -1));

        DateOfIssue_JLabel.setText("Date of Issue:");
        jPanel2.add(DateOfIssue_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 539, -1, 20));
        jPanel2.add(DateOfIssue_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 539, 99, -1));

        BloodType_JLabel.setText("Blood Group: ");
        jPanel2.add(BloodType_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 591, 79, -1));

        BloodType_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodType_JTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(BloodType_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 588, 100, -1));

        DateOfExpiration_JLabel.setText("Date of Expiration:");
        jPanel2.add(DateOfExpiration_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 591, -1, -1));
        jPanel2.add(DateOfExpiration_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 588, 99, -1));

        ImageUpload_JButton.setBackground(new java.awt.Color(207, 235, 235));
        ImageUpload_JButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ImageUpload_JButton.setText("Upload");
        ImageUpload_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImageUpload_JButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ImageUpload_JButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 538, -1, -1));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 623, 699, 1));

        MedicalRecordNumberTitle_JLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MedicalRecordNumberTitle_JLabel.setText("Medical Record Number:");
        jPanel2.add(MedicalRecordNumberTitle_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, -1));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 649, 699, -1));

        MedicalRecordNumber_JLabel.setText("Record Number:");
        jPanel2.add(MedicalRecordNumber_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 666, -1, -1));
        jPanel2.add(MedicalRecordNumber_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 663, 100, -1));

        Allergy1_JLabel.setText("Allergy 1:");
        jPanel2.add(Allergy1_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 701, -1, -1));
        jPanel2.add(Allergy1_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 698, 100, -1));

        Allergy2_JLabel.setText("Allergy 2:");
        jPanel2.add(Allergy2_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 698, -1, 20));
        jPanel2.add(Allergy2_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 698, 99, -1));

        Allergy3_JLabel.setText("Allergy 3:");
        jPanel2.add(Allergy3_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 698, -1, 20));

        Allergy3_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Allergy3_JTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(Allergy3_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 698, 101, -1));

        Submit_JButton.setBackground(new java.awt.Color(207, 235, 235));
        Submit_JButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Submit_JButton.setText("Submit!");
        Submit_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_JButtonActionPerformed(evt);
            }
        });
        jPanel2.add(Submit_JButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 730, 100, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 771, 664, -1));
        jPanel2.add(ImageUpload_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 500, 93, 100));

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Age_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Age_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Age_JTextFieldActionPerformed

    private void DateOfBirth_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateOfBirth_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateOfBirth_JTextFieldActionPerformed

    private void State_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_State_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_State_JTextFieldActionPerformed

    private void BankName_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankName_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BankName_JTextFieldActionPerformed

    private void BankRoutingNumber_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankRoutingNumber_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BankRoutingNumber_JTextFieldActionPerformed

    private void BloodType_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodType_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodType_JTextFieldActionPerformed

    private void Allergy3_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Allergy3_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Allergy3_JTextFieldActionPerformed

    private void AccountType_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountType_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountType_JTextFieldActionPerformed

    private void Submit_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_JButtonActionPerformed
        // TODO add your handling code here:
        //Demographic
        person.objDemographic.setFirstName(FirstName_JTextField.getText());
        person.objDemographic.setLastName(LastName_JTextField.getText());
        person.objDemographic.setDateOfBirth(DateOfBirth_JTextField.getText());
        person.objDemographic.setAge(Age_JTextField.getText());
        person.objDemographic.setHeight(Height_JTextField.getText());
        person.objDemographic.setWeight(Weight_JTextField.getText());
        person.objDemographic.setSocialSecurityNumber(SocialSecurityNumber_JTextField.getText());
        person.objDemographic.setPhoneNumber(PhoneNumber_JTextField.getText());
        //Address
        person.objAddress.setStreetAddress(StreetAddress_JTextField.getText());
        
        person.objAddress.setCity(City_JTextField.getText());
        person.objAddress.setState(State_JTextField.getText());
        person.objAddress.setZipcode(Zipcode_JTextField.getText());
        //Bank
        person.objBank.setBankName(BankName_JTextField.getText());
        person.objBank.setBankRoutingNumber(BankRoutingNumber_JTextField.getText());
        person.objBank.setAccountType(AccountType_JTextField.getText());
        //person.objBank.setComboAccountType(ComboAccountType_JComboBox.getText());
        person.objBank.setSavingsAccountNumber(SavingsAccountNumber_JTextField.getText());
        person.objBank.setSavingsAccountBalance(SavingsAccountBalance_JTextField.getText());
        person.objBank.setCheckingAccountNumber(CheckingAccountNumber_JTextField.getText());
        person.objBank.setCheckingAccountBalance(CheckingAccountBalance_JTextField.getText());
        //Driver's License
        person.objDriversLicense.setLicenseNumber(LicenseNumber_JTextField.getText());
        person.objDriversLicense.setDateOfIssue(DateOfIssue_JTextField.getText());
        person.objDriversLicense.setDateOfExpiration(DateOfExpiration_JTextField.getText());
        person.objDriversLicense.setBloodType(BloodType_JTextField.getText());
        //person.objDriversLicense.setImages(ImageUpload_JTextField.getText());

        //Medical Record
        person.objMedicalRecord.setMedicalRecordNumber(MedicalRecordNumber_JTextField.getText());
        person.objMedicalRecord.setAllergy1(Allergy1_JTextField.getText());
        person.objMedicalRecord.setAllergy2(Allergy2_JTextField.getText());
        person.objMedicalRecord.setAllergy3(Allergy3_JTextField.getText());
        JOptionPane.showMessageDialog(null,"Record Added Succesfully!");
    }//GEN-LAST:event_Submit_JButtonActionPerformed

    private void CheckingAccountBalance_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckingAccountBalance_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckingAccountBalance_JTextFieldActionPerformed

    private void ImageUpload_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImageUpload_JButtonActionPerformed
        // TODO add your handling code here:
        DriversLicense driverslicense=person.getObjDriversLicense();
        JFileChooser fileChooser=new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file=fileChooser.getSelectedFile();
        String path =file.getAbsolutePath();
        ImageIcon imageIcon=new ImageIcon(path);
        Image Images=imageIcon.getImage();
        Image newImages=Images.getScaledInstance(ImageUpload_JLabel.getWidth(),ImageUpload_JLabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon myImage=new ImageIcon(newImages);
        
       
        ImageUpload_JLabel.setIcon(myImage);
        driverslicense.setImages(myImage);
        person.setObjDriversLicense(driverslicense);
       // ImageIcon icon=new ImageIcon(path);
       // Image
        
    }//GEN-LAST:event_ImageUpload_JButtonActionPerformed
/***/


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountTypeC_JLabel;
    private javax.swing.JLabel AccountTypeChecking_JLabel;
    private javax.swing.JLabel AccountTypeS_JLabel;
    private javax.swing.JLabel AccountTypeSavings_JLabel;
    private javax.swing.JLabel AccountType_JLabel1;
    private javax.swing.JTextField AccountType_JTextField;
    private javax.swing.JLabel AddressTitle_JLabel;
    private javax.swing.JLabel Age_JLabel;
    private javax.swing.JTextField Age_JTextField;
    private javax.swing.JLabel Allergy1_JLabel;
    private javax.swing.JTextField Allergy1_JTextField;
    private javax.swing.JLabel Allergy2_JLabel;
    private javax.swing.JTextField Allergy2_JTextField;
    private javax.swing.JLabel Allergy3_JLabel;
    private javax.swing.JTextField Allergy3_JTextField;
    private javax.swing.JLabel BankName_JLabel;
    private javax.swing.JTextField BankName_JTextField;
    private javax.swing.JLabel BankRoutingNumber_JLabel;
    private javax.swing.JTextField BankRoutingNumber_JTextField;
    private javax.swing.JLabel BankTitle_JLabel;
    private javax.swing.JLabel BloodType_JLabel;
    private javax.swing.JTextField BloodType_JTextField;
    private javax.swing.JLabel CheckingAccountBalance_JLabel;
    private javax.swing.JTextField CheckingAccountBalance_JTextField;
    private javax.swing.JLabel CheckingAccountNumber_JLabel;
    private javax.swing.JTextField CheckingAccountNumber_JTextField;
    private javax.swing.JLabel City_JLabel;
    private javax.swing.JTextField City_JTextField;
    private javax.swing.JLabel CreateTitle_JLabel;
    private javax.swing.JLabel DateOfBirth_JLabel;
    private javax.swing.JTextField DateOfBirth_JTextField;
    private javax.swing.JLabel DateOfBirth_MMDDYYYY_JLabel;
    private javax.swing.JLabel DateOfExpiration_JLabel;
    private javax.swing.JTextField DateOfExpiration_JTextField;
    private javax.swing.JLabel DateOfIssue_JLabel;
    private javax.swing.JTextField DateOfIssue_JTextField;
    private javax.swing.JLabel DateOfIssue_MMDDYYYY_JLabel;
    private javax.swing.JLabel DemographicTitle_JLabel;
    private javax.swing.JLabel DriversLicenseTitle_JLabel;
    private javax.swing.JLabel FirstName_JLabel;
    private javax.swing.JTextField FirstName_JTextField;
    private javax.swing.JLabel Height_JLabel;
    private javax.swing.JTextField Height_JTextField;
    private javax.swing.JButton ImageUpload_JButton;
    private javax.swing.JLabel ImageUpload_JLabel;
    private javax.swing.JLabel LastName_JLabel;
    private javax.swing.JTextField LastName_JTextField;
    private javax.swing.JLabel LicenseNumber_JLabel;
    private javax.swing.JTextField LicenseNumber_JTextField;
    private javax.swing.JLabel MedicalRecordNumberTitle_JLabel;
    private javax.swing.JLabel MedicalRecordNumber_JLabel;
    private javax.swing.JTextField MedicalRecordNumber_JTextField;
    private javax.swing.JLabel PhoneNumber_JLabel;
    private javax.swing.JTextField PhoneNumber_JTextField;
    private javax.swing.JLabel SavingsAccountBalance_JLabel;
    private javax.swing.JTextField SavingsAccountBalance_JTextField;
    private javax.swing.JLabel SavingsAccountNumber_JLabel;
    private javax.swing.JTextField SavingsAccountNumber_JTextField;
    private javax.swing.JLabel SocialSecurityNumber_JLabel;
    private javax.swing.JTextField SocialSecurityNumber_JTextField;
    private javax.swing.JLabel State_JLabel;
    private javax.swing.JTextField State_JTextField;
    private javax.swing.JLabel StreetAddress_JLabel;
    private javax.swing.JTextArea StreetAddress_JTextField;
    private javax.swing.JButton Submit_JButton;
    private javax.swing.JLabel Weight_JLabel;
    private javax.swing.JTextField Weight_JTextField;
    private javax.swing.JLabel Zipcode_JLabel;
    private javax.swing.JTextField Zipcode_JTextField;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
