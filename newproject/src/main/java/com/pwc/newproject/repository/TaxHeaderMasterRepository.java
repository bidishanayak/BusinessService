package com.pwc.newproject.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pwc.newproject.entity.TaxHeaderMaster;

@Repository
public interface TaxHeaderMasterRepository extends JpaRepository<TaxHeaderMaster,Long> {

}
