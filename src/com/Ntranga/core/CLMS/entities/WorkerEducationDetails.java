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
 * WorkerEducationDetails generated by hbm2java
 */
@Entity
@Table(name="worker_education_details"
   
)
public class WorkerEducationDetails  implements java.io.Serializable {


     private Integer workerEducationId;
     private WorkerDetails workerDetails;
     private CustomerDetails customerDetails;
     private VendorDetails vendorDetails;
     private CompanyDetails companyDetails;
    // private String skillType;
     private String educationalLevel;
     private String degreeName;
     private String modeOfEducation;
     private String institutionName;
     private Integer yearOfPassing;
     private String percentageOrGrade;
     private byte[] certificate;
     private String filePath;
     private int createdBy;
     private Date createdDate;
     private int modifiedBy;
     private Date modifiedDate;

    public WorkerEducationDetails() {
    }

	
    public WorkerEducationDetails(WorkerDetails workerDetails, CustomerDetails customerDetails, VendorDetails vendorDetails, CompanyDetails companyDetails,  int createdBy, Date createdDate, int modifiedBy, Date modifiedDate) {
        this.workerDetails = workerDetails;
        this.customerDetails = customerDetails;
        this.vendorDetails = vendorDetails;
        this.companyDetails = companyDetails;
        //this.skillType = skillType;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }
    public WorkerEducationDetails(WorkerDetails workerDetails, CustomerDetails customerDetails, VendorDetails vendorDetails, CompanyDetails companyDetails,  String educationLevel, String degreeName, String modeOfEducation, String institutionName, Integer yearOfPassing, String percentageOrGrade, byte[] certificate, int createdBy, Date createdDate, int modifiedBy, Date modifiedDate) {
       this.workerDetails = workerDetails;
       this.customerDetails = customerDetails;
       this.vendorDetails = vendorDetails;
       this.companyDetails = companyDetails;
       //this.skillType = skillType;
       this.educationalLevel = educationLevel;
       this.degreeName = degreeName;
       this.modeOfEducation = modeOfEducation;
       this.institutionName = institutionName;
       this.yearOfPassing = yearOfPassing;
       this.percentageOrGrade = percentageOrGrade;
       this.certificate = certificate;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
       this.modifiedBy = modifiedBy;
       this.modifiedDate = modifiedDate;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Worker_Education_Id", unique=true, nullable=false)
    public Integer getWorkerEducationId() {
        return this.workerEducationId;
    }
    
    public void setWorkerEducationId(Integer workerEducationId) {
        this.workerEducationId = workerEducationId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Worker_Id", nullable=false)
    public WorkerDetails getWorkerDetails() {
        return this.workerDetails;
    }
    
    public void setWorkerDetails(WorkerDetails workerDetails) {
        this.workerDetails = workerDetails;
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
    @JoinColumn(name="Vendor_Id", nullable=false)
    public VendorDetails getVendorDetails() {
        return this.vendorDetails;
    }
    
    public void setVendorDetails(VendorDetails vendorDetails) {
        this.vendorDetails = vendorDetails;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Company_Id", nullable=false)
    public CompanyDetails getCompanyDetails() {
        return this.companyDetails;
    }
    
    public void setCompanyDetails(CompanyDetails companyDetails) {
        this.companyDetails = companyDetails;
    }

    
    /*@Column(name="Skill_Type", nullable=false, length=45)
    public String getSkillType() {
        return this.skillType;
    }
    
    public void setSkillType(String skillType) {
        this.skillType = skillType;
    }*/

    
    @Column(name="Educational_Level", length=45)
    public String getEducationalLevel() {
        return this.educationalLevel;
    }
    
    public void setEducationalLevel(String educationalLevel) {
        this.educationalLevel = educationalLevel;
    }

    
    @Column(name="Degree_Name", length=45)
    public String getDegreeName() {
        return this.degreeName;
    }
    
    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    
    @Column(name="Mode_Of_Education", length=45)
    public String getModeOfEducation() {
        return this.modeOfEducation;
    }
    
    public void setModeOfEducation(String modeOfEducation) {
        this.modeOfEducation = modeOfEducation;
    }

    
    @Column(name="Institution_Name", length=45)
    public String getInstitutionName() {
        return this.institutionName;
    }
    
    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    @Column(name="Year_Of_Passing", length=4)
    public Integer getYearOfPassing() {
        return this.yearOfPassing;
    }
    
    public void setYearOfPassing(Integer yearOfPassing) {
        this.yearOfPassing = yearOfPassing;
    }

    
    @Column(name="Percentage_Or_Grade", length=45)
    public String getPercentageOrGrade() {
        return this.percentageOrGrade;
    }
    
    public void setPercentageOrGrade(String percentageOrGrade) {
        this.percentageOrGrade = percentageOrGrade;
    }

    
    @Column(name="Certificate")
    public byte[] getCertificate() {
        return this.certificate;
    }
    
    public void setCertificate(byte[] certificate) {
        this.certificate = certificate;
    }

    @Column(name="File_Path")
    public String getFilepath() {
        return this.filePath;
    }
    
    public void setFilepath(String filePath) {
        this.filePath = filePath;
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


