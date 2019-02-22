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
public class PaymentCatalog {
    private ArrayList<Payment> paymentcatalog;
        
    public PaymentCatalog(){
    paymentcatalog=new ArrayList<Payment>();
}  
public ArrayList<Payment> getPaymentCatalog(){
    return paymentcatalog;
}
public Payment addPayment() {
    Payment p = new Payment();
    paymentcatalog.add(p);
    return p;
    }
public void removePayment(Payment p) {
        paymentcatalog.remove(p);
    }

}
