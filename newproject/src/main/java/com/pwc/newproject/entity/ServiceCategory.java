package com.pwc.newproject.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "service_category")
public class ServiceCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToMany(targetEntity=ServiceCategoryType.class,cascade = CascadeType.PERSIST)
	@JoinColumn(name="catagory_type_id",referencedColumnName="id")
	private List<ServiceCategoryType> typeList = new ArrayList<>();
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
  
	@Column(name = "business_Service")
	private String businessService;

	@Column(name = "code")
	private String code;

	@Column(name = "part_Payment_Allowed")
	private boolean partPaymentAllowed;

	@Column(name = "isAdvanceAllowed")
	private boolean isAdvanceAllowed;

	@Column(name = "is_Voucher_Creation_Enabled")
	private boolean isVoucherCreationEnabled;

	@Column(name = "is_Active")
	private boolean isActive;

	@Column(name = "type")
	private String type;

	public List<ServiceCategoryType> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<ServiceCategoryType> typeList) {
		this.typeList = typeList;
	}

	public String getBusinessService() {
		return businessService;
	}

	public void setBusinessService(String businessService) {
		this.businessService = businessService;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isPartPaymentAllowed() {
		return partPaymentAllowed;
	}

	public void setPartPaymentAllowed(boolean partPaymentAllowed) {
		this.partPaymentAllowed = partPaymentAllowed;
		
		
	}

	public boolean isAdvanceAllowed() {
		return isAdvanceAllowed;
	}

	public void setAdvanceAllowed(boolean isAdvanceAllowed) {
		this.isAdvanceAllowed = isAdvanceAllowed;
	}

	public boolean isVoucherCreationEnabled() {
		return isVoucherCreationEnabled;
	}

	public void setVoucherCreationEnabled(boolean isVoucherCreationEnabled) {
		this.isVoucherCreationEnabled = isVoucherCreationEnabled;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
