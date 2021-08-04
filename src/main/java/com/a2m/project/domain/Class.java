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
@Entity(name = "Class")
@Table(name = "class")
public class Class {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "class_name")
	private String class_name;
	
	@Column(name ="total_stu")
	private Integer total_stu;
	
	@Column(name ="teacher_id")
	private Long teacher_id;
	
	@Column(name = "status")
	private String status;
}
