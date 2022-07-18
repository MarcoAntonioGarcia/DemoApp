package com.demo.app.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ResponseDTO {
	
	private String message;
	private Integer statusCode;

}
