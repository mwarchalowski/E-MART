package com.pojos;
// Generated Nov 9, 2013 6:18:21 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Orderstatus generated by hbm2java
 */
public class Orderstatus  implements java.io.Serializable {


     private Integer osId;
     private Storeorders storeorders;
     private Date statusDate;
     private String status;
     private String statusComments;

    public Orderstatus() {
    }

    public Orderstatus(Storeorders storeorders, Date statusDate, String status, String statusComments) {
       this.storeorders = storeorders;
       this.statusDate = statusDate;
       this.status = status;
       this.statusComments = statusComments;
    }
   
    public Integer getOsId() {
        return this.osId;
    }
    
    public void setOsId(Integer osId) {
        this.osId = osId;
    }
    public Storeorders getStoreorders() {
        return this.storeorders;
    }
    
    public void setStoreorders(Storeorders storeorders) {
        this.storeorders = storeorders;
    }
    public Date getStatusDate() {
        return this.statusDate;
    }
    
    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatusComments() {
        return this.statusComments;
    }
    
    public void setStatusComments(String statusComments) {
        this.statusComments = statusComments;
    }




}


