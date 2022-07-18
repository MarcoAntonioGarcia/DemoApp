package com.demo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.app.dto.EmployeeDetailsDTO;
import com.demo.app.dto.EmployeeResponseDTO;
import com.demo.app.dto.ResponseDTO;
import com.demo.app.service.EmployeeService;



@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employeinfo/{employeeId}")
	public ResponseEntity<EmployeeDetailsDTO> getUserInfo(@PathVariable("employeeId") Integer employeeId) {
		EmployeeDetailsDTO employeeDetailsDTO = employeeService.getEmployeDetails(employeeId);
		//System.out.println("DDD "+ employeeDetailsDTO.getEmployeeId());
		return new ResponseEntity<EmployeeDetailsDTO>(employeeDetailsDTO, HttpStatus.OK);
	}
	
	@GetMapping("/employees")
	public ResponseEntity<EmployeeResponseDTO> getAllEmployeeDetails(
			@RequestParam(defaultValue = "0")Integer pageNo,
			@RequestParam(defaultValue = "10")Integer pageSize) {
		EmployeeResponseDTO employeeResponseDto = employeeService.getAllEmployeeDetails(pageNo, pageSize);
		return new ResponseEntity<EmployeeResponseDTO>(employeeResponseDto, HttpStatus.OK);
	}

	
	@PostMapping("/employeeSave")
	public ResponseEntity<ResponseDTO> saveEmployeeDetails(@RequestBody EmployeeDetailsDTO employeeDetailsDto) {
		employeeService.saveEmployeeDetails(employeeDetailsDto);
		return new ResponseEntity<ResponseDTO>(new ResponseDTO("Product Save Success", 200), HttpStatus.ACCEPTED);
	}

}
