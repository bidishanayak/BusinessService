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
import com.pwc.newproject.repository.ServiceCategoryRepository;

@Service
public class ServiceCategoryService {
	
	@CreatedBy
	private String createdBy;
	
	@CreatedDate
	private Date createDate;
	
	@LastModifiedBy
	private String updatedBy;
	
	@LastModifiedDate
	private Date updateDate;

	@Autowired
	ServiceCategoryRepository ServiceCategoryRepository;

	public ServiceCategory saveCategory(ServiceCategory category) {
		return new ServiceCategory();
	}

	// CREATE
	public ServiceCategory createServiceCategory(ServiceCategory sc) {
		
		Date createdDate = new Date(System.currentTimeMillis());

		return ServiceCategoryRepository.save(sc);
	}

	// READ
	public List<ServiceCategory> getServiceCategory() {
		return ServiceCategoryRepository.findAll();
	}

	// UPDATE
	public ServiceCategory updateServiceCategory( ServiceCategory detailsServiceCategory) {
		Date createdDate = new Date(System.currentTimeMillis());

		return ServiceCategoryRepository.save(detailsServiceCategory);
		
		
			
		}
		
		
		public boolean getServiceCategoryFindBycode(String code) {
			if (code == null)
			{
				return false;
			} else {
				ServiceCategory sc = ServiceCategoryRepository.findBycode(code);
				System.out.println(sc);
				if (sc == null) {
					return true;
				} else {
					return false;
					//return thm == code;
				}
			}

	}
}
	
