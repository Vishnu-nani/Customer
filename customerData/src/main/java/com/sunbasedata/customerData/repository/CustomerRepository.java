package com.sunbasedata.customerData.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunbasedata.customerData.entity.Customer;


@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Integer>{

	@Transactional
	@Modifying
	@Query(value="DELETE FROM Customer c WHERE c.id=:id",nativeQuery = true)
	public void deleteByid(@Param("id") int id);
	
	@Modifying
	@Transactional
	@Query(value="update Customer set DELETED = true, LAST_MODIFIED_BY = lastModifiedBy where id = :id",nativeQuery=true)
	public void updateCustomer(@Param("id") int id);
	
	
	
	@Query(value="SELECT * FROM Customer c WHERE c.id=:id",nativeQuery = true)
	public Customer getByid(int id);
	
	
	

}
