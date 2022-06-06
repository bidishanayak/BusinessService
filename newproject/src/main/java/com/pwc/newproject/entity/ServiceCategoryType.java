package com.pwc.newproject.entity;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "Service_category_type")
public class ServiceCategoryType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long typeId;

	@OneToMany(targetEntity=ServiceCategory.class, fetch = FetchType.EAGER)
	@JoinColumn(name="category_id")
	
	private List<ServiceCategory> List = new ArrayList<>();
	@Column(name= "CreatedBy")
    private String createdBy;
	
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name= "CreatedDate")
    private Date createdDate; //= new Date(System.currentTimeMillis());
	
    @Column(name= "UpdatedBy")
    private String updatedBy;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name= "UpdatedDate")
    private Date updatedDate; //= new Date(System.currentTimeMillis());
	
	@Column(name = "Code")
	private String code;

	@Column(name = "voucher_Creation_Enabled")
	private boolean voucherCreationEnabled;

	@Column(name = "fund")
	private String fund;

	@Column(name = "function")
	private String function;

	@Column(name = "department")
	private String department;

	@Column(name = "functionary")
	private String functionary;
	
	@Column(name = "scheme")
	private String scheme;
	
	@Column(name = "subScheme")
	private String subScheme;
	
	@Column(name = "validFrom")
	private Long validFrom;

	@Column(name = "validTo")
	private Long validTO;

	@Column(name = "fromDate")
	private String fromDate;

	@Column(name = "toDate")
	private String toDate;

	@Column(name = "periodCycle")

	private String periodCycle;

	@Column(name = "service")
	private String service;
	

	@Column(name = "financialYear")
	private String financialYear;

	@Column(name = "service_category_id")
	private Long service_category_id;

	
	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isVoucherCreationEnabled() {
		return voucherCreationEnabled;
	}

	public void setVoucherCreationEnabled(boolean voucherCreationEnabled) {
		this.voucherCreationEnabled = voucherCreationEnabled;
	}

	public String getFund() {
		return fund;
	}

	public void setFund(String fund) {
		this.fund = fund;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFunctionary() {
		return functionary;
	}

	public void setFunctionary(String functionary) {
		this.functionary = functionary;
	}

	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getSubScheme() {
		return subScheme;
	}

	public void setSubScheme(String subScheme) {
		this.subScheme = subScheme;
	}

	public Long getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Long validFrom) {
		this.validFrom = validFrom;
	}

	public Long getValidTO() {
		return validTO;
	}

	public void setValidTO(Long validTO) {
		this.validTO = validTO;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getPeriodCycle() {
		return periodCycle;
	}

	public void setPeriodCycle(String periodCycle) {
		this.periodCycle = periodCycle;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getFinancialYear() {
		return financialYear;
	}

	public void setFinancialYear(String financialYear) {
		this.financialYear = financialYear;
	}

	public Long getService_category_id() {
		return service_category_id;
 }

	public void setService_category_id(Long service_category_id) {
		this.service_category_id = service_category_id;
		
		
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the updatedDate
	 */
	public Date getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * @param updatedDate the updatedDate to set
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	
	}

	
	



