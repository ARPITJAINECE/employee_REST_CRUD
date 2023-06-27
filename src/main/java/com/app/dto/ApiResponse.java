package com.app.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse {
	private String msg;
	private LocalDateTime timestamp;

	public ApiResponse() {
		// TODO Auto-generated constructor stub
	}

	public ApiResponse(String msg) {
		super();
		this.msg = msg;
		this.timestamp = LocalDateTime.now();
	}

}
