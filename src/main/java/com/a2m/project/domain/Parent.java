package com.a2m.project.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "Parent")
@Table(name = "parent")
public class Parent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "teacher_name")
	private String teacher_name;
	
	@Column(name = "birthday")
	private Date birthday;
	
	@Column(name ="gender")
	private String gender;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "telephone")
	private String telephone;
	
	@Column(name = "email")
	private String email;

	@Column(name = "status")
	private String status;
	
	@ManyToMany(mappedBy = "parents")
	private List<Student> p_students ;
	
}
