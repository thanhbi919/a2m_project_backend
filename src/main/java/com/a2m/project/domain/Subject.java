package com.a2m.project.domain;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "Subject")
@Table(name = "subject")
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name ="subject_name")
	private String subject_name;
	
	@Column(name ="status")
	private String status;
	
	@OneToMany(mappedBy = "subject")
	private List<Teacher> teachers;
	
	@ManyToMany(mappedBy = "subjects")
	
	private List<Student> students;
	

}
