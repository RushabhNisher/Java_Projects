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
public class Address {
    private String StreetLine1;
    private String StreetLine2;
    private String City;
    private String State;
    private String Zipcode;
    private String Country;

    public String getStreetLine1() {
        return StreetLine1;
    }

    public void setStreetLine1(String StreetLine1) {
        this.StreetLine1 = StreetLine1;
    }

    public String getStreetLine2() {
        return StreetLine2;
    }

    public void setStreetLine2(String StreetLine2) {
        this.StreetLine2 = StreetLine2;
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

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }
    
}