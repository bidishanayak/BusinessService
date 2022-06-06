package com.pwc.newproject.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.pwc.newproject.entity.ServiceCategoryType;
import com.pwc.newproject.service.ServiceCategoryTypeService;

@RestController
@RequestMapping("/service_category_type")
public class ServiceCategoryTypeController {

	@Autowired
	ServiceCategoryTypeService sctService;

	String userId = "156678";

	private Date createdDate = new Date(System.currentTimeMillis());

	private Date updatedDate = new Date(System.currentTimeMillis());

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createServiceCatagoryType(@RequestBody ServiceCategoryType sct) {
		System.out.println("Hellow" + sct.getValidTO());

		if (sct.getCode() == null)
			return "Code can't be Empty";
		if (sct.getFund() == null)
			return "Fund can't be Empty";
		if (sct.getFunction() == null)
			return "Function can't be Empty";
		if (sct.getDepartment() == null)
			return "Department can't be Empty";
		if (sct.getValidFrom() == null)
			return "ValidFrom can't be Empty";
		if (sct.getValidTO() == null)
			return "ValidTo can't be Empty";
		if (sct.getFromDate() == null)
			return "FromDate can't be Empty";
		if (sct.getToDate() == null)
			return "ToDate can't be Empty";
		if (sct.getPeriodCycle() == null)
			return "PeriodCycle can't be Empty";
		if (sct.getService() == null)
			return "Service can't be Empty";
		if (sct.getFinancialYear() == null)
			return "FinancialYear can't be Empty";
		// if(sct.getService_category_id() == null)
		// return "ServiceCategoryId can't be Empty";
		String returnValue = "";
		try {

			// service validation
			boolean isServiceUnique = sctService.getServiceCategoryTypefindByservice(sct.getService());
			System.out.println(isServiceUnique);

			if (isServiceUnique) {
				sct.setCreatedBy(userId);
				sct.setCreatedDate(createdDate);
				ServiceCategoryType servicecategoryType = sctService.createServiceCategoryType(sct);
				returnValue = "ServiceCatagoryType Successfully Created. Id=" + servicecategoryType.getTypeId();
				System.out.println();
			} else {
				returnValue = "service is already used";
			}

		} catch (Exception e) {
			e.printStackTrace();
			returnValue = "ServiceCatagoryType Fail To Create. ";
		}
		return returnValue;

	}

	@RequestMapping(value = "/fetch/{sctId}", method = RequestMethod.GET)

	public String getServiceCatagoryType(@PathVariable(value = "sctId") Long sctId) {
		System.out.println("Bidisha");
		if (sctId == null)
			return "ServicecategoryTypeId can't be Empty";

		return sctService.getServiceCategoryType().toString();

	}

	@RequestMapping(value = "/update/{sctId}", method = RequestMethod.PUT)
	public String updateServiceCatagoryType(@PathVariable(value = "sctId") Long id,
			@RequestBody ServiceCategoryType sct) {
		System.out.println("Hellow" + sct.getValidTO());
		sct.setTypeId(id);
		if (sct.getCode() == null)
			return "Code can't be Empty";
		if (sct.getFund() == null)
			return "Fund can't be Empty";
		if (sct.getFunction() == null)
			return "Function can't be Empty";
		if (sct.getDepartment() == null)
			return "Department can't be Empty";
		if (sct.getValidFrom() == null)
			return "ValidFrom can't be Empty";

		if (sct.getFromDate() == null)
			return "FromDate can't be Empty";
		if (sct.getToDate() == null)
			return "ToDate can't be Empty";
		if (sct.getPeriodCycle() == null)
			return "PeriodCycle can't be Empty";
		if (sct.getService() == null)
			return "Service can't be Empty";
		if (sct.getFinancialYear() == null)
			return "FinancialYear can't be Empty";

		if (sct.getValidTO() == null)
			return "ValidTo can't be Empty";
		String returnValue = "";
		try {

			sct.setUpdatedBy(userId);
			sct.setUpdatedDate(updatedDate);

			ServiceCategoryType servicecategorytype = sctService.createServiceCategoryType(sct);
			returnValue = "ServiceCatagoryType Successfully Created. Id=" + servicecategorytype.getTypeId();
		} catch (Exception e) {
			e.printStackTrace();
			returnValue = "ServiceCatagoryType Fail To Create. ";
		}
		return returnValue;

	}
}
