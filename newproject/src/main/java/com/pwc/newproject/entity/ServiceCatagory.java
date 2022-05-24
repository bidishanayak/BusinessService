package com.pwc.newproject.entity;

import java.util.ArrayList;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "service_catagory")
public class ServiceCatagory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	//@OneToMany( mappedBy = "catagory", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	//@JsonIgnoreProperties("catagory")
	//@JoinColumn(name = "catagory_type_id", referencedColumnName = "typeId")
	//@Column(name = "catagory_type_id")
	@OneToMany(targetEntity=ServiceCatagoryType.class,cascade = CascadeType.PERSIST)
	@JoinColumn(name="catagory_type_id",referencedColumnName="id")
	private List<ServiceCatagoryType> typeList = new ArrayList<>();
	
  // @Column(name = "tax_header_master")
   // private Long taxheadermaster;
	
   
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

	public List<ServiceCatagoryType> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<ServiceCatagoryType> typeList) {
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
		return Id;
	}

	public void setId(Long id) {
		this.Id = id;
	}

}
