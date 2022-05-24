package com.pwc.newproject.repository;

import java.util.List;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pwc.newproject.entity.TaxHeaderMaster;

@Repository
public interface TaxHeaderMasterRepository extends JpaRepository<TaxHeaderMaster,Long> {
	@Query(value="FROM TaxHeaderMaster thm where thm.catagoryId= :catagoryId")
	public String findByCatagoryId(@Param("catagoryId") Long catagoryId);


	@Query(value="FROM TaxHeaderMaster thm where thm.sct= :catagoryTypeId")
    public String findByCatagoryTypeId(@Param("catagoryTypeId") Long catagoryTypeId);

	
	@Query(value="FROM TaxHeaderMaster thm where thm.Code = :code")
    public TaxHeaderMaster findBycode(@Param("code") String code);
}