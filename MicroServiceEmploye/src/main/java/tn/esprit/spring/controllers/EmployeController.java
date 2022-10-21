package tn.esprit.spring.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.services.employeService;

@Slf4j
@RestController
@RequestMapping("/employe")
public class EmployeController {
	@Autowired
	employeService employeservice;
	
	@GetMapping("/getEmploye/{id}")
	@ResponseBody
	public ResponseEntity<Employe> getEmploye(@PathVariable int id){
		return ResponseEntity.ok().body(employeservice.retreiveEmploye(id));
	}
	@PostMapping("/addEmploye")
	@ResponseBody
	public ResponseEntity<?> addEmploye(@RequestBody Employe employe){
		URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/employe/addEmploye").toUriString());
		return ResponseEntity.created(uri).body(employeservice.addEmploye(employe));		
	}
	@PutMapping("/updateEmploye")
	@ResponseBody
	public ResponseEntity<?> updateEmploye(@RequestBody Employe employe){	
		return ResponseEntity.ok().body(employeservice.updateEmploye(employe));
	}
	
	@DeleteMapping("/deleteEmploye/{id}")
	@ResponseBody
	public ResponseEntity<?> deleteEmploye(@PathVariable int id){
		employeservice.deleteEmploye(id);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/getEmployes")
	@ResponseBody
	public ResponseEntity<List<Employe>> getAllEmployes(){
		return ResponseEntity.ok().body(employeservice.retrieveAllEmployes());
	}
}
