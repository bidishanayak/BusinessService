package com.pwc.newproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.pwc.newproject.entity.TaxHeaderMaster;

@Repository
public interface TaxHeaderMasterRepository extends JpaRepository<TaxHeaderMaster,Long> {
	@Query(value="FROM TaxHeaderMaster thm where thm.categoryId= :categoryId")
	public String findByCategoryId(@Param("categoryId") Long categoryId);


	@Query(value="FROM TaxHeaderMaster thm where thm.sct= :categoryTypeId")
    public String findByCategoryTypeId(@Param("categoryTypeId") Long categoryTypeId);

	
	@Query(value="FROM TaxHeaderMaster thm where thm.code = :code")
    public TaxHeaderMaster findBycode(@Param("code") String code);
	
	@Query(value="FROM TaxHeaderMaster thm where thm.name = :name")
    public TaxHeaderMaster findByname(@Param("name") String name);
	
	@Query(value="FROM TaxHeaderMaster thm where thm.taxHead = :taxHead")
    public TaxHeaderMaster findBytaxHead(@Param("taxHead") String taxHead);
	
	
}