package com.pwc.newproject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pwc.newproject.entity.TaxHeaderMaster;
import com.pwc.newproject.repository.TaxHeaderMasterRepository;

@Service
public class TaxHeaderMasterService {// <TaxHeaderMasterRepository> {

	@Autowired
	TaxHeaderMasterRepository taxHeaderMasterRepository;

	public TaxHeaderMaster saveMaster(TaxHeaderMaster master) {
		return new TaxHeaderMaster();

	}

	// CREATE

	public TaxHeaderMaster createTaxHeaderMaster(TaxHeaderMaster thm) {
		return taxHeaderMasterRepository.save(thm);

	}
	// READ

	/*
	 * public TaxHeaderMaster getTaxHeaderMaster(Long taxHeaderMasterId) {
	 * TaxHeaderMaster taxHeadMaster = null; try { taxHeadMaster =
	 * taxHeaderMasterRepository.findById(taxHeaderMasterId); } return
	 * 
	 * }
	 */

	// public List<TaxHeaderMaster> getTaxHeaderMaster(Long taxHeaderMasterId) {
	/*
	 * List<TaxHeaderMaster> taxHeadMasters = new ArrayList<>(); try {
	 * //TaxHeaderMaster taxHeadMaster =
	 * taxHeaderMasterRepository.findById(taxHeaderMasterId);
	 * Optional<TaxHeaderMaster> taxHeadMaster =
	 * Optional.ofNullable(taxHeaderMasterRepository.findById(taxHeaderMasterId));
	 * taxHeadMasters.add(taxHeadMaster); }catch(Exception e){ e.printStackTrace();
	 * } return taxHeadMasters;
	 */
	// return taxHeaderMasterRepository.findAll();
	// }
	public TaxHeaderMaster getTaxHeaderMasterById(Long id) {
		return taxHeaderMasterRepository.getOne(id);
	}

	// DELETE

	public void deleteTaxHeaderMaster(Long taxHeaderMasterId) {
		taxHeaderMasterRepository.deleteById(taxHeaderMasterId);
	}

	// UPDATE
	public TaxHeaderMaster updateTaxHeaderMaster(TaxHeaderMaster detailstaxHeaderMaster) {
		// Long taxHeaderMasterId
		/*
		 * TaxHeaderMaster thm =
		 * taxHeaderMasterRepository.findById(taxHeaderMasterId).get();
		 * 
		 * thm.setCatagory(DetailstaxHeaderMaster.getCatagory());
		 * 
		 * thm.setService(DetailstaxHeaderMaster.getService());
		 * 
		 * thm.setName(DetailstaxHeaderMaster.getName());
		 * 
		 * thm.setCode(DetailstaxHeaderMaster.getCode());
		 * 
		 * thm.setDabit(DetailstaxHeaderMaster.isDabit());
		 * 
		 * thm.setActualDemand(DetailstaxHeaderMaster.isActualDemand());
		 * 
		 * thm.setTaxHeadOrder(DetailstaxHeaderMaster.getTaxHeadOrder());
		 * 
		 * thm.setRequire(DetailstaxHeaderMaster.isRequire());
		 * 
		 * thm.setBillingServiceCode(DetailstaxHeaderMaster.getBillingServiceCode());
		 * 
		 * thm.setTaxHead(DetailstaxHeaderMaster.getTaxHead());
		 * 
		 * thm.setGlCode(DetailstaxHeaderMaster.getGlCode());
		 * 
		 * thm.setValidFrom(DetailstaxHeaderMaster.getValidFrom());
		 * 
		 * thm.setValidTo(DetailstaxHeaderMaster.getValidTo());
		 * 
		 * thm.setServiceCatagoryTypeId(DetailstaxHeaderMaster.getServiceCatagoryTypeId(
		 * ));
		 * 
		 */

		return taxHeaderMasterRepository.save(detailstaxHeaderMaster);

		// sct.setCatagory(DetailsServiceCatagoryType.getCatagory());

	}

	public String gettaxHeaderMasterBycatagoryId(Long catagoryId) {
		// TODO Auto-generated method stub
		if (catagoryId == null) {
			return "catagoryId cannot be Blank";
		} else {
			return taxHeaderMasterRepository.findByCatagoryId(catagoryId);
		}
	}

	public String gettaxHeaderMasterBycatagoryTypeId(Long catagoryTypeid) {
		// TODO Auto-generated method stub
		if (catagoryTypeid == null) {	
			return "please select catagory Type";
		} else {
			return taxHeaderMasterRepository.findByCatagoryTypeId(catagoryTypeid);
		}
	}

	public boolean gettaxHeaderMasterFindBycode(String code) {
		if (code == null) {
			return false;
		} else {
			TaxHeaderMaster thm = taxHeaderMasterRepository.findBycode(code);
			System.out.println(thm);
			if (thm == null) {
				return false;
			} else {
				return true;
				//return thm == code;
			}
		}
	}
}
