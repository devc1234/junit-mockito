package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Employe {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private String dept;
	
	

}
