/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author rusha
 */
    public class Person {
    private String FirstName;
    private String LastName;
    private String DateOfBirth;
    private String SSN;
    Address WorkAddress;
    Address LocalAddress;
    Address HomeAddress;

    public String getFirstName() {
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

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public Address getWorkAddress() {
        return WorkAddress;
    }

    public void setWorkAddress(Address WorkAddress) {
        this.WorkAddress = WorkAddress;
    }

    public Address getLocalAddress() {
        return LocalAddress;
    }

    public void setLocalAddress(Address LocalAddress) {
        this.LocalAddress = LocalAddress;
    }

    public Address getHomeAddress() {
        return HomeAddress;
    }

    public void setHomeAddress(Address HomeAddress) {
        this.HomeAddress = HomeAddress;
    }
    
    
}
