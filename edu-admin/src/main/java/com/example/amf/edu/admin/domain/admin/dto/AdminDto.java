package com.example.amf.edu.admin.domain.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDto {
	private Long id;
	private String name;
	private String email;
}
