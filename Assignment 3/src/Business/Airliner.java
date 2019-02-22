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
public class Airliner {
    private String AirlinerName;
    private AirplaneCatalog airplanecatalog;
    
    public Airliner(){
    airplanecatalog= new AirplaneCatalog();
    }

    public String getAirlinerName() {
        return AirlinerName;
    }

    public void setAirlinerName(String AirlinerName) {
        this.AirlinerName = AirlinerName;
    }

    public AirplaneCatalog getAirplanecatalog() {
        return airplanecatalog;
    }

  //  public void setAirplanecatalog(AirplaneCatalog airplanecatalog) {
    //    this.airplanecatalog = airplanecatalog;
    //}
 
    @Override
    public String toString() {
        return AirlinerName;
    }
}
