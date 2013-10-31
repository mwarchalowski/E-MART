package com.pojos;
// Generated Oct 31, 2013 12:25:27 AM by Hibernate Tools 3.6.0



/**
 * PharmacyMedicine generated by hbm2java
 */
public class PharmacyMedicine  implements java.io.Serializable {


     private int pid;
     private String pname;
     private Float price;
     private String description;
     private byte[] photo;
     private Integer quantity;

    public PharmacyMedicine() {
    }

	
    public PharmacyMedicine(int pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }
    public PharmacyMedicine(int pid, String pname, Float price, String description, byte[] photo, Integer quantity) {
       this.pid = pid;
       this.pname = pname;
       this.price = price;
       this.description = description;
       this.photo = photo;
       this.quantity = quantity;
    }
   
    public int getPid() {
        return this.pid;
    }
    
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getPname() {
        return this.pname;
    }
    
    public void setPname(String pname) {
        this.pname = pname;
    }
    public Float getPrice() {
        return this.price;
    }
    
    public void setPrice(Float price) {
        this.price = price;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public byte[] getPhoto() {
        return this.photo;
    }
    
    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }




}


