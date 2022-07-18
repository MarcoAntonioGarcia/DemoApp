package com.demo.app.service;

import com.demo.app.dto.EmployeeDetailsDTO;
import com.demo.app.dto.EmployeeResponseDTO;
import com.demo.app.entity.Employee;


public interface EmployeeService {
	
	EmployeeDetailsDTO getEmployeDetails(Integer employeeId);
	EmployeeResponseDTO getAllEmployeeDetails(Integer pageNo, Integer pageSize);
	Employee saveEmployeeDetails(EmployeeDetailsDTO employeeDetailsDto);

}
