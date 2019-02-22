/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;

/**
 *
 * @author rusha
 */
public class CustomerCatalog {
        private ArrayList<CustomerBooking> customercatalog;
        
    public CustomerCatalog(){
    customercatalog=new ArrayList<CustomerBooking>();
}  
public ArrayList<CustomerBooking> getCustomerCatalog(){
    return customercatalog;
}
public CustomerBooking addCustomer() {
    CustomerBooking c = new CustomerBooking();
    customercatalog.add(c);
    return c;
    }
public void removeCustomer(CustomerBooking c) {
        customercatalog.remove(c);
    }


}
