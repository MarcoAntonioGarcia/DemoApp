package com.demo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.app.dto.EmployeeDetailsDTO;
import com.demo.app.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	EmployeeDetailsDTO findByEmployeeId(Integer employeeId);
	

}
