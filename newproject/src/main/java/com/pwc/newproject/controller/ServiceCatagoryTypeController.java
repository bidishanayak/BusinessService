package com.pwc.newproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pwc.newproject.entity.ServiceCatagoryType;
import com.pwc.newproject.entity.TaxHeaderMaster;
import com.pwc.newproject.service.ServiceCatagoryTypeService;


@RestController
@RequestMapping("/ServiceCatagoryType")
public class ServiceCatagoryTypeController {
	
	@Autowired
	ServiceCatagoryTypeService sctService;
	//@RequestMapping(value="/searchCatagoryType",method=RequestMethod.GET)
   // public String searchServiceCatagoryType(@PathVariable(value = "catagoryId")Long catagoryid,
	//@PathVariable(value = "catagoryTypeId")Long catagoryTypeid)
//{
		//System.out.println("hhhhh");
		//return sctService.getServiceCatagoryType(catagoryid,catagoryTypeid);
		//}
	
	
	
	
	@RequestMapping(value="/CreateCatagoryType", method=RequestMethod.POST)
	public String createServiceCatagoryType(@RequestBody ServiceCatagoryType sct) {
		System.out.println("Hellow"+sct.getValidTO());
		
		if(sct.getCode() == null)
			return "Code can't be Empty";
		if(sct.getFund() == null)
			return "Fund can't be Empty";
		if(sct.getFunction() == null)
			return "Function can't be Empty";
		if(sct.getDepartment() == null)
			return "Department can't be Empty";
		if(sct.getValidFrom() == null)
			return "ValidFrom can't be Empty";
		if(sct.getValidTO() == null)
			return "ValidTo can't be Empty";
		if(sct.getFromDate() == null)
			return "FromDate can't be Empty";
		if(sct.getToDate() == null)
			return "ToDate can't be Empty";
		if(sct.getPeriodCycle() == null)
			return "PeriodCycle can't be Empty";
		if(sct.getService() == null)
			return "Service can't be Empty";
		if(sct.getFinancialYear() == null)
			return "FinancialYear can't be Empty";
		if(sct.getService_catagory_id() == null)
			return "ServiceCatagoryId can't be Empty";
		String returnValue = "";
		try {
			ServiceCatagoryType servicecategoryType = sctService.createServiceCatagoryType(sct);
			 returnValue = "ServiceCatagoryType Successfully Created. Id="+sct.getTypeId();
		} catch (Exception e) {
			e.printStackTrace();
			returnValue = "ServiceCatagoryType Fail To Create. ";
		}
		return returnValue;
		
		//return sctService.createServiceCatagoryType(sct);
		}
	
	@RequestMapping(value="/FetchCatagoryType/{sctId}", method=RequestMethod.GET)
	//public List<ServiceCatagoryType> readServiceCatagoryType()
	public String getServiceCatagoryType(@PathVariable(value = "sctId") Long  sctId) {
	if(sctId == null)
		return "ServicecategoryTypeId can't be Empty";
	
	return sctService.getServiceCatagoryType().toString();

	   // return sctService.getServiceCatagoryType();
	}
	
	@RequestMapping(value="/UpdateCatagoryType/{sctId}", method=RequestMethod.PUT)
	public String updateServiceCatagoryType(@PathVariable(value = "sctId") Long id, @RequestBody ServiceCatagoryType sct) {
		System.out.println("Hellow"+sct.getValidTO());
		sct.setTypeId(id);
		if(sct.getCode() == null)
			return "Code can't be Empty";
		if(sct.getFund() == null)
			return "Fund can't be Empty";
		if(sct.getFunction() == null)
			return "Function can't be Empty";
		if(sct.getDepartment() == null)
			return "Department can't be Empty";
		if(sct.getValidFrom() == null)
			return "ValidFrom can't be Empty";
		
		if(sct.getFromDate() == null)
			return "FromDate can't be Empty";
		if(sct.getToDate() == null)
			return "ToDate can't be Empty";
		if(sct.getPeriodCycle() == null)
			return "PeriodCycle can't be Empty";
		if(sct.getService() == null)
			return "Service can't be Empty";
		if(sct.getFinancialYear() == null)
			return "FinancialYear can't be Empty";
		if(sct.getService_catagory_id() == null)
			return "Service_catagory_id can't be Empty";
		if(sct.getValidTO() == null)
			return "ValidTo can't be Empty";
		String returnValue = "";
		try {
			ServiceCatagoryType servicecategoryType = sctService.createServiceCatagoryType(sct);
			 returnValue = "ServiceCatagoryType Successfully Created. Id="+sct.getTypeId();
		} catch (Exception e) {
			e.printStackTrace();
			returnValue = "ServiceCatagoryType Fail To Create. ";
		}
		return returnValue;
	   // return sctService.updateServiceCatagoryType( sctDetails);
	    
	}
	
	@RequestMapping(value="/RemoveCatagoryType/{sctId}", method=RequestMethod.DELETE)
	public void deleteServiceCatagoryType(@PathVariable(value = "sctId") Long id) {
	    sctService.deleteServiceCatagoryType(id);
	    
	}
}


