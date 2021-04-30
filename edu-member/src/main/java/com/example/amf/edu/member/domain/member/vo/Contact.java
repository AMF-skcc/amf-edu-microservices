package com.example.amf.edu.member.domain.member.vo;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Contact {
	private String email;
	private String mobile;
}
