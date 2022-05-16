package com.pwc.newproject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.pwc.newproject.entity.ServiceCatagoryType;
import com.pwc.newproject.service.ServiceCatagoryTypeService;


@RestController
@RequestMapping("/ServiceCatagoryType")
public class ServiceCatagoryTypeController {
	
	@Autowired
	ServiceCatagoryTypeService sctService;
	
	
	@RequestMapping(value="/CreateCatagoryType", method=RequestMethod.POST)
	public ServiceCatagoryType createServiceCatagoryType(@RequestBody ServiceCatagoryType sct) {
	    
		return sctService.createServiceCatagoryType(sct);}
	
	@RequestMapping(value="/FetchCatagoryType", method=RequestMethod.GET)
	public List<ServiceCatagoryType> readServiceCatagoryType() {
	    return sctService.getServiceCatagoryType();
	}
	
	@RequestMapping(value="/UpdateCatagoryType/{sctId}", method=RequestMethod.PUT)
	public ServiceCatagoryType updateServiceCatagoryType(@PathVariable(value = "sctId") Long id, @RequestBody ServiceCatagoryType sctDetails) {
		//System.out.println("Hellow");
		sctDetails.setTypeId(id);
	    return sctService.updateServiceCatagoryType( sctDetails);
	    
	}
	
	@RequestMapping(value="/RemoveCatagoryType/{sctId}", method=RequestMethod.DELETE)
	public void deleteServiceCatagoryType(@PathVariable(value = "sctId") Long id) {
	    sctService.deleteServiceCatagoryType(id);
	    
	}
}


