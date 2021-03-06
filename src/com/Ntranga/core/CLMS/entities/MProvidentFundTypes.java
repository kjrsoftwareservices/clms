package com.Ntranga.core.CLMS.entities;
// Generated Jun 27, 2016 2:40:15 PM by Hibernate Tools 3.6.0


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
 * MProvidentFundTypes generated by hbm2java
 */
@Entity
@Table(name="m_provident_fund_types"
        
)
public class MProvidentFundTypes  implements java.io.Serializable {


     private Integer pfId;
     private String pfName;
     private String pfDesc;
     private int createdBy;
     private Date createdDate;
     private int modifiedBy;
     private Date modifiedDate;
     private String isActive;

    public MProvidentFundTypes() {
    }

    public MProvidentFundTypes(Integer pfId) {
    	this.pfId = pfId;
    }
	
    public MProvidentFundTypes(int createdBy, Date createdDate, int modifiedBy, Date modifiedDate) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }
    public MProvidentFundTypes(String pfName, String pfDesc, int createdBy, Date createdDate, int modifiedBy, Date modifiedDate, String isActive) {
       this.pfName = pfName;
       this.pfDesc = pfDesc;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
       this.modifiedBy = modifiedBy;
       this.modifiedDate = modifiedDate;
       this.isActive = isActive;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Pf_Id", unique=true, nullable=false)
    public Integer getPfId() {
        return this.pfId;
    }
    
    public void setPfId(Integer pfId) {
        this.pfId = pfId;
    }

    
    @Column(name="Pf_Name", length=50)
    public String getPfName() {
        return this.pfName;
    }
    
    public void setPfName(String pfName) {
        this.pfName = pfName;
    }

    
    @Column(name="Pf_Desc", length=100)
    public String getPfDesc() {
        return this.pfDesc;
    }
    
    public void setPfDesc(String pfDesc) {
        this.pfDesc = pfDesc;
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

    
    @Column(name="Is_Active", length=2)
    public String getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }




}


