package com.pwc.newproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;




import org.springframework.stereotype.Repository;
import com.pwc.newproject.entity.ServiceCatagory;

@Repository

public interface ServiceCatagoryRepository extends JpaRepository<ServiceCatagory , Long> {
        
	
}
