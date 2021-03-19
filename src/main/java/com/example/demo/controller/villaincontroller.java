package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.villainsDao;
import com.example.demo.model.villains;

@RestController

public class villaincontroller {
	
	@Autowired
	private villainsDao dao;
	
	@PostMapping("/savevillains")
	public String filldata(@RequestBody List<villains> villains)
	{
		
	dao.saveAll(villains);
	
	return "villains save"+villains.size();
	
	}
	
	@GetMapping("/getvillains")
	public List<villains> showdata()
	{
		return (List<villains>)dao.findAll();
	
		
	}
	

}
