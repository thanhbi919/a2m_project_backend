package com.a2m.project.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "teacher")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "teacher_name")
	private String teacherName;
	
	@Column(name = "birthday")
	private Date birthday;
	
	@Column(name ="gender")
	private String gender;
	
	@Column(name ="level")
	private String level;
	
	@Column(name = "graduation_year")
	private String graduationYear;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "telephone")
	private String telephone;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "work_start_date")
	private Date workStatedDate;
	
	@Column(name = "status")
	private String status;
	
	@ManyToOne
	@JoinColumn(name ="subject_id")
	private Subject subject;
	


}
