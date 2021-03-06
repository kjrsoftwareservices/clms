package com.Ntranga.core.CLMS.entities;
// Generated Jun 16, 2016 7:00:29 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MAddressType generated by hbm2java
 */
@Entity
@Table(name="m_address_type"
    
)
public class MAddressType  implements java.io.Serializable {


     private Integer addressTypeId;
     private String addressTypeName;
     private int createdBy;
     private Date createdDate;
     private int modifiedBy;
     private Date modifiedDate;
     private Set<CustomerAddress> customerAddresses = new HashSet<CustomerAddress>(0);
     private Set<CompanyAddress> companyAddresses = new HashSet<CompanyAddress>(0);

    public MAddressType() {
    }

	
    public MAddressType(String addressTypeName, int createdBy, Date createdDate, int modifiedBy, Date modifiedDate) {
        this.addressTypeName = addressTypeName;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }
    public MAddressType(String addressTypeName, int createdBy, Date createdDate, int modifiedBy, Date modifiedDate, Set<CustomerAddress> customerAddresses, Set<CompanyAddress> companyAddresses) {
       this.addressTypeName = addressTypeName;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
       this.modifiedBy = modifiedBy;
       this.modifiedDate = modifiedDate;
       this.customerAddresses = customerAddresses;
       this.companyAddresses = companyAddresses;
    }
   
     public MAddressType(int addressTypeId) {
    	 this.addressTypeId = addressTypeId;
	}
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Address_Type_Id", unique=true, nullable=false)
    public Integer getAddressTypeId() {
        return this.addressTypeId;
    }
    
    public void setAddressTypeId(Integer addressTypeId) {
        this.addressTypeId = addressTypeId;
    }

    
    @Column(name="Address_Type_Name", nullable=false, length=45)
    public String getAddressTypeName() {
        return this.addressTypeName;
    }
    
    public void setAddressTypeName(String addressTypeName) {
        this.addressTypeName = addressTypeName;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="MAddressType")
    public Set<CustomerAddress> getCustomerAddresses() {
        return this.customerAddresses;
    }
    
    public void setCustomerAddresses(Set<CustomerAddress> customerAddresses) {
        this.customerAddresses = customerAddresses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="MAddressType")
    public Set<CompanyAddress> getCompanyAddresses() {
        return this.companyAddresses;
    }
    
    public void setCompanyAddresses(Set<CompanyAddress> companyAddresses) {
        this.companyAddresses = companyAddresses;
    }



}


