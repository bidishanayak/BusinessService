package com.pwc.newproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.stereotype.Repository;

import com.pwc.newproject.entity.ServiceCatagoryType;

@Repository
public interface ServiceCatagoryTypeRepository  extends JpaRepository<ServiceCatagoryType,Long>{

	//String toString(Long catagoryTypeid);

	

}
