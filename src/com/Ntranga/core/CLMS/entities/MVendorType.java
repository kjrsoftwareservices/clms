package com.Ntranga.core.CLMS.entities;
// Generated 22 Jun, 2016 4:22:24 PM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MVendorType generated by hbm2java
 */
@Entity
@Table(name="m_vendor_type"
    
)
public class MVendorType  implements java.io.Serializable {


     private Integer vendorTypeId;
     private String vendorType;
     private String isActive;
     private int createdBy;
     private Date createdDate;
     private int modifiedBy;
     private Date modifiedDate;

    public MVendorType() {
    }

    public MVendorType(String vendorType, String isActive, int createdBy, Date createdDate, int modifiedBy, Date modifiedDate) {
       this.vendorType = vendorType;
       this.isActive = isActive;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
       this.modifiedBy = modifiedBy;
       this.modifiedDate = modifiedDate;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Vendor_Type_Id", unique=true, nullable=false)
    public Integer getVendorTypeId() {
        return this.vendorTypeId;
    }
    
    public void setVendorTypeId(Integer vendorTypeId) {
        this.vendorTypeId = vendorTypeId;
    }

    
    @Column(name="Vendor_Type", nullable=false, length=45)
    public String getVendorType() {
        return this.vendorType;
    }
    
    public void setVendorType(String vendorType) {
        this.vendorType = vendorType;
    }

    
    @Column(name="Is_Active", nullable=false, length=2)
    public String getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    
    @Column(name="Created_By", nullable=false)
    public int getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Created_Date", nullable=false, length=19)
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    
    @Column(name="Modified_By", nullable=false)
    public int getModifiedBy() {
        return this.modifiedBy;
    }
    
    public void setModifiedBy(int modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Modified_Date", nullable=false, length=19)
    public Date getModifiedDate() {
        return this.modifiedDate;
    }
    
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }




}


