package com.pwc.newproject.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.stereotype.Service;

import com.pwc.newproject.entity.ServiceCategory;
import com.pwc.newproject.entity.ServiceCategoryType;
import com.pwc.newproject.entity.TaxHeaderMaster;
import com.pwc.newproject.repository.ServiceCategoryTypeRepository;

@Service
public class ServiceCategoryTypeService {
	@Autowired
	ServiceCategoryTypeRepository sctRepository;
	
	@CreatedBy
	private String createdBy;
	
	@CreatedDate
	private Date createDate;
	
	@LastModifiedBy
	private String updatedBy;
	
	@LastModifiedDate
	private Date updateDate;


	// CREATE
	public ServiceCategoryType createServiceCategoryType(ServiceCategoryType sct) {
		
		Date createdDate = new Date(System.currentTimeMillis());
		return sctRepository.save(sct);
	}

	// READ
	public List<ServiceCategoryType> getServiceCategoryType() {
		return sctRepository.findAll();
	}

	// UPDATE
	public ServiceCategoryType updateServiceCategoryType( ServiceCategoryType detailsServiceCategoryType) {
		Date createdDate = new Date(System.currentTimeMillis());
		return sctRepository.save(detailsServiceCategoryType);
	}

	public boolean getServiceCategoryTypefindByservice(String service) {
		if (service == null) {
			return false;
		} else {
			ServiceCategoryType sct = sctRepository.findByservice(service) ;
			System.out.println(sct);
			if (sct == null) {
				return true;
			} else {
				return false;
				
}
	}
	
}
}
