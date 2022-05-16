package com.pwc.newproject.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pwc.newproject.entity.ServiceCatagory;
import com.pwc.newproject.service.ServiceCatagoryService;

@RestController
@RequestMapping("/ServiceCatagory")
public class ServiceCatagoryController {
	@Autowired
	ServiceCatagoryService scService;

	@RequestMapping(value = "/CreateCatagory", method = RequestMethod.POST)
	public ServiceCatagory createServiceCatagory(@RequestBody ServiceCatagory sc) {

		return scService.createServiceCatagory(sc);
	}

	@RequestMapping(value = "/FetchCatagory", method = RequestMethod.GET)
	public List<ServiceCatagory> readServiceCatagory() {
		return scService.getServiceCatagory();
	}

	@RequestMapping(value = "/UpdateCatagory/{scId}", method = RequestMethod.PUT)
	public ServiceCatagory updateServiceCatagory(@PathVariable(value = "scId") Long id,
			@RequestBody ServiceCatagory scDetails) {
		scDetails.setId(id);
		return scService.updateServiceCatagory(scDetails);
	}

	@RequestMapping(value = "/RemoveCatagory/{scId}", method = RequestMethod.DELETE)
	public void deleteServiceCatagory(@PathVariable(value = "scId") Long id) {
		scService.deleteServiceCatagory(id);

		
		
		
		
	}
}
