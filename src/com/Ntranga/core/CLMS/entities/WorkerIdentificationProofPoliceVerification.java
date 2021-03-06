package com.Ntranga.core.CLMS.entities;
// Generated Jul 17, 2016 4:55:33 PM by Hibernate Tools 3.6.0


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * WorkJobDetails generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name="Worker_Identification_Proof_Police_Verification")
public class WorkerIdentificationProofPoliceVerification  implements java.io.Serializable {

	private Integer workerIdentificationProofPoliceVerificationId;  
     private CustomerDetails customerDetails;
  
     private CompanyDetails companyDetails;
     private String identityType;    
     private String identificationNumber;
     private String identityPlaceOfIssue;
     private Date identityDateOfIssue;     
     private Integer createdBy;
     private Date createdDate;
     private Integer modifiedBy;
     private Date modifiedDate;
     
     private WorkerPoliceVerification workerPoliceVerification;
    

    public WorkerIdentificationProofPoliceVerification() {
    }

	
    public WorkerIdentificationProofPoliceVerification(CustomerDetails customerDetails, CompanyDetails companyDetails, Integer createdBy, Date createdDate, Integer modifiedBy, Date modifiedDate) {
       
        this.customerDetails = customerDetails;      
        this.companyDetails = companyDetails;    
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }
    
   


	@Id 
    @GeneratedValue(strategy=IDENTITY)
    @Column(name="Worker_Identification_Proof_PoliceVerification_Id", unique=true, nullable=false)
    public Integer getWorkerIdentificationProofPoliceVerificationId() {
		return workerIdentificationProofPoliceVerificationId;
	}


	public void setWorkerIdentificationProofPoliceVerificationId(Integer workerIdentificationProofPoliceVerificationId) {
		this.workerIdentificationProofPoliceVerificationId = workerIdentificationProofPoliceVerificationId;
	}
	
	
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="police_Verification_Id", nullable=false)
    public WorkerPoliceVerification getWorkerPoliceVerification() {
        return this.workerPoliceVerification;
    }
    
    public void setWorkerPoliceVerification(WorkerPoliceVerification workerPoliceVerification) {
        this.workerPoliceVerification = workerPoliceVerification;
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

  
    @Column(name="Created_By", nullable=false)
    public Integer getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(Integer createdBy) {
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
    public Integer getModifiedBy() {
        return this.modifiedBy;
    }
    
    public void setModifiedBy(Integer modifiedBy) {
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

    @Column(name="Identity_Type")
	public String getIdentityType() {
		return identityType;
	}


	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	 @Column(name="Identification_Number")
	public String getIdentificationNumber() {
		return identificationNumber;
	}


	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	 @Column(name="Identity_Place_Of_Issue")
	public String getIdentityPlaceOfIssue() {
		return identityPlaceOfIssue;
	}


	public void setIdentityPlaceOfIssue(String identityPlaceOfIssue) {
		this.identityPlaceOfIssue = identityPlaceOfIssue;
	}

	 @Column(name="Identity_Date_Of_Issue")
	public Date getIdentityDateOfIssue() {
		return identityDateOfIssue;
	}


	public void setIdentityDateOfIssue(Date identityDateOfIssue) {
		this.identityDateOfIssue = identityDateOfIssue;
	}

   

    

}


