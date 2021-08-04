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
@Entity(name = "Diary")
@Table(name = "subclass_diary")
public class Diary {
	@Id
	private Long stu_id;
	
	@Column(name ="class_id")
	private Long class_id;
	
	@Column(name = "year")
	private String year;
	
	@Column(name ="status")
	private String status;
	
	
}
