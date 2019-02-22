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
public class AirplaneCatalog {
    private ArrayList<Airplane> airplanecatalog;
  
public AirplaneCatalog(){
    airplanecatalog=new ArrayList<Airplane>();
}  
public ArrayList<Airplane> getAirplaneCatalog(){
    return airplanecatalog;
}
public Airplane addAirplane() {
    Airplane a = new Airplane();
    airplanecatalog.add(a);
    return a;
    }
public void removeAirplane(Airplane a) {
        airplanecatalog.remove(a);
    }

public Airplane searchAirplane(String PlaneName){
        for(Airplane airplane : this.airplanecatalog){
            if(airplane.getPlaneName().equalsIgnoreCase(PlaneName)){
                return airplane;
            }
        }
        return null;
    }


}
