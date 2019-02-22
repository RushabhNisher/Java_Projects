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
public class Airplane {
  private String PlaneName;
  private float Price;
  private int Seats;
  private int PlaneID;
  private String Description;
  private String From;
  private String To;
       
  

    public String getPlaneName() {
        return PlaneName;
    }

    public void setPlaneName(String PlaneName) {
        this.PlaneName = PlaneName;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public int getSeats() {
        return Seats;
    }

    public void setSeats(int Seats) {
        this.Seats = Seats;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getPlaneID() {
        return PlaneID;
    }

    public void setPlaneID(int PlaneID) {
        this.PlaneID = PlaneID;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String From) {
        this.From = From;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String To) {
        this.To = To;
    }
    
  @Override
    public String toString() {
        return PlaneName;
    }
}
