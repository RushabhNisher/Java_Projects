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
public class Product {
    private String name;
    private float price;
    private int availNum;
    private String description;
    public Supplier objSupplier= new Supplier();

    public Supplier getObjSupplier() {
        return objSupplier;
    }

    public void setObjSupplier(Supplier objSupplier) {
        this.objSupplier = objSupplier;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAvailNum() {
        return availNum;
    }

    public void setAvailNum(int availNum) {
        this.availNum = availNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
