package com.pwc.newproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pwc.newproject.entity.ServiceCategoryType;

@Repository
public interface ServiceCategoryTypeRepository  extends JpaRepository<ServiceCategoryType,Long>{

	@Query(value="FROM ServiceCategoryType sct where sct.service = :service")
    public ServiceCategoryType findByservice(@Param("service") String service);
}
	

	


