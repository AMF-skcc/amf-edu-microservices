package com.example.amf.edu.course.domain.course.vo;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Classroom {
	private String building;
	private String floor;
	private String roomNo;
}
