
package com.pwc.newproject.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pwc.newproject.entity.ServiceCatagory;
import com.pwc.newproject.entity.ServiceCatagoryType;
import com.pwc.newproject.entity.TaxHeaderMaster;
import com.pwc.newproject.service.ServiceCatagoryService;

@RestController
@RequestMapping("/ServiceCatagory")
public class ServiceCatagoryController {
	@Autowired
	ServiceCatagoryService scService;

	@RequestMapping(value = "/CreateCatagory", method = RequestMethod.POST)
	public String createServiceCatagory(@RequestBody ServiceCatagory sc) {
		if(sc.getBusinessService() == null)
			return "BusinessService can't be Empty";
		if(sc.getCode() == null)
			return "Code can't be Empty";
		if(sc.getType() == null)
			return "Type can't be Empty";
		String returnValue = "";
		try {
			ServiceCatagory servicecategory = scService.createServiceCatagory(sc);
			 returnValue = "ServiceCatagory Successfully Created. Id="+sc.getId();
		} catch (Exception e) {
			e.printStackTrace();
			returnValue = "ServiceCatagory Fail To Create. ";
		}
		return returnValue;
		//return scService.createServiceCatagory(sc);
	}

	@RequestMapping(value = "/FetchCatagory/{scId}", method = RequestMethod.GET)
	//public List<ServiceCatagory> readServiceCatagory()
	//public String getServiceCatagory(@RequestBody ServiceCatagory scId)
	public String getServiceCatagory(@PathVariable(value = "scId") Long id) {
	System.out.println("mmmm");
		if(id == null)
			return "ServiceCategoryId can't be Empty";
		
		return scService.getServiceCatagory().toString();
	
	}

	@RequestMapping(value = "/UpdateCatagory/{scId}", method = RequestMethod.PUT)
	public String updateServiceCatagory(@PathVariable(value = "scId") Long id,
			@RequestBody ServiceCatagory sc) {
		sc.setId(id);
		if(sc.getBusinessService() == null)
			return "BusinessService can't be Empty";
		if(sc.getCode() == null)
			return "Code can't be Empty";
		if(sc.getType() == null)
			return "Type can't be Empty";
		String returnValue = "";
		try {
			ServiceCatagory servicecategory = scService.createServiceCatagory(sc);
			 returnValue = "ServiceCatagory Successfully Created. Id="+sc.getId();
		} catch (Exception e) {
			e.printStackTrace();
			returnValue = "ServiceCatagory Fail To Create. ";
		}
		return returnValue;
		//return scService.updateServiceCatagory(scDetails);
	}

	@RequestMapping(value = "/RemoveCatagory/{scId}", method = RequestMethod.DELETE)
	public void deleteServiceCatagory(@PathVariable(value = "scId") Long id) {
		scService.deleteServiceCatagory(id);

		
		
		
		
	}
}
