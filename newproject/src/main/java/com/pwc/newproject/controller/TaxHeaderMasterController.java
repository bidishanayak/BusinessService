package com.pwc.newproject.controller;

import java.util.Date;

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
@RequestMapping("/tax_header_master")
public class TaxHeaderMasterController {

	@Autowired
	TaxHeaderMasterService taxHeaderMasterService;

	String userId = "1234598";

	private Date createdDate = new Date(System.currentTimeMillis());

	private Date updatedDate = new Date(System.currentTimeMillis());

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createTaxHeaderMaster(@RequestBody TaxHeaderMaster thm) {

		if (thm.getGlCode() == null)
			return "GLcode can't be Empty";

		if (thm.getBillingServiceCode() == null)
			return "BillingServiceCode can't be Empty";

		if (thm.getTaxHeadOrder() == null)
			return "TaxHeadOrder can't be Empty";

		if (thm.getTaxHead() == null)
			return "TaxHead can't be Empty";

		if (thm.getValidFrom() == null)
			return "ValidFrom can't be Empty";

		if (thm.getValidTo() == null)
			return "ValidTo can't be Empty";

		if (thm.getServiceCatagoryTypeId() == null)
			return "ServiceCatagoryTypeId can't be Empty";

		if (thm.getName() == null)
			return "Name can't be Empty";

		if (thm.getCode() == null)
			return "Code can't be Empty";

		if (thm.getService() == null)

			return "Service can't be Empty";
		String returnValue = "";
		try {
			
			 // name validation 
			boolean isNameUnique = taxHeaderMasterService.gettaxHeaderMasterFindbyName(thm.getName());
			 System.out.println(isNameUnique);
			 /*
			 if (isNameUnique && isTaxHeadUnique ) { 
				 System.out.println();
				 } else { returnValue = "name is already used"; }
			 */
			// taxHead validation
			boolean isTaxHeadUnique = taxHeaderMasterService.gettaxHeaderMasterFindbytaxHead(thm.getTaxHead());
			System.out.println(isTaxHeadUnique);

			if (isNameUnique && isTaxHeadUnique) {
				thm.setCreatedBy(userId);
				thm.setCreatedDate(createdDate);

				TaxHeaderMaster taxhead = taxHeaderMasterService.createTaxHeaderMaster(thm);
				returnValue = "TaxHeaderMaster Successfully Created. Id=" + taxhead.getId();
				System.out.println();
			} else {

				returnValue = "taxhead and name is already used";
			}

		} catch (Exception e) {
			e.printStackTrace();
			returnValue = "TaxHeaderMaster Fail To Create. ";
		}
		return returnValue;

	}

	@GetMapping("/get/{scId}")
	public String getTaxHeaderMasterById(@PathVariable("scId") Long id) {
		System.out.println("Bidisha");
		if (id == null)
			return "id can't be Empty";
		TaxHeaderMaster taxHeaderMaster = new TaxHeaderMaster();
		try {
			taxHeaderMaster = taxHeaderMasterService.getTaxHeaderMasterById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return taxHeaderMaster.toString();
	}

	@RequestMapping(value = "/update/{scId}", method = RequestMethod.PUT)
	public String updateTaxHeaderMaster(@PathVariable("scId") Long id, @RequestBody TaxHeaderMaster thm) {
		thm.setId(id);

		if (thm.getGlCode() == null)
			return "GLcode can't be Empty";

		if (thm.getBillingServiceCode() == null)
			return "BillingServiceCode can't be Empty";

		// if (thm.getCategory() == null)
		// return "Category can't be Empty";

		if (thm.getTaxHeadOrder() == null)
			return "TaxHeadOrder can't be Empty";

		if (thm.getTaxHead() == null)
			return "TaxHead can't be Empty";

		if (thm.getValidFrom() == null)
			return "ValidFrom can't be Empty";

		if (thm.getValidTo() == null)
			return "ValidTo can't be Empty";

		if (thm.getServiceCatagoryTypeId() == null)
			return "ServiceCatagoryTypeId can't be Empty";

		if (thm.getName() == null)
			return "Name can't be Empty";

		if (thm.getCode() == null)
			return "Code can't be Empty";

		if (thm.getService() == null)
			return "Service can't be Empty";

		String returnValue = "";
		try {

			thm.setUpdatedBy(userId);
			thm.setUpdatedDate(updatedDate);

			TaxHeaderMaster taxhead = taxHeaderMasterService.createTaxHeaderMaster(thm);
			returnValue = "TaxHeaderMaster Successfully Created. Id=" + taxhead.getId();
		} catch (Exception e) {
			e.printStackTrace();
			returnValue = "TaxHeaderMaster Fail To Create. ";
		}
		return returnValue;

	}

	@RequestMapping(value = "/get_tax_header_master_by_category_id/{id}", method = RequestMethod.GET)
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

	@GetMapping("/get_tax_header_master_by_category_type_id/{typeId}")
	public String getTaxHeaderMasterBytypeId(@PathVariable("typeId") Long typeId) {

		TaxHeaderMaster taxHeaderMaster = new TaxHeaderMaster();
		try {
			taxHeaderMaster = taxHeaderMasterService.getTaxHeaderMasterById(typeId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return taxHeaderMaster.toString();

	}

}
