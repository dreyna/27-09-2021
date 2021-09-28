package com.example.repaso2709.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.repaso2709.model.Facultad;
import com.example.repaso2709.service.FacultadService;


@RestController
@RequestMapping("api/facutades")
public class FacultadController {
	@Autowired
	private FacultadService facultadService;
	
	@PostMapping("/create")
	public ResponseEntity<Facultad> save(@RequestBody Facultad facultad){
		try {
			Facultad al = facultadService.create(facultad);
			return new ResponseEntity<>(al, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
