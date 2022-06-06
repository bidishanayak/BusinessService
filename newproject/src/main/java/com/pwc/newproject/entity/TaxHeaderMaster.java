package com.pwc.newproject.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tax_header_master")
public class TaxHeaderMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="category_type_id")
	private ServiceCategoryType sct;
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
	
	
	@Column(name = "categoryId")
	private Long categoryId;
	
	@Column(name = "Category")
	private String category;
	
	@Column(name = "Service")
	private String service;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Code")
	private String code;
	
	@Column(name = "isDabit")
	private boolean isDabit;
	
	@Column(name = "isActualDemand")
	private boolean isActualDemand;
	
	@Column(name = "taxHeadOrder")
	private String taxHeadOrder;
	
	@Column(name = "isRequired")
	private boolean isRequire;
	
	@Column(name = "billingServiceCode")
	private String billingServiceCode;
	
	@Column(name = "taxHead")
	private String taxHead;
	
	@Column(name = "glCode")
	private Long glCode;
	
	@Column(name = "validFrom")
	private Long validFrom ;
	
	@Column(name = "validTo")
	private Long validTo ;
	
	@Column(name = "serviceCatagoryTypeId")
	private Long serviceCatagoryTypeId ;

	
	
	public Long getId() {
		return id;
	}

	
	public void setId(Long id) {
		id = id;
	}

	
	public ServiceCategoryType getSct() {
		return sct;
	}

	
	public void setSct(ServiceCategoryType sct) {
		this.sct = sct;
	}

	
	public Long getCategoryId() {
		return categoryId;
	}

	
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	
	public String getCategory() {
		return category;
	}

	
	public void setCategory(String category) {
		this.category = category;
	}

	
	public String getService() {
		return service;
	}

	
	public void setService(String service) {
		this.service = service;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getCode() {
		return code;
	}

	
	public void setCode(String code) {
		this.code = code;
	}

	
	public boolean isDabit() {
		return isDabit;
	}

	
	public void setDabit(boolean isDabit) {
		this.isDabit = isDabit;
	}

	
	public boolean isActualDemand() {
		return isActualDemand;
	}

	
	public void setActualDemand(boolean isActualDemand) {
		this.isActualDemand = isActualDemand;
	}

	
	public String getTaxHeadOrder() {
		return taxHeadOrder;
	}

	
	public void setTaxHeadOrder(String taxHeadOrder) {
		this.taxHeadOrder = taxHeadOrder;
	}

	
	public boolean isRequire() {
		return isRequire;
	}

	
	public void setRequire(boolean isRequire) {
		this.isRequire = isRequire;
	}

	
	public String getBillingServiceCode() {
		return billingServiceCode;
	}

	
	public void setBillingServiceCode(String billingServiceCode) {
		this.billingServiceCode = billingServiceCode;
	}

	
	public String getTaxHead() {
		return taxHead;
	}

	
	public void setTaxHead(String taxHead) {
		this.taxHead = taxHead;
	}

	
	public Long getGlCode() {
		return glCode;
	}

	
	public void setGlCode(Long glCode) {
		this.glCode = glCode;
	}

	
	public Long getValidFrom() {
		return validFrom;
	}

	
	public void setValidFrom(Long validFrom) {
		this.validFrom = validFrom;
	}

	
	public Long getValidTo() {
		return validTo;
	}

	
	public void setValidTo(Long validTo) {
		this.validTo = validTo;
	}

	
	public Long getServiceCatagoryTypeId() {
		return serviceCatagoryTypeId;
	}

	
	public void setServiceCatagoryTypeId(Long serviceCatagoryTypeId) {
		this.serviceCatagoryTypeId = serviceCatagoryTypeId;
	}

	

	@Override
	public String toString() {
		return "TaxHeaderMaster [Id=" + id + ", sct=" + sct + ", Catagory=" + category + ", Service=" + service
				+ ", Name=" + name + ", Code=" + code + ", isDabit=" + isDabit + ", isActualDemand=" + isActualDemand
				+ ", taxHeadOrder=" + taxHeadOrder + ", isRequire=" + isRequire + ", billingServiceCode="
				+ billingServiceCode + ", taxHead=" + taxHead + ", glCode=" + glCode + ", validFrom=" + validFrom
				+ ", validTo=" + validTo + ", serviceCatagoryTypeId=" + serviceCatagoryTypeId + "]";
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
