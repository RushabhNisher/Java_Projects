/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

/**
 *
 * @author rusha
 */
public class VitalSigns {
    private float Temperature;
    private float BloodPressure;
    private int Pulse;
    private String date;

    public float getTemperature() {
        return Temperature;
    }

    public void setTemperature(float Temperature) {
        this.Temperature = Temperature;
    }

    public float getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(float BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public int getPulse() {
        return Pulse;
    }

    public void setPulse(int Pulse) {
        this.Pulse = Pulse;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
       @Override
       public String toString(){
        return this.date;
       }
    
}
