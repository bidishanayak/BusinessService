package com.pwc.newproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pwc.newproject.entity.TaxHeaderMaster;
import com.pwc.newproject.service.TaxHeaderMasterService;

@RestController
@RequestMapping("/TaxHeaderMaster")
public class TaxHeaderMasterController {

	@Autowired
	TaxHeaderMasterService taxHeaderMasterService;
	// private TaxHeaderMasterController TaxHeaderMasterService;

	@RequestMapping(value = "/CreateMaster", method = RequestMethod.POST)
	public String createTaxHeaderMaster(@RequestBody TaxHeaderMaster thm) {
		//public TaxHeaderMaster createTaxHeaderMaster(@RequestBody TaxHeaderMaster thm)
		if(thm.getGlCode() == null)
			return "GLcode can't be Empty";
		if(thm.getBillingServiceCode() == null)
			return "BillingServiceCode can't be Empty";
		if(thm.getCatagory() == null)
			return "Catagory can't be Empty";
		//if(thm.getSct() == null)
			//return "Service category type can't be Empty";
		if(thm.getTaxHeadOrder() == null)
			return "TaxHeadOrder can't be Empty";
		if(thm.getTaxHead() == null)
			return "TaxHead can't be Empty";
		if(thm.getValidFrom() == null)
			return "ValidFrom can't be Empty";
		if(thm.getValidTo() == null)
			return "ValidTo can't be Empty";
		if(thm.getServiceCatagoryTypeId() == null)
			return "ServiceCatagoryTypeId can't be Empty";
		if(thm.getName() == null)
			return "Name can't be Empty";
		if(thm.getCode() == null)
			return "Code can't be Empty";
		if(thm.getService() == null)
			return "Service can't be Empty";
		String returnValue = "";
		try {
			//code validation
			boolean codeResult = taxHeaderMasterService.gettaxHeaderMasterFindBycode(thm.getCode());
			System.out.println(codeResult);
					
			TaxHeaderMaster taxhead = taxHeaderMasterService.createTaxHeaderMaster(thm);
			 returnValue = "TaxHeaderMaster Successfully Created. Id="+taxhead.getId();
		} catch (Exception e) {
			e.printStackTrace();
			returnValue = "TaxHeaderMaster Fail To Create. ";
		}
		return returnValue;

	}

	@GetMapping("/getMaster/{scId}")
	public String getTaxHeaderMasterById(@PathVariable("scId") Long id) {
		System.out.println("Bidisha");
		if(id == null)
			return "id can't be Empty";
		TaxHeaderMaster taxHeaderMaster = new TaxHeaderMaster();
		try {
			taxHeaderMaster = taxHeaderMasterService.getTaxHeaderMasterById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return taxHeaderMaster.toString();
	}

	@RequestMapping(value = "/UpdateMaster/{scId}", method = RequestMethod.PUT)
	public String updateTaxHeaderMaster(@PathVariable("scId") Long id,
			@RequestBody TaxHeaderMaster thm) {
		thm.setId(id);
		
		if(thm.getGlCode() == null)
			return "GLcode can't be Empty";
		if(thm.getBillingServiceCode() == null)
			return "BillingServiceCode can't be Empty";
		if(thm.getCatagory() == null)
			return "Catagory can't be Empty";
		//if(thm.getSct() == null)
		    //return "Service category type can't be Empty";
		if(thm.getTaxHeadOrder() == null)
			return "TaxHeadOrder can't be Empty";
		if(thm.getTaxHead() == null)
			return "TaxHead can't be Empty";
		if(thm.getValidFrom() == null)
			return "ValidFrom can't be Empty";
		if(thm.getValidTo() == null)
			return "ValidTo can't be Empty";
		if(thm.getServiceCatagoryTypeId() == null)
			return "ServiceCatagoryTypeId can't be Empty";
		if(thm.getName() == null)
			return "Name can't be Empty";
		if(thm.getCode() == null)
			return "Code can't be Empty";
		if(thm.getService() == null)
			return "Service can't be Empty";
		String returnValue = "";
		try {
			TaxHeaderMaster taxhead = taxHeaderMasterService.createTaxHeaderMaster(thm);
			 returnValue = "TaxHeaderMaster Successfully Created. Id="+taxhead.getId();
		} catch (Exception e) {
			e.printStackTrace();
			returnValue = "TaxHeaderMaster Fail To Create. ";
		}
		return returnValue;
		
		//return taxHeaderMasterService.updateTaxHeaderMaster(taxHeaderMasterDetails);

	}

	@RequestMapping(value = "/RemoveMaster/{scId}", method = RequestMethod.DELETE)
	public void DELETTaxHeaderMaster(@PathVariable(value = "scId") Long id) {
	
				taxHeaderMasterService.deleteTaxHeaderMaster(id);
	
	
			
			
	}
	@RequestMapping(value = "/getTaxHeaderMasterByCategoryid/{id}",method = RequestMethod.GET)
	public String getTaxHeaderMasterByCategoryid(@PathVariable("id") Long id) {
		System.out.println("Bidisha");
		TaxHeaderMaster taxHeaderMaster = new TaxHeaderMaster();
		try {
			taxHeaderMaster = taxHeaderMasterService.getTaxHeaderMasterById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return taxHeaderMaster.toString();

	}
	@GetMapping("/getTaxHeaderMasterByCategoryTypeid/{typeId}")
	public String getTaxHeaderMasterBytypeId(@PathVariable("typeId") Long typeId) {
		//System.out.println("Bidisha");
		TaxHeaderMaster taxHeaderMaster = new TaxHeaderMaster();
		try {
			taxHeaderMaster = taxHeaderMasterService.getTaxHeaderMasterById(typeId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return taxHeaderMaster.toString();
		
	}
}
