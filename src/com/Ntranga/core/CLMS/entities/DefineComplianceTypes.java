package com.Ntranga.core.CLMS.entities;
// Generated Jun 27, 2016 3:48:14 PM by Hibernate Tools 3.6.0


import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * VendorBranches generated by hbm2java
 */
@Entity
@Table(name="Define_Compliance_Types"
    
)
public class DefineComplianceTypes  implements java.io.Serializable {


     private Integer defineComplianceTypeId;
     private CustomerDetails customerDetails;   
     private CompanyDetails companyDetails;
     private LocationDetails locationDetails;
     private String complianceCode;
     private Integer country;
     private Integer sequenceId;
     private Date transactionDate;
     private String complianceAct;
     private String doccumentName;
     private String doccumentDescription;
     private String applicableTo;
     private String frequency;     
     private String isActive;
     private int createdBy;
     private Date createdDate;
     private int modifiedBy;
     private Date modifiedDate;
     private Integer complianceUniqueId;
     private String isMandatory;
     
     
     public DefineComplianceTypes( ) {
	}
     
     
     public DefineComplianceTypes(Integer defineComplianceTypeId) {
    	 this.defineComplianceTypeId = defineComplianceTypeId;
	}
     
     
     
     
	public DefineComplianceTypes(Integer defineComplianceTypeId,
			CustomerDetails customerDetails, CompanyDetails companyDetails,LocationDetails locationDetails,
			String complianceCode, Integer country, Integer sequenceId,
			Date transactionDate, String complianceAct, String doccumentName,
			String doccumentDescription, String applicableTo, String frequency,
			String isActive, int createdBy, Date createdDate, int modifiedBy,
			Date modifiedDate, Integer complianceUniqueId, String isMandatory) {
		this.defineComplianceTypeId = defineComplianceTypeId;
		this.customerDetails = customerDetails;
		this.companyDetails = companyDetails;
		this.complianceCode = complianceCode;
		this.country = country;
		this.sequenceId = sequenceId;
		this.transactionDate = transactionDate;
		this.complianceAct = complianceAct;
		this.doccumentName = doccumentName;
		this.doccumentDescription = doccumentDescription;
		this.applicableTo = applicableTo;
		this.frequency = frequency;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.complianceUniqueId = complianceUniqueId;
		this.setIsMandatory(isMandatory);
	}


	@Id @GeneratedValue(strategy=IDENTITY)

     
     @Column(name="Define_Compliance_Type_Id", unique=true, nullable=false)
	public Integer getDefineComplianceTypeId() {
		return defineComplianceTypeId;
	}
	public void setDefineComplianceTypeId(Integer defineComplianceTypeId) {
		this.defineComplianceTypeId = defineComplianceTypeId;
	}
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Customer_Id", nullable=false)
    public CustomerDetails getCustomerDetails() {
        return this.customerDetails;
    }
    
    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Company_Id", nullable=false)
    public CompanyDetails getCompanyDetails() {
        return this.companyDetails;
    }
    
    public void setCompanyDetails(CompanyDetails companyDetails) {
        this.companyDetails = companyDetails;
    }
    
    
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Location_Id", nullable=false)
	public LocationDetails getLocationDetails() {
		return locationDetails;
	}


	public void setLocationDetails(LocationDetails locationDetails) {
		this.locationDetails = locationDetails;
	}


	@Column(name="Compliance_Code", nullable=false, length=45)
	public String getComplianceCode() {
		return complianceCode;
	}
	public void setComplianceCode(String complianceCode) {
		this.complianceCode = complianceCode;
	}
	
	@Column(name="Country", nullable=false)
    public Integer getCountry() {
        return this.country;
    }
    
    public void setCountry(Integer country) {
        this.country = country;
    }
	
    @Column(name="Sequence_Id", nullable=false)
	public Integer getSequenceId() {
		return sequenceId;
	}
	public void setSequenceId(Integer sequenceId) {
		this.sequenceId = sequenceId;
	}
	
	@Temporal(TemporalType.DATE)
    @Column(name="Transaction_Date", nullable=false, length=10)
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	@Column(name="Compliance_Act", nullable=false, length=45)
	public String getComplianceAct() {
		return complianceAct;
	}
	public void setComplianceAct(String complianceAct) {
		this.complianceAct = complianceAct;
	}
	
	@Column(name="Doccument_Name", nullable=false, length=45)
	public String getDoccumentName() {
		return doccumentName;
	}
	public void setDoccumentName(String doccumentName) {
		this.doccumentName = doccumentName;
	}
	
	@Column(name="Doccument_Description", nullable=false, length=100)
	public String getDoccumentDescription() {
		return doccumentDescription;
	}
	public void setDoccumentDescription(String doccumentDescription) {
		this.doccumentDescription = doccumentDescription;
	}
	
	@Column(name="Applicable_To", nullable=false, length=45)
	public String getApplicableTo() {
		return applicableTo;
	}
	public void setApplicableTo(String applicableTo) {
		this.applicableTo = applicableTo;
	}
	
	@Column(name="Frequency", nullable=false, length=45)
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	
	@Column(name="Is_Active", nullable=false, length=2)
	public String getIsActive() {
		return isActive;
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
    @Column(name="Created_date", nullable=false, length=19)
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

    @Column(name="Compliance_Unique_Id", length=11)
	public Integer getComplianceUniqueId() {
		return complianceUniqueId;
	}

	public void setComplianceUniqueId(Integer complianceUniqueId) {
		this.complianceUniqueId = complianceUniqueId;
	}

	@Column(name="Is_Mandatory", length = 2)
	public String getIsMandatory() {
		return isMandatory;
	}

	public void setIsMandatory(String isMandatory) {
		this.isMandatory = isMandatory;
	}

     
     
     
     
}