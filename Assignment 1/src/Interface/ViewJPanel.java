/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
/**import Profile.Address;
import Profile.Bank;
import Profile.Demographic;
import Profile.DriversLicense;
import Profile.MedicalRecord;*/
import Profile.Person;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author rusha
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */

    private Person person;
    public ViewJPanel(Person person) {
        initComponents();
        displayPerson(person);
    }
    private void displayPerson(Person person)
    {

        //Demographic
        String personFirstName=person.objDemographic.getFirstName();
        FirstName_JTextField.setText(personFirstName);
        String personLastName=person.objDemographic.getLastName();
        LastName_JTextField.setText(personLastName);
        String personDateOfBirth=person.objDemographic.getDateOfBirth();
        DateOfBirth_JTextField.setText(personDateOfBirth);
        String personAge=person.objDemographic.getAge();
        Age_JTextField.setText(personAge);
        String personHeight=person.objDemographic.getHeight();
        Height_JTextField.setText(personHeight);
        String personWeight=person.objDemographic.getWeight();
        Weight_JTextField.setText(personWeight);
        String personSocialSecurityNumber=person.objDemographic.getSocialSecurityNumber();
        SocialSecurityNumber_JTextField.setText(personSocialSecurityNumber);
        String personPhoneNumber=person.objDemographic.getPhoneNumber();
        PhoneNumber_JTextField.setText(personPhoneNumber);
        
        //Address
        String personStreetAddress=person.objAddress.getStreetAddress();
        StreetAddress_JTextField.setText(personStreetAddress);
        String personCity=person.objAddress.getCity();
        City_JTextField.setText(personCity);
        String personState=person.objAddress.getState();
        State_JTextField.setText(personState);
        String personZipcode=person.objAddress.getZipcode();
        Zipcode_JTextField.setText(personZipcode);
        
        //Bank
        String personBankName=person.objBank.getBankName();
        BankName_JTextField.setText(personBankName);
        String personBankRoutingNumber=person.objBank.getBankRoutingNumber();
        BankRoutingNumber_JTextField.setText(personBankRoutingNumber);
        String personAccountType=person.objBank.getAccountType();
        AccountType_JTextField.setText(personAccountType);
       //String personComboAccountType=person.objBank.getComboAccountType();
       //ComboAccountType_JTextField.setActionCommand(personComboAccountType);
        String personSavingsAccountNumber=person.objBank.getSavingsAccountNumber();
        SavingsAccountNumber_JTextField.setText(personSavingsAccountNumber);
        String personSavingsAccountBalance=person.objBank.getSavingsAccountBalance();
        SavingsAccountBalance_JTextField.setText(personSavingsAccountBalance);
        String personCheckingAccountNumber=person.objBank.getCheckingAccountNumber();
        CheckingAccountNumber_JTextField.setText(personCheckingAccountNumber);
        String personCheckingAccountBalance=person.objBank.getCheckingAccountBalance();
        CheckingAccountBalance_JTextField.setText(personCheckingAccountBalance);
        
        //Driver's License
        String personLicenseNumber=person.objDriversLicense.getLicenseNumber();
        LicenseNumber_JTextField.setText(personLicenseNumber);
        String personDateOfIssue=person.objDriversLicense.getDateOfIssue();
        DateOfIssue_JTextField.setText(personDateOfIssue);
        String personDateOfExpiration=person.objDriversLicense.getDateOfExpiration();
        DateOfExpiration_JTextField.setText(personDateOfExpiration);
        String personBloodType=person.objDriversLicense.getBloodType();
        BloodType_JTextField.setText(personBloodType);
        ImageIcon image=person.getObjDriversLicense().getImages();
        Image_JLabel.setIcon(image);
        
        
                
                
        //Medical Record
        String personMedicalRecordNumber=person.objMedicalRecord.getMedicalRecordNumber();
        MedicalRecordNumber_JTextField.setText(personMedicalRecordNumber);
        String personAllergy1=person.objMedicalRecord.getAllergy1();
        Allergy1_JTextField.setText(personAllergy1);
        String personAllergy2=person.objMedicalRecord.getAllergy2();
        Allergy2_JTextField.setText(personAllergy2);
        String personAllergy3=person.objMedicalRecord.getAllergy3();
        Allergy3_JTextField.setText(personAllergy3);
        
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
        jPanel1 = new javax.swing.JPanel();
        ViewTitle_JLabel = new javax.swing.JLabel();
        Top_JSeparator = new javax.swing.JSeparator();
        DemographicTitle_JLabel = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        FirstName_JLabel = new javax.swing.JLabel();
        FirstName_JTextField = new javax.swing.JTextField();
        LastName_JLabel = new javax.swing.JLabel();
        LastName_JTextField = new javax.swing.JTextField();
        DateOfBirth_JLabel = new javax.swing.JLabel();
        DateOfBirth_MMDDYYYY_JLabel = new javax.swing.JLabel();
        DateOfBirth_JTextField = new javax.swing.JTextField();
        Age_JLabel = new javax.swing.JLabel();
        Age_JTextField = new javax.swing.JTextField();
        Height_JLabel = new javax.swing.JLabel();
        Height_JTextField = new javax.swing.JTextField();
        Weight_JLabel = new javax.swing.JLabel();
        Weight_JTextField = new javax.swing.JTextField();
        SocialSecurityNumber_JLabel = new javax.swing.JLabel();
        SocialSecurityNumber_JTextField = new javax.swing.JTextField();
        PhoneNumber_JLabel = new javax.swing.JLabel();
        PhoneNumber_JTextField = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        AddressTitle_JLabel = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        StreetAddress_JLabel = new javax.swing.JLabel();
        StreetAddress_JTextField = new javax.swing.JTextField();
        City_JLabel = new javax.swing.JLabel();
        City_JTextField = new javax.swing.JTextField();
        State_JLabel = new javax.swing.JLabel();
        State_JTextField = new javax.swing.JTextField();
        Zipcode_JLabel = new javax.swing.JLabel();
        Zipcode_JTextField = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        BankTitle_JLabel = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
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
        jSeparator9 = new javax.swing.JSeparator();
        DriversLicenseTitle_JLabel = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        LicenseNumber_JLabel = new javax.swing.JLabel();
        LicenseNumber_JTextField = new javax.swing.JTextField();
        DateOfIssue_JLabel = new javax.swing.JLabel();
        DateOfIssue_MMDDYYYY_JLabel = new javax.swing.JLabel();
        DateOfIssue_JTextField = new javax.swing.JTextField();
        BloodType_JLabel = new javax.swing.JLabel();
        BloodType_JTextField = new javax.swing.JTextField();
        DateOfExpiration_JLabel = new javax.swing.JLabel();
        DateOfExpiration_JTextField = new javax.swing.JTextField();
        Image_JLabel = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
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
        Bottom_JSeparator = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(207, 235, 235));
        setPreferredSize(new java.awt.Dimension(670, 900));

        jScrollPane1.setBackground(new java.awt.Color(216, 240, 232));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(670, 900));

        jPanel1.setBackground(new java.awt.Color(207, 235, 235));
        jPanel1.setPreferredSize(new java.awt.Dimension(670, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewTitle_JLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        ViewTitle_JLabel.setText("View your Profile");
        jPanel1.add(ViewTitle_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 6, 181, -1));
        jPanel1.add(Top_JSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 673, -1));

        DemographicTitle_JLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DemographicTitle_JLabel.setText("Demographic:");
        jPanel1.add(DemographicTitle_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 72, 673, -1));

        FirstName_JLabel.setText("First Name:");
        jPanel1.add(FirstName_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 105, -1, 20));

        FirstName_JTextField.setEditable(false);
        FirstName_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(FirstName_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 105, 100, -1));

        LastName_JLabel.setText("Last Name:");
        jPanel1.add(LastName_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 105, -1, 20));

        LastName_JTextField.setEditable(false);
        LastName_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LastName_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 105, 100, -1));

        DateOfBirth_JLabel.setText("Date of Birth:");
        jPanel1.add(DateOfBirth_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 105, -1, 20));

        DateOfBirth_MMDDYYYY_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DateOfBirth_MMDDYYYY_JLabel.setText("MM/DD/YYYY");
        jPanel1.add(DateOfBirth_MMDDYYYY_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 80, 97, -1));

        DateOfBirth_JTextField.setEditable(false);
        DateOfBirth_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        DateOfBirth_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateOfBirth_JTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(DateOfBirth_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 105, 97, -1));

        Age_JLabel.setText("Age:");
        jPanel1.add(Age_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 136, -1, 20));

        Age_JTextField.setEditable(false);
        Age_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Age_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 136, 50, -1));

        Height_JLabel.setText("Height:");
        jPanel1.add(Height_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 136, 37, 20));

        Height_JTextField.setEditable(false);
        Height_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Height_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 136, 50, -1));

        Weight_JLabel.setText("Weight:");
        jPanel1.add(Weight_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 136, -1, 20));

        Weight_JTextField.setEditable(false);
        Weight_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Weight_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 136, 50, -1));

        SocialSecurityNumber_JLabel.setText("Social Security Number:");
        jPanel1.add(SocialSecurityNumber_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 139, -1, -1));

        SocialSecurityNumber_JTextField.setEditable(false);
        SocialSecurityNumber_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(SocialSecurityNumber_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 136, 97, -1));

        PhoneNumber_JLabel.setText("Phone Number:");
        jPanel1.add(PhoneNumber_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 171, -1, 20));

        PhoneNumber_JTextField.setEditable(false);
        PhoneNumber_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(PhoneNumber_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 171, 100, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 202, 673, -1));

        AddressTitle_JLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddressTitle_JLabel.setText("Address:");
        jPanel1.add(AddressTitle_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 229, 673, -1));

        StreetAddress_JLabel.setText("Street Address:");
        jPanel1.add(StreetAddress_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 249, -1, 20));

        StreetAddress_JTextField.setEditable(false);
        StreetAddress_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        StreetAddress_JTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        StreetAddress_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StreetAddress_JTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(StreetAddress_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 249, 100, 60));

        City_JLabel.setText("City:");
        jPanel1.add(City_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 249, -1, 20));
        jPanel1.add(City_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 249, 100, -1));

        State_JLabel.setText("State:");
        jPanel1.add(State_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 249, 36, 20));

        State_JTextField.setEditable(false);
        State_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        State_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                State_JTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(State_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 249, 100, -1));

        Zipcode_JLabel.setText("Zipcode:");
        jPanel1.add(Zipcode_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 287, -1, 20));

        Zipcode_JTextField.setEditable(false);
        Zipcode_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Zipcode_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 287, 100, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 327, 673, -1));

        BankTitle_JLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BankTitle_JLabel.setText("Bank:");
        jPanel1.add(BankTitle_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 335, -1, -1));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 368, 673, -1));

        BankName_JLabel.setText("Bank Name:");
        jPanel1.add(BankName_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 382, -1, 20));

        BankName_JTextField.setEditable(false);
        BankName_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        BankName_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankName_JTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(BankName_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 382, 100, -1));

        BankRoutingNumber_JLabel.setText("Routing Number:");
        jPanel1.add(BankRoutingNumber_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 382, -1, 20));

        BankRoutingNumber_JTextField.setEditable(false);
        BankRoutingNumber_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        BankRoutingNumber_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankRoutingNumber_JTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(BankRoutingNumber_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 382, 100, -1));

        AccountType_JLabel1.setText("Account Type:");
        jPanel1.add(AccountType_JLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 385, -1, -1));

        AccountType_JTextField.setEditable(false);
        AccountType_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        AccountType_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountType_JTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(AccountType_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 382, 100, -1));

        AccountTypeS_JLabel.setText("Account Type: ");
        jPanel1.add(AccountTypeS_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 419, -1, -1));

        AccountTypeSavings_JLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AccountTypeSavings_JLabel.setText("Savings");
        jPanel1.add(AccountTypeSavings_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 419, -1, -1));

        SavingsAccountNumber_JLabel.setText("A/C Number:");
        jPanel1.add(SavingsAccountNumber_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 446, -1, -1));

        SavingsAccountNumber_JTextField.setEditable(false);
        SavingsAccountNumber_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(SavingsAccountNumber_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 443, 100, -1));

        SavingsAccountBalance_JLabel.setText("Account Balance:");
        jPanel1.add(SavingsAccountBalance_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 446, -1, -1));

        SavingsAccountBalance_JTextField.setEditable(false);
        SavingsAccountBalance_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(SavingsAccountBalance_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 443, 98, -1));

        AccountTypeC_JLabel.setText("Account Type: ");
        jPanel1.add(AccountTypeC_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 481, -1, -1));

        AccountTypeChecking_JLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AccountTypeChecking_JLabel.setText("Checking");
        jPanel1.add(AccountTypeChecking_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 481, -1, -1));

        CheckingAccountNumber_JLabel.setText("A/C Number:");
        jPanel1.add(CheckingAccountNumber_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 516, -1, -1));

        CheckingAccountNumber_JTextField.setEditable(false);
        CheckingAccountNumber_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(CheckingAccountNumber_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 513, 100, -1));

        CheckingAccountBalance_JLabel.setText("Account Balance:");
        jPanel1.add(CheckingAccountBalance_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 516, -1, -1));

        CheckingAccountBalance_JTextField.setEditable(false);
        CheckingAccountBalance_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(CheckingAccountBalance_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 513, 98, -1));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 551, 673, -1));

        DriversLicenseTitle_JLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DriversLicenseTitle_JLabel.setText("Driver's License:");
        jPanel1.add(DriversLicenseTitle_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 559, -1, -1));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 673, 3));

        LicenseNumber_JLabel.setText("License Number:");
        jPanel1.add(LicenseNumber_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 610, -1, 20));

        LicenseNumber_JTextField.setEditable(false);
        LicenseNumber_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LicenseNumber_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 610, 100, -1));

        DateOfIssue_JLabel.setText("Date of Issue:");
        jPanel1.add(DateOfIssue_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 610, -1, 20));

        DateOfIssue_MMDDYYYY_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DateOfIssue_MMDDYYYY_JLabel.setText("MM/DD/YYYY");
        jPanel1.add(DateOfIssue_MMDDYYYY_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 590, -1, -1));

        DateOfIssue_JTextField.setEditable(false);
        DateOfIssue_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(DateOfIssue_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 610, 101, -1));

        BloodType_JLabel.setText("Blood Group: ");
        jPanel1.add(BloodType_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 648, -1, 20));

        BloodType_JTextField.setEditable(false);
        BloodType_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(BloodType_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 648, 100, -1));

        DateOfExpiration_JLabel.setText("Date of Expiration:");
        jPanel1.add(DateOfExpiration_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 651, 99, -1));

        DateOfExpiration_JTextField.setEditable(false);
        DateOfExpiration_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(DateOfExpiration_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 648, 100, -1));
        jPanel1.add(Image_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 594, 114, 113));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 708, 673, -1));

        MedicalRecordNumberTitle_JLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MedicalRecordNumberTitle_JLabel.setText("Medical Record Number:");
        jPanel1.add(MedicalRecordNumberTitle_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 716, -1, -1));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 737, 673, 3));

        MedicalRecordNumber_JLabel.setText("Record Number:");
        jPanel1.add(MedicalRecordNumber_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 750, -1, -1));

        MedicalRecordNumber_JTextField.setEditable(false);
        MedicalRecordNumber_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(MedicalRecordNumber_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 747, 100, -1));

        Allergy1_JLabel.setText("Allergy 1:");
        jPanel1.add(Allergy1_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 773, -1, 20));

        Allergy1_JTextField.setEditable(false);
        Allergy1_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Allergy1_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 773, 100, -1));

        Allergy2_JLabel.setText("Allergy 2:");
        jPanel1.add(Allergy2_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 773, -1, 20));

        Allergy2_JTextField.setEditable(false);
        Allergy2_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Allergy2_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 773, 100, -1));

        Allergy3_JLabel.setText("Allergy 3:");
        jPanel1.add(Allergy3_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 773, -1, 20));

        Allergy3_JTextField.setEditable(false);
        Allergy3_JTextField.setBackground(new java.awt.Color(255, 255, 255));
        Allergy3_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Allergy3_JTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(Allergy3_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 773, 100, -1));
        jPanel1.add(Bottom_JSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 811, 673, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DateOfBirth_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateOfBirth_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateOfBirth_JTextFieldActionPerformed

    private void State_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_State_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_State_JTextFieldActionPerformed

    private void BankRoutingNumber_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankRoutingNumber_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BankRoutingNumber_JTextFieldActionPerformed

    private void Allergy3_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Allergy3_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Allergy3_JTextFieldActionPerformed

    private void AccountType_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountType_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountType_JTextFieldActionPerformed

    private void StreetAddress_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StreetAddress_JTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_StreetAddress_JTextFieldActionPerformed

    private void BankName_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankName_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BankName_JTextFieldActionPerformed


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
    private javax.swing.JSeparator Bottom_JSeparator;
    private javax.swing.JLabel CheckingAccountBalance_JLabel;
    private javax.swing.JTextField CheckingAccountBalance_JTextField;
    private javax.swing.JLabel CheckingAccountNumber_JLabel;
    private javax.swing.JTextField CheckingAccountNumber_JTextField;
    private javax.swing.JLabel City_JLabel;
    private javax.swing.JTextField City_JTextField;
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
    private javax.swing.JLabel Image_JLabel;
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
    private javax.swing.JTextField StreetAddress_JTextField;
    private javax.swing.JSeparator Top_JSeparator;
    private javax.swing.JLabel ViewTitle_JLabel;
    private javax.swing.JLabel Weight_JLabel;
    private javax.swing.JTextField Weight_JTextField;
    private javax.swing.JLabel Zipcode_JLabel;
    private javax.swing.JTextField Zipcode_JTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
