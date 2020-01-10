package com.Ntranga.core.CLMS.entities;
// Generated 20 Jul, 2016 1:01:39 PM by Hibernate Tools 3.6.0


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
 * WorkerEmploymentDetails generated by hbm2java
 */
@Entity
@Table(name="worker_employment_details"
   
)
public class WorkerEmploymentDetails  implements java.io.Serializable {


     private Integer employmentDetailsId;
     private CustomerDetails customerDetails;
     private CompanyDetails companyDetails;
     private VendorDetails vendorId;
     private WorkerDetails workerId;
     private String organizationName;
     private String contactNumber;
     private String designation;
     private String current;
     private Date startDate;
     private Date endDate;
     private Integer totalYears;
     private int createdBy;
     private Date createdDate;
     private int modifiedBy;
     private Date modifiedDate;
     private String filePath;

    public WorkerEmploymentDetails() {
    }

	
    public WorkerEmploymentDetails(CustomerDetails customerDetails, CompanyDetails companyDetails, Integer totalYears, VendorDetails vendorId, WorkerDetails workerId, int createdBy, Date createdDate, int modifiedBy, Date modifiedDate) {
        this.customerDetails = customerDetails;
        this.companyDetails = companyDetails;
        this.totalYears = totalYears;
        this.vendorId = vendorId;
        this.workerId = workerId;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }
    public WorkerEmploymentDetails(CustomerDetails customerDetails, CompanyDetails companyDetails, Integer totalYears, String filePath, VendorDetails vendorId, WorkerDetails workerId, String organizationName, String contactNumber, String designation, String current, Date startDate, Date endDate, int createdBy, Date createdDate, int modifiedBy, Date modifiedDate) {
       this.customerDetails = customerDetails;
       this.companyDetails = companyDetails;
       this.vendorId = vendorId;
       this.workerId = workerId;
       this.organizationName = organizationName;
       this.contactNumber = contactNumber;
       this.designation = designation;
       this.current = current;
       this.startDate = startDate;
       this.endDate = endDate;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
       this.modifiedBy = modifiedBy;
       this.modifiedDate = modifiedDate;
       this.filePath = filePath;
       this.totalYears = totalYears;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Employment_Details_Id", unique=true, nullable=false)
    public Integer getEmploymentDetailsId() {
        return this.employmentDetailsId;
    }
    
    public void setEmploymentDetailsId(Integer employmentDetailsId) {
        this.employmentDetailsId = employmentDetailsId;
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
    @JoinColumn(name="Vendor_Id", nullable=false)
    public VendorDetails getVendorId() {
        return this.vendorId;
    }
    
    public void setVendorId(VendorDetails vendorId) {
        this.vendorId = vendorId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Worker_Id", nullable=false)
    public WorkerDetails getWorkerId() {
        return this.workerId;
    }
    
    public void setWorkerId(WorkerDetails workerId) {
        this.workerId = workerId;
    }

    
    @Column(name="Organization_Name", length=45)
    public String getOrganizationName() {
        return this.organizationName;
    }
    
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    
    @Column(name="Contact_Number", length=45)
    public String getContactNumber() {
        return this.contactNumber;
    }
    
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    
    @Column(name="Designation", length=45)
    public String getDesignation() {
        return this.designation;
    }
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    
    @Column(name="Current", length=2)
    public String getCurrent() {
        return this.current;
    }
    
    public void setCurrent(String current) {
        this.current = current;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Start_Date", length=10)
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="End_Date", length=10)
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    @Column(name="File_Path", length=255)
    public String getFilePath() {
        return this.filePath;
    }
    
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Column(name="Total_Years", length=2)
    public Integer getTotalYears() {
        return this.totalYears;
    }
    
    public void setTotalYears(Integer totalYears) {
        this.totalYears = totalYears;
    }

}

