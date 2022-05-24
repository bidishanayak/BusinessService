package com.pwc.newproject.entity;

import java.util.ArrayList;


//simport java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tax_header_master")
public class TaxHeaderMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="catagory_type_id")
	private ServiceCatagoryType sct;
	//,referencedColumnName="id")
	//private List<ServiceCatagoryType> typeList = new ArrayList<>();
	//@OneToMany(targetEntity=ServiceCatagory.class, fetch = FetchType.EAGER)
	//@OneToMany(cascade=CascadeType.ALL,targetEntity=ServiceCatagory.class)// fetch = FetchType.EAGER)
	//@JoinColumn(name="catagory_id")
	
	//private ServiceCatagory sc;
	@Column(name = "catagoryId")
	private Long catagoryId;
	
	@Column(name = "Catagory")
	private String Catagory;
	
	@Column(name = "Service")
	private String Service;
	
	@Column(name = "Name")
	private String Name;
	
	@Column(name = "Code")
	private String Code;
	
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
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	

	public ServiceCatagoryType getSct() {
		return sct;
	}

	public void setSct(ServiceCatagoryType sct) {
		this.sct = sct;
	}

	public String getCatagory() {
		return Catagory;
	}

	public void setCatagory(String catagory) {
		Catagory = catagory;
	}

	public String getService() {
		return Service;
	}

	public void setService(String service) {
		Service = service;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
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
		return "TaxHeaderMaster [Id=" + Id + ", sct=" + sct + ", Catagory=" + Catagory + ", Service=" + Service
				+ ", Name=" + Name + ", Code=" + Code + ", isDabit=" + isDabit + ", isActualDemand=" + isActualDemand
				+ ", taxHeadOrder=" + taxHeadOrder + ", isRequire=" + isRequire + ", billingServiceCode="
				+ billingServiceCode + ", taxHead=" + taxHead + ", glCode=" + glCode + ", validFrom=" + validFrom
				+ ", validTo=" + validTo + ", serviceCatagoryTypeId=" + serviceCatagoryTypeId + "]";
	}
	
	
}
