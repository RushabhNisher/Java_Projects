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
public class Payment {
    private String NameOnCard;
    private int CardNumber;
    private int CVV;
    private String GoodThrough;

    public String getNameOnCard() {
        return NameOnCard;
    }

    public void setNameOnCard(String NameOnCard) {
        this.NameOnCard = NameOnCard;
    }

    public int getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(int CardNumber) {
        this.CardNumber = CardNumber;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public String getGoodThrough() {
        return GoodThrough;
    }

    public void setGoodThrough(String GoodThrough) {
        this.GoodThrough = GoodThrough;
    }
     @Override
    public String toString() {
        return NameOnCard;
    }
}
