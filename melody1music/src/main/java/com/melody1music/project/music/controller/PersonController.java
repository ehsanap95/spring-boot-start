package com.melody1music.project.music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import com.melody1music.project.music.dto.PersonDTO;
import com.melody1music.project.music.entity.Person;
import com.melody1music.project.music.service.inter.IPersonService;

@RestController
public class PersonController {
	
	@Autowired
	private IPersonService iPersonService;
	
	@GetMapping("/getAllPersons")
	public String getAllPersons() {
		return "Get All Persons:"+iPersonService.findAll();
	}
	
	@GetMapping("/getPersonById")
	public String getPersonById(@RequestHeader Long id) {
		return "Person By Id:" + iPersonService.findById(id);
	}
	
	@GetMapping("/getPersonByName")
	public String getPersonByName(@RequestHeader String name) {
		return "Person By Name:" +iPersonService.findByName(name);
	}
	
	@PostMapping("/createPerson")
	public PersonDTO createUser(@RequestHeader String name) {
		PersonDTO personDTO=new PersonDTO();
		personDTO.setName(name);
		return iPersonService.save(personDTO);
	}
	
	@PutMapping("/updatePerson")
	public PersonDTO updatePerson(@RequestBody Person person) {
		return iPersonService.update(person);
	}
	
	@DeleteMapping("/deletePerson")
	public String deleteUser(@RequestHeader Long id) {
		iPersonService.deleteById(id);
		return "Delete Person:";
	}

}