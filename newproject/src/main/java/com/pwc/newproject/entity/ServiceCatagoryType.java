package com.pwc.newproject.entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Service_catagory_type")
public class ServiceCatagoryType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long typeId;

	@OneToMany(targetEntity=ServiceCatagory.class, fetch = FetchType.EAGER)
	@JoinColumn(name="catagory_id")
	//@JoinColumn(name = "catagory_id")
	//@JsonIgnoreProperties("typeList")
	//@Column(name = "catagory_id")
	private List<ServiceCatagory> List = new ArrayList<>();

	
	
	//@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	//@ManyToMany(fetch = FetchType.EAGER, mappedBy = "ServiceCatagoryType", cascade = CascadeType.ALL)
	//@JsonIgnoreProperties("typeList")
	//private List <TaxHeaderMaster> master = new ArrayList<>();
	
	
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
	// private String code;

	@Column(name = "financialYear")
	private String financialYear;

	@Column(name = "service_catagory_id")
	private Long service_catagory_id;

	//private ServiceCatagory catagory;

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	/*
	 * public ServiceCatagory getCatagory() { return catagory; }
	 * 
	 * public void setCatagory(ServiceCatagory catagory) { this.catagory = catagory;
	 * }
	 */

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

	public Long getService_catagory_id() {
		return service_catagory_id;
 }

	public void setService_catagory_id(Long service_catagory_id) {
		this.service_catagory_id = service_catagory_id;
	}
	}

	/*@Override
	public String toString() {
		return "ServiceCatagoryType [typeId=" + typeId + ", List=" + List + ", code=" + code
				+ ", voucherCreationEnabled=" + voucherCreationEnabled + ", fund=" + fund + ", function=" + function
				+ ", department=" + department + ", functionary=" + functionary + ", scheme=" + scheme + ", subScheme="
				+ subScheme + ", validFrom=" + validFrom + ", validTO=" + validTO + ", fromDate=" + fromDate
				+ ", toDate=" + toDate + ", periodCycle=" + periodCycle + ", service=" + service + ", financialYear="
				+ financialYear + ", service_catagory_id=" + service_catagory_id + "]";
	}

}

*/	

	



