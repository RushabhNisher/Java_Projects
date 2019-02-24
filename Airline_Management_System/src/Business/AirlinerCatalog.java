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
public class AirlinerCatalog {
private ArrayList<Airliner> airlinercatalog;
  
public AirlinerCatalog(){
    airlinercatalog=new ArrayList<Airliner>();
}  
public ArrayList<Airliner> getAirlinerCatalog(){
    return airlinercatalog;
}
public Airliner addAirliner() {
    Airliner ai = new Airliner();
    airlinercatalog.add(ai);
    return ai;
    }
public void removeAirliner(Airliner a) {
        airlinercatalog.remove(a);
    }

public Airliner searchAirliner(String AirlinerName){
        for(Airliner airliner : this.airlinercatalog){
            if(airliner.getAirlinerName().equalsIgnoreCase(AirlinerName)){
                return airliner;
            }
        }
        return null;
    }

}
