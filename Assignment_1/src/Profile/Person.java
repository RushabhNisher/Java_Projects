/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profile;

/**
 *
 * @author rusha
 */
public class Person {
    //Calling other classes
    public Demographic objDemographic= new Demographic();
    public Address objAddress= new Address();
    public Bank objBank= new Bank();
    public DriversLicense objDriversLicense= new DriversLicense();
    public MedicalRecord objMedicalRecord= new MedicalRecord();

    public Demographic getObjDemographic() {
        return objDemographic;
    }

    public void setObjDemographic(Demographic objDemographic) {
        this.objDemographic = objDemographic;
    }

    public Address getObjAddress() {
        return objAddress;
    }

    public void setObjAddress(Address objAddress) {
        this.objAddress = objAddress;
    }

    public Bank getObjBank() {
        return objBank;
    }

    public void setObjBank(Bank objBank) {
        this.objBank = objBank;
    }

    public DriversLicense getObjDriversLicense() {
        return objDriversLicense;
    }

    public void setObjDriversLicense(DriversLicense objDriversLicense) {
        this.objDriversLicense = objDriversLicense;
    }

    public MedicalRecord getObjMedicalRecord() {
        return objMedicalRecord;
    }

    public void setObjMedicalRecord(MedicalRecord objMedicalRecord) {
        this.objMedicalRecord = objMedicalRecord;
    }
    
    /**
  //  private String FirstName;
    private String LastName;
    private String PhoneNumber;
    private String DateOfBirth;
    private String Age;
    private String Height;
    private String Weight;
    private String SocialSecurityNumber;
    //Address
    private String StreetAddress;
    private String City;
    private String State;
    private String Zipcode;
    //Bank Information
    private String BankName;
    private String BankRoutingNumber;
    private String AccountType;
    private String SavingsAccountNumber;
    private String SavingsAccountBalance;
    private String CheckingAccountNumber;
    private String CheckingAccountBalance;
    //Driver's License Information
    private String LicenseNumber;
    private String DateOfIssue;
    private String DateOfExpiration;
    private String BloodType;
    //private String AccountType; Picture
    //Medical Record
    private String MedicalRecordNumber;
    private String Allergy1;
    private String Allergy2;
    private String Allergy3;
*/
/**    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String Height) {
        this.Height = Height;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String Weight) {
        this.Weight = Weight;
    }

    public String getSocialSecurityNumber() {
        return SocialSecurityNumber;
    }

    public void setSocialSecurityNumber(String SocialSecurityNumber) {
        this.SocialSecurityNumber = SocialSecurityNumber;
    }

    public String getStreetAddress() {
        return StreetAddress;
    }

    public void setStreetAddress(String StreetAddress) {
        this.StreetAddress = StreetAddress;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String Zipcode) {
        this.Zipcode = Zipcode;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public String getBankRoutingNumber() {
        return BankRoutingNumber;
    }

    public void setBankRoutingNumber(String BankRoutingNumber) {
        this.BankRoutingNumber = BankRoutingNumber;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    public String getSavingsAccountNumber() {
        return SavingsAccountNumber;
    }

    public void setSavingsAccountNumber(String SavingsAccountNumber) {
        this.SavingsAccountNumber = SavingsAccountNumber;
    }

    public String getSavingsAccountBalance() {
        return SavingsAccountBalance;
    }

    public void setSavingsAccountBalance(String SavingsAccountBalance) {
        this.SavingsAccountBalance = SavingsAccountBalance;
    }

    public String getCheckingAccountNumber() {
        return CheckingAccountNumber;
    }

    public void setCheckingAccountNumber(String CheckingAccountNumber) {
        this.CheckingAccountNumber = CheckingAccountNumber;
    }

    public String getCheckingAccountBalance() {
        return CheckingAccountBalance;
    }

    public void setCheckingAccountBalance(String CheckingAccountBalance) {
        this.CheckingAccountBalance = CheckingAccountBalance;
    }

    public String getLicenseNumber() {
        return LicenseNumber;
    }

    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    public String getDateOfIssue() {
        return DateOfIssue;
    }

    public void setDateOfIssue(String DateOfIssue) {
        this.DateOfIssue = DateOfIssue;
    }

    public String getDateOfExpiration() {
        return DateOfExpiration;
    }

    public void setDateOfExpiration(String DateOfExpiration) {
        this.DateOfExpiration = DateOfExpiration;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    public String getMedicalRecordNumber() {
        return MedicalRecordNumber;
    }

    public void setMedicalRecordNumber(String MedicalRecordNumber) {
        this.MedicalRecordNumber = MedicalRecordNumber;
    }

    public String getAllergy1() {
        return Allergy1;
    }

    public void setAllergy1(String Allergy1) {
        this.Allergy1 = Allergy1;
    }

    public String getAllergy2() {
        return Allergy2;
    }

    public void setAllergy2(String Allergy2) {
        this.Allergy2 = Allergy2;
    }

    public String getAllergy3() {
        return Allergy3;
    }

    public void setAllergy3(String Allergy3) {
        this.Allergy3 = Allergy3;
    }
*/
    
}
