package com.pwc.newproject.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pwc.newproject.entity.ServiceCategory;
import com.pwc.newproject.service.ServiceCategoryService;

@RestController
@RequestMapping("/service_category")
public class ServiceCategoryController {
	@Autowired
	ServiceCategoryService scService;
	
	String userId = "123456";
	 private Date createdDate = new Date(System.currentTimeMillis());
	 
	 private Date updatedDate = new Date(System.currentTimeMillis());
	 
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createServiceCategory(@RequestBody ServiceCategory sc) {
		if (sc.getBusinessService() == null)
			return "BusinessService can't be Empty";
		if (sc.getCode() == null)
			return "Code can't be Empty";
		if (sc.getType() == null)
			return "Type can't be Empty";
		String returnValue = "";
		try {

			// code validation
			boolean isCodeUnique = scService.getServiceCategoryFindBycode(sc.getCode());
			System.out.println(isCodeUnique);
			/*
			if (codeResult == true) {
				System.out.println(codeResult);
			}else {
				
				(isCodeUniq == false)
				System.out.println(false);
				*/
			if (isCodeUnique) {
				//returnValue = "code is already in use";
				sc.setCreatedBy(userId);
				sc.setCreatedDate(createdDate);
				ServiceCategory servicecategory = scService.createServiceCategory(sc);
				returnValue = "ServiceCategory Successfully Created. Id=" + servicecategory.getId();
				System.out.println();
			}else {
				
				returnValue = "code is already used";
			
				 
			}
			
			//ServiceCategory servicecategory = scService.createServiceCategory(sc);
			
			//returnValue = "ServiceCategory Successfully Created. Id=" + servicecategory.getId();
			}
		 catch (Exception e) {
			e.printStackTrace();
			returnValue = "ServiceCategory Fail To Create. ";
		}
		return returnValue;

	}

	@RequestMapping(value = "/fetch/{scId}", method = RequestMethod.GET)

	public String getServiceCategory(@PathVariable(value = "scId") Long id) {
		System.out.println("mmmm");
		if (id == null)
			return "ServiceCategoryId can't be Empty";

		return scService.getServiceCategory().toString();

	}

	@RequestMapping(value = "/update/{scId}", method = RequestMethod.PUT)
	public String updateServiceCategory(@PathVariable(value = "scId") Long id, @RequestBody ServiceCategory sc) {
		sc.setId(id);
		if (sc.getBusinessService() == null)
			return "BusinessService can't be Empty";
		if (sc.getCode() == null)
			return "Code can't be Empty";
		if (sc.getType() == null)
			return "Type can't be Empty";
		String returnValue = "";
		try {
			
			sc.setUpdatedBy(userId);
			sc.setUpdatedDate(updatedDate);
			ServiceCategory servicecategory = scService.createServiceCategory(sc);
			returnValue = "ServiceCategory Successfully Created. Id=" + servicecategory.getId();
		} catch (Exception e) {
			e.printStackTrace();
			returnValue = "ServiceCategory Fail To Create. ";
		}
		return returnValue;
		// return scService.updateServiceCatagory(scDetails);
	}

}
