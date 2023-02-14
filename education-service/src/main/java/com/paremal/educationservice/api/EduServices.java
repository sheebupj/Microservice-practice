package com.paremal.educationservice.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paremal.educationservice.model.Students;
import com.paremal.educationservice.repo.StudentRepo;
import com.paremal.educationservice.repo.UserRepo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class EduServices {
	private static final Logger LOGGER= LoggerFactory.getLogger(EduServices.class);
	
	@Autowired
	StudentRepo sudentRepo;
	
	@Autowired
	UserRepo userRepo;
	
	@GetMapping("/status")
	public String getMessage() {
		return "this implimentation is successfull!";
	}
	
	@GetMapping("/allstudents")
	public List<Students> allStudents(){
		return sudentRepo.findAll();
	}

}
