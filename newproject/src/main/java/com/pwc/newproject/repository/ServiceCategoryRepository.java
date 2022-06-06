package com.pwc.newproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.pwc.newproject.entity.ServiceCategory;

@Repository

public interface ServiceCategoryRepository extends JpaRepository<ServiceCategory , Long> {
	
	
	@Query(value="FROM ServiceCategory sc where sc.code = :code")
    public ServiceCategory findBycode(@Param("code") String code);
}
        
	

