package com.a2m.project.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column( name ="stu_name")
	private String stuName;
	
	@Column( name ="birthday")
	private Date birthday;
	
	@Column( name ="gender")
	private String gender;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "admission_date")
	private String admissionDate;
	
	@Column(name = "status")
	private String status;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name ="subject_student",
			joinColumns = @JoinColumn(name ="sub_id"),
			inverseJoinColumns= @JoinColumn(name ="subject_id"))
	private List<Subject> subjects;
	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name ="student_has_parent",
			joinColumns = @JoinColumn(name ="sub_id"),
			inverseJoinColumns= @JoinColumn(name ="parent_id"))
	private List<Parent> parents;

	

}
