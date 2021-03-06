package com.pojos;
// Generated Nov 9, 2013 6:18:21 PM by Hibernate Tools 3.6.0



/**
 * Billingaddress generated by hbm2java
 */
public class Billingaddress  implements java.io.Serializable {


     private Integer baId;
     private Customer customer;
     private String addr1;
     private String addr2;
     private String city;
     private String state;
     private String zip;

    public Billingaddress() {
    }

    public Billingaddress(Customer customer, String addr1, String addr2, String city, String state, String zip) {
       this.customer = customer;
       this.addr1 = addr1;
       this.addr2 = addr2;
       this.city = city;
       this.state = state;
       this.zip = zip;
    }
   
    public Integer getBaId() {
        return this.baId;
    }
    
    public void setBaId(Integer baId) {
        this.baId = baId;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public String getAddr1() {
        return this.addr1;
    }
    
    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }
    public String getAddr2() {
        return this.addr2;
    }
    
    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    public String getZip() {
        return this.zip;
    }
    
    public void setZip(String zip) {
        this.zip = zip;
    }




}


