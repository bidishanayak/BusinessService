package com.pwc.newproject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
	//private TaxHeaderMasterController TaxHeaderMasterService;

	@RequestMapping(value = "/CreateMaster", method = RequestMethod.POST)
	public TaxHeaderMaster createTaxHeaderMaster(@RequestBody TaxHeaderMaster thm) {
	
	return taxHeaderMasterService.createTaxHeaderMaster(thm);
	
}

	@RequestMapping("/getMaster/{scId}")
	public String getTaxHeaderMasterById(@PathVariable("scId") Long id) {
     System.out.println("Bidisha");
		TaxHeaderMaster taxHeaderMaster = new TaxHeaderMaster();
		try{
			taxHeaderMaster = taxHeaderMasterService.getTaxHeaderMasterById(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return taxHeaderMaster.toString();
	}


	
	
	@RequestMapping(value = "/UpdateMaster/{scId}", method = RequestMethod.PUT)
	public TaxHeaderMaster updateTaxHeaderMaster(@PathVariable("scId") Long id ,
			@RequestBody TaxHeaderMaster taxHeaderMasterDetails){
		taxHeaderMasterDetails.setId(id);
	return taxHeaderMasterService.updateTaxHeaderMaster(taxHeaderMasterDetails);
	
	}
	
	@RequestMapping(value = "/RemoveMaster/{scId}", method = RequestMethod.DELETE)
	public void DELETTaxHeaderMaster(@PathVariable(value = "scId") Long id) {
			{
	
				taxHeaderMasterService.deleteTaxHeaderMaster(id);
	
	
	 }
	}
	
}	
	


