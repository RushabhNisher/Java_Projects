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
public class MainClass {
    public Person objPerson= new Person();
    public Address WorkobjAddress= new Address();
    public Address LocalobjAddress= new Address();
    public Address HomeobjAddress= new Address();

    /*public Person getObjPerson() {
        return objPerson;
    }

    public void setObjPerson(Person objPerson) {
        this.objPerson = objPerson;
    }

    public Address getWorkobjAddress() {
        return WorkobjAddress;
    }

    public void setWorkobjAddress(Address WorkobjAddress) {
        this.WorkobjAddress = WorkobjAddress;
    }

    public Address getLocalobjAddress() {
        return LocalobjAddress;
    }

    public void setLocalobjAddress(Address LocalobjAddress) {
        this.LocalobjAddress = LocalobjAddress;
    }

    public Address getHomeobjAddress() {
        return HomeobjAddress;
    }

    public void setHomeobjAddress(Address HomeobjAddress) {
        this.HomeobjAddress = HomeobjAddress;
    }*/


// Main main=new Main();
    public static void main(String[] args){
    
    Person person=new Person();
    person.setFirstName("Rushabh");
    person.setLastName("Nisher");
    person.setDateOfBirth("1995/11/21");
    person.setSSN("123-456-7899");
    
    Address WorkAddress=new Address();
    WorkAddress.setStreetLine1("360, Huntington Ave");
    WorkAddress.setStreetLine2("");
    WorkAddress.setCity("Boston");
    WorkAddress.setState("MA");
    WorkAddress.setZipcode("02115");
    WorkAddress.setCountry("United States");
    person.setWorkAddress(WorkAddress);
    
    Address LocalAddress=new Address();
    LocalAddress.setStreetLine1("55 Burbank Street");
    LocalAddress.setStreetLine2("Apartment Number 15");
    LocalAddress.setCity("Boston");
    LocalAddress.setState("MA");
    LocalAddress.setZipcode("02115");
    LocalAddress.setCountry("United States");
    person.setLocalAddress(LocalAddress);
    
    Address HomeAddress=new Address();
    HomeAddress.setStreetLine1("350/101 A, Balaram Bhuvan, Balaram Street,");
    HomeAddress.setStreetLine2("M.S.ALi Road, Grant Road (East)");
    HomeAddress.setCity("Mumbai");
    HomeAddress.setState("Maharashtra");
    HomeAddress.setZipcode("400007");
    HomeAddress.setCountry("India");
    person.setHomeAddress(HomeAddress);
    
    System.out.println("Person");
    System.out.println("First Name:"+person.getFirstName());
    System.out.println("Last Name:"+person.getLastName());
    System.out.println("Date Of Birth:"+person.getDateOfBirth());
    System.out.println("Social Security Number:"+person.getSSN());    
    System.out.println();
  
    System.out.println("Work Address");
    System.out.println("Street Line 1:"+WorkAddress.getStreetLine1());
    System.out.println("Street Line 2:"+WorkAddress.getStreetLine2());
    System.out.println("City:"+WorkAddress.getCity());
    System.out.println("State:"+WorkAddress.getState());
    System.out.println("Country:"+WorkAddress.getCountry());

    System.out.println();
  
    System.out.println("Local Address");
    System.out.println("Street Line 1:"+LocalAddress.getStreetLine1());
    System.out.println("Street Line 2:"+LocalAddress.getStreetLine2());
    System.out.println("City:"+LocalAddress.getCity());
    System.out.println("State:"+LocalAddress.getState());
    System.out.println("Country:"+LocalAddress.getCountry());
 
    System.out.println();
  
    System.out.println("Home Address");
    System.out.println("Street Line 1:"+HomeAddress.getStreetLine1());
    System.out.println("Street Line 2:"+HomeAddress.getStreetLine2());
    System.out.println("City:"+HomeAddress.getCity());
    System.out.println("State:"+HomeAddress.getState());
    System.out.println("Country:"+HomeAddress.getCountry());
 
 }    
   
}
