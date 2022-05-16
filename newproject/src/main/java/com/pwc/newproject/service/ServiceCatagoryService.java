package com.pwc.newproject.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pwc.newproject.entity.ServiceCatagory;
import com.pwc.newproject.repository.ServiceCatagoryRepository;

@Service
public class ServiceCatagoryService {

	@Autowired
	ServiceCatagoryRepository ServiceCatagoryRepository;

	public ServiceCatagory saveCatagory(ServiceCatagory catagory) {
		return new ServiceCatagory();
	}

	// CREATE
	public ServiceCatagory createServiceCatagory(ServiceCatagory Id) {
		return ServiceCatagoryRepository.save(Id);
	}

	// READ
	public List<ServiceCatagory> getServiceCatagory() {
		return ServiceCatagoryRepository.findAll();
	}

	// DELETE
	public void deleteServiceCatagory(Long ServiceCatagoryId) {
		ServiceCatagoryRepository.deleteById(ServiceCatagoryId);
	}

	// UPDATE
	public ServiceCatagory updateServiceCatagory( ServiceCatagory detailsServiceCatagory) {
		//Long ServiceCatagoryId,
		/*ServiceCatagory sc = ServiceCatagoryRepository.findById(ServiceCatagoryId).get();

		sc.setBusinessService(DetailsServiceCatagory.getBusinessService());

		sc.setCode(DetailsServiceCatagory.getCode());

		sc.setPartPaymentAllowed(DetailsServiceCatagory.isPartPaymentAllowed());

		sc.setAdvanceAllowed(DetailsServiceCatagory.isAdvanceAllowed());

		sc.setVoucherCreationEnabled(DetailsServiceCatagory.isVoucherCreationEnabled());

		sc.setType(DetailsServiceCatagory.getType());

		//sc.setId(DetailsServiceCatagory.getId());
		
		
		*/
		return ServiceCatagoryRepository.save(detailsServiceCatagory);

	}
}
