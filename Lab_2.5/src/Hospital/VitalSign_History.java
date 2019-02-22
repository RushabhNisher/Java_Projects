/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;
import java.util.*;
/**
 *
 * @author rusha
 */
public class VitalSign_History {
    
    private ArrayList<VitalSigns> VitalSign_History;
    
    public VitalSign_History(){
    VitalSign_History=new ArrayList<>();//Used Diamonc Interface
    }

    public ArrayList<VitalSigns> getVitalSign_History() {
        return VitalSign_History;
    }

    public void setVitalSign_History(ArrayList<VitalSigns> VitalSign_History) {
        this.VitalSign_History = VitalSign_History;
    }
    
    public VitalSigns addVitalSigns(){
    VitalSigns vitalsigns=new VitalSigns();
    VitalSign_History.add(vitalsigns);
    return vitalsigns;
    }
    
    public void deleteVitalSigns(VitalSigns vital){
     VitalSign_History.remove(vital);
    }
    
    public List<VitalSigns> getAbnormalList(double MaxPulse, double MinPulse){
        List<VitalSigns>abnList=new ArrayList<>();
        
        for(VitalSigns vitalsign:VitalSign_History){
            if(vitalsign.getPulse()>MaxPulse || vitalsign.getPulse()<MinPulse){
                abnList.add(vitalsign);
            }
        }
        return abnList;
    }
   
}
