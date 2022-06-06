package com.pwc.newproject.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.stereotype.Service;
import com.pwc.newproject.entity.TaxHeaderMaster;
import com.pwc.newproject.repository.TaxHeaderMasterRepository;

@Service
public class TaxHeaderMasterService {
	
	@CreatedBy
	private String createdBy;
	
	@CreatedDate
	private Date createDate;
	
	@LastModifiedBy
	private String updatedBy;
	
	@LastModifiedDate
	private Date updateDate;


	@Autowired
	TaxHeaderMasterRepository taxHeaderMasterRepository;

	public TaxHeaderMaster saveMaster(TaxHeaderMaster master) {
		return new TaxHeaderMaster();

	}

	// CREATE

	public TaxHeaderMaster createTaxHeaderMaster(TaxHeaderMaster thm) {
		
		Date createdDate = new Date(System.currentTimeMillis());
		return taxHeaderMasterRepository.save(thm);

	}
	// READ

	public TaxHeaderMaster getTaxHeaderMasterById(Long id) {
		return taxHeaderMasterRepository.getOne(id);
	}

    // UPDATE
	public TaxHeaderMaster updateTaxHeaderMaster(TaxHeaderMaster detailstaxHeaderMaster) {
		Date createdDate = new Date(System.currentTimeMillis());

		return taxHeaderMasterRepository.save(detailstaxHeaderMaster);

	}

	public String gettaxHeaderMasterBycatagoryId(Long catagoryId) {
		// TODO Auto-generated method stub
		if (catagoryId == null) {
			return "catagoryId cannot be Blank";
		} else {
			return taxHeaderMasterRepository.findByCategoryId(catagoryId);
		}
	}

	public String gettaxHeaderMasterBycatagoryTypeId(Long catagoryTypeid) {
		// TODO Auto-generated method stub
		if (catagoryTypeid == null) {	
			return "please select catagory Type";
		} else {
			return taxHeaderMasterRepository.findByCategoryTypeId(catagoryTypeid);
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
				}
			}
		}
				
	
			public boolean gettaxHeaderMasterFindbyName(String name) {
				if (name == null) {
					return false;
				} else {
					TaxHeaderMaster thm = taxHeaderMasterRepository.findByname(name);
					System.out.println(thm);
					if (thm == null) {
						return true;
					} else {
						return false;
					
						
					}
					}
					
				}
					public boolean gettaxHeaderMasterFindbytaxHead(String taxHead) {
						if (taxHead == null) {
							return false;
						} else {
							TaxHeaderMaster thm = taxHeaderMasterRepository.findByname(taxHead);
							System.out.println(thm);
							if (thm == null) {
								return true;
							} else {
								return false;
								
							}
						}
						
						}
				}
			
			
			
		
		
	

