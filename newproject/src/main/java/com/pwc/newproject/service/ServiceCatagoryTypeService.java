package com.pwc.newproject.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pwc.newproject.entity.ServiceCatagory;
import com.pwc.newproject.entity.ServiceCatagoryType;
import com.pwc.newproject.repository.ServiceCatagoryTypeRepository;

@Service
public class ServiceCatagoryTypeService {
	@Autowired
	ServiceCatagoryTypeRepository sctRepository;
	//SEARCH
	/*public String getServiceCatagoryType(Long catagoryid, Long catagoryTypeid) {
	if (catagoryid == null)
	{
		return "catagoryType cannot be Blank" ;
}else {
	if(catagoryTypeid == null) 
		return"please select Catagory Type";
				
	
else {

		return sctRepository.findById(catagoryTypeid).toString();
		
	

}
 }
	}*/
	

	// CREATE
	public ServiceCatagoryType createServiceCatagoryType(ServiceCatagoryType sct) {
		return sctRepository.save(sct);
	}

	// READ
	public List<ServiceCatagoryType> getServiceCatagoryType() {
		return sctRepository.findAll();
	}

	// DELETE
	public void deleteServiceCatagoryType(Long sctId) {
		sctRepository.deleteById(sctId);
	}

	// UPDATE
	public ServiceCatagoryType updateServiceCatagoryType( ServiceCatagoryType detailsServiceCatagoryType) {
		//Long sctId,
		/*ServiceCatagoryType sct = sctRepository.findById(sctId).get();

		sct.setCode(detailsServiceCatagoryType.getCode());

		sct.setVoucherCreationEnabled(DetailsServiceCatagoryType.isVoucherCreationEnabled());

		sct.setFunction(DetailsServiceCatagoryType.getFunction());

		sct.setDepartment(DetailsServiceCatagoryType.getDepartment());

		sct.setFunctionary(DetailsServiceCatagoryType.getFunctionary());

		sct.setScheme(DetailsServiceCatagoryType.getScheme());

		sct.setSubScheme(DetailsServiceCatagoryType.getSubScheme());

		sct.setValidFrom(DetailsServiceCatagoryType.getValidFrom());

		sct.setValidTO(DetailsServiceCatagoryType.getValidTO());

		sct.setFromDate(DetailsServiceCatagoryType.getFromDate());

		sct.setToDate(DetailsServiceCatagoryType.getToDate());

		sct.setPeriodCycle(DetailsServiceCatagoryType.getPeriodCycle());

		sct.setService(DetailsServiceCatagoryType.getService());

		sct.setFinancialYear(DetailsServiceCatagoryType.getFinancialYear());

		//sct.setCatagory(DetailsServiceCatagoryType.getCatagory());

		*/
		return sctRepository.save(detailsServiceCatagoryType);

	}
}

