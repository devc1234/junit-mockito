package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmmployeRepositary;
import com.example.demo.model.Employe;
import com.example.demo.model.Responce;

@RestController
public class Employecontroller {

	@Autowired
  private EmmployeRepositary repositary;
	
	
	@PostMapping("/addEmploye")
	public Responce addEmployee(@RequestBody Employe employe) {
	 	repositary.save(employe);
		return null;
		}
	
	
	@GetMapping
	public Responce getAllEmployees() {
	List<Employe>	employes= repositary.findAll();
		return new Responce("record count : "+employes.size(),Boolean.FALSE);
	}
	
}
