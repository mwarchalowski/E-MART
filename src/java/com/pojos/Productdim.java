package com.pojos;
// Generated Nov 1, 2013 7:16:30 PM by Hibernate Tools 3.6.0



/**
 * Productdim generated by hbm2java
 */
public class Productdim  implements java.io.Serializable {


     private Integer pdmId;
     private Product product;
     private Float productHeight;
     private Float productWidth;
     private Float productLength;

    public Productdim() {
    }

    public Productdim(Product product, Float productHeight, Float productWidth, Float productLength) {
       this.product = product;
       this.productHeight = productHeight;
       this.productWidth = productWidth;
       this.productLength = productLength;
    }
   
    public Integer getPdmId() {
        return this.pdmId;
    }
    
    public void setPdmId(Integer pdmId) {
        this.pdmId = pdmId;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    public Float getProductHeight() {
        return this.productHeight;
    }
    
    public void setProductHeight(Float productHeight) {
        this.productHeight = productHeight;
    }
    public Float getProductWidth() {
        return this.productWidth;
    }
    
    public void setProductWidth(Float productWidth) {
        this.productWidth = productWidth;
    }
    public Float getProductLength() {
        return this.productLength;
    }
    
    public void setProductLength(Float productLength) {
        this.productLength = productLength;
    }




}


