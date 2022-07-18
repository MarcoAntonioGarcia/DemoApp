package com.demo.app.dto;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter

public class EmployeeDetailsDTO {
	
	
	public EmployeeDetailsDTO() {
	}
	public EmployeeDetailsDTO(Integer employeeId, Integer taxId, String employeeName, String employeeLastName,
			LocalDate bithDate, String eMail, Integer celPhone, String isActive, LocalDate dateCreate) {
		this.employeeId = employeeId;
		this.taxId = taxId;
		this.employeeName = employeeName;
		this.employeeLastName = employeeLastName;
		this.bithDate = bithDate;
		this.eMail = eMail;
		this.celPhone = celPhone;
		this.isActive = isActive;
		this.dateCreate = dateCreate;
	}
	private Integer employeeId;
	private Integer taxId;
	private String employeeName;
	private String employeeLastName;
	private LocalDate bithDate;
	private String eMail;
	private Integer celPhone;
	private String isActive;
	private LocalDate dateCreate;
	private ResponseDTO responseDTO;
	
	
	

}
