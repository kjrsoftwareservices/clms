package com.Ntranga.core.CLMS.entities;
// Generated Jun 17, 2016 10:42:43 AM by Hibernate Tools 3.6.0


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
 * CustomerContact generated by hbm2java
 */
@Entity
@Table(name="customer_contact"
    
)
public class CustomerContact  implements java.io.Serializable {


     private Integer contactId;
     private CustomerDetails customerDetails;
     private MContactType MContactType;
     private int addressUniqueId;
     private int contactSequenceId;
     private int contactUniqueId;
     private String contactName;
     private String contactNameOtherLanguage;
     private String mobileNumber;
     private String businessPhoneNumber;
     private String extensionNumber;
     private String emailId;
     private Date transactionDate;
     private String isActive;
     private int createdBy;
     private Date createdDate;
     private int modifiedBy;
     private Date modifiedDate;

    public CustomerContact() {
    }

	
    public CustomerContact(CustomerDetails customerDetails, MContactType MContactType, int addressUniqueId, int contactSequenceId, int contactUniqueId, String contactName, Date transactionDate, String isActive, int createdBy, Date createdDate, int modifiedBy, Date modifiedDate) {
        this.customerDetails = customerDetails;
        this.MContactType = MContactType;
        this.addressUniqueId = addressUniqueId;
        this.contactSequenceId = contactSequenceId;
        this.contactUniqueId = contactUniqueId;
        this.contactName = contactName;
        this.transactionDate = transactionDate;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }
    public CustomerContact(CustomerDetails customerDetails, MContactType MContactType, int addressUniqueId, int contactSequenceId, int contactUniqueId, String contactName, String contactNameOtherLanguage, String mobileNumber, String businessPhoneNumber, String extensionNumber, String emailId, Date transactionDate, String isActive, int createdBy, Date createdDate, int modifiedBy, Date modifiedDate) {
       this.customerDetails = customerDetails;
       this.MContactType = MContactType;
       this.addressUniqueId = addressUniqueId;
       this.contactSequenceId = contactSequenceId;
       this.contactUniqueId = contactUniqueId;
       this.contactName = contactName;
       this.contactNameOtherLanguage = contactNameOtherLanguage;
       this.mobileNumber = mobileNumber;
       this.businessPhoneNumber = businessPhoneNumber;
       this.extensionNumber = extensionNumber;
       this.emailId = emailId;
       this.transactionDate = transactionDate;
       this.isActive = isActive;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
       this.modifiedBy = modifiedBy;
       this.modifiedDate = modifiedDate;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Contact_Id", unique=true, nullable=false)
    public Integer getContactId() {
        return this.contactId;
    }
    
    public void setContactId(Integer contactId) {
        this.contactId = contactId;
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
    @JoinColumn(name="Contact_Type_Id", nullable=false)
    public MContactType getMContactType() {
        return this.MContactType;
    }
    
    public void setMContactType(MContactType MContactType) {
        this.MContactType = MContactType;
    }

    
    @Column(name="Address_Unique_Id", nullable=false)
    public int getAddressUniqueId() {
        return this.addressUniqueId;
    }
    
    public void setAddressUniqueId(int addressUniqueId) {
        this.addressUniqueId = addressUniqueId;
    }

    
    @Column(name="Contact_Sequence_Id", nullable=false)
    public int getContactSequenceId() {
        return this.contactSequenceId;
    }
    
    public void setContactSequenceId(int contactSequenceId) {
        this.contactSequenceId = contactSequenceId;
    }

    
    @Column(name="Contact_Unique_Id", nullable=false)
    public int getContactUniqueId() {
        return this.contactUniqueId;
    }
    
    public void setContactUniqueId(int contactUniqueId) {
        this.contactUniqueId = contactUniqueId;
    }

    
    @Column(name="Contact_Name", nullable=false, length=45)
    public String getContactName() {
        return this.contactName;
    }
    
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    
    @Column(name="Contact_Name_Other_Language", length=45)
    public String getContactNameOtherLanguage() {
        return this.contactNameOtherLanguage;
    }
    
    public void setContactNameOtherLanguage(String contactNameOtherLanguage) {
        this.contactNameOtherLanguage = contactNameOtherLanguage;
    }

    
    @Column(name="Mobile_Number", length=45)
    public String getMobileNumber() {
        return this.mobileNumber;
    }
    
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    
    @Column(name="Business_Phone_Number", length=45)
    public String getBusinessPhoneNumber() {
        return this.businessPhoneNumber;
    }
    
    public void setBusinessPhoneNumber(String businessPhoneNumber) {
        this.businessPhoneNumber = businessPhoneNumber;
    }

    
    @Column(name="Extension_Number", length=45)
    public String getExtensionNumber() {
        return this.extensionNumber;
    }
    
    public void setExtensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
    }

    
    @Column(name="Email_Id", length=45)
    public String getEmailId() {
        return this.emailId;
    }
    
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Transaction_Date", nullable=false, length=10)
    public Date getTransactionDate() {
        return this.transactionDate;
    }
    
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
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

