package com.demo.app.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class EmployeeResponseDTO {
	private List<EmployeeDetailsDTO> employeeList = new ArrayList<>();
	private ResponseDTO responseDTO;

}
