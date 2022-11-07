package com.example.demo;

import com.example.demo.repositories.*;
import com.example.entities.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cursos")
public class CRUDcontroller {
	
	@Autowired
	CursRepository cursoRep;
	
	@GetMapping("")
	public List<Curs> llistaCurs(){
		return cursoRep.findAll();
	}
}
