package com.a2m.project.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "class")
public class Class {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "class_name")
	private String className;
	
	@Column(name ="total_stu")
	private Integer totalStu;
	
	@Column(name ="teacher_id")
	private Long teacherId;
	
	@Column(name = "status")
	private String status;
}
