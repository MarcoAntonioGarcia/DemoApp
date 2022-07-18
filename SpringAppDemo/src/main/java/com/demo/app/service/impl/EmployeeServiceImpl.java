package com.demo.app.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.demo.app.dto.EmployeeDetailsDTO;
import com.demo.app.dto.EmployeeResponseDTO;
import com.demo.app.dto.ResponseDTO;
import com.demo.app.entity.Employee;
import com.demo.app.repository.EmployeeRepository;
import com.demo.app.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public EmployeeDetailsDTO getEmployeDetails(Integer employeeId) {
		EmployeeDetailsDTO employeeDetailsDTO = employeeRepository.findByEmployeeId(employeeId);
		ResponseDTO responseDTO = new ResponseDTO("User Information Fetched Successfully", 200);
		employeeDetailsDTO.setResponseDTO(responseDTO);
		return employeeDetailsDTO;
	}

	@Override
	public EmployeeResponseDTO getAllEmployeeDetails(Integer pageNo, Integer pageSize) {
		Pageable paging = PageRequest.of(pageNo, pageSize);
		Page<Employee> employeePage = employeeRepository.findAll(paging);
		List<Employee> employeeList = employeePage.getContent();
		List<EmployeeDetailsDTO> employeeDetailsList = employeeList.stream()
				.map(employee -> {
					    EmployeeDetailsDTO employeeDetail = new EmployeeDetailsDTO();
						BeanUtils.copyProperties(employee, employeeDetail);
						return employeeDetail;
					}).collect(Collectors.toList());
		ResponseDTO responseDTO = new ResponseDTO("Store Details Fetch Success", 200);
		EmployeeResponseDTO employeeResponseDto = new EmployeeResponseDTO();
		employeeResponseDto.setEmployeeList(employeeDetailsList);
		employeeResponseDto.setResponseDTO(responseDTO);
		return employeeResponseDto;
	
	}

	@Override
	public Employee saveEmployeeDetails(EmployeeDetailsDTO employeeDetailsDto) {
		Employee employee = new Employee();
		BeanUtils.copyProperties(employeeDetailsDto, employee);
		return employeeRepository.save(employee);
	}

	
}
