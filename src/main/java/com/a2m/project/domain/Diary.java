package com.a2m.project.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "subclass_diary")
public class Diary {
	@Id
	private Long stuId;
	
	@Column(name ="class_id")
	private Long classId;
	
	@Column(name = "year")
	private String year;
	
	@Column(name ="status")
	private String status;
	
	
}
