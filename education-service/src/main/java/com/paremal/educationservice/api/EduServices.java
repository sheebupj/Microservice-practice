package com.paremal.educationservice.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paremal.educationservice.model.StudentDto;
import com.paremal.educationservice.model.Students;
import com.paremal.educationservice.repo.StudentRepo;
import com.paremal.educationservice.repo.UserRepo;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class EduServices {
	private static final Logger LOGGER= LoggerFactory.getLogger(EduServices.class);
	
	@Autowired
	StudentRepo sudentRepo;
	
	@Autowired
	UserRepo userRepo;
	@Autowired
    private ModelMapper modelMapper;
	
	@GetMapping("/status")
	public String getMessage() {
		LOGGER.info("##################################"+"from get message");
		return "this implimentation is successfull!";
	}
	
	@GetMapping("/all")
	public List<Students> allStudents(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));
		LOGGER.info("##################################"+"from all students:"+dtf.format(now));
		return sudentRepo.findAll();
	}
	
	@PostMapping("/addstudent")
	public ResponseEntity<Students> addStudent(@RequestBody StudentDto studentDto) throws URISyntaxException{
		LOGGER.info("***********************************************"+studentDto.toString());
		Students student= modelMapper.map(studentDto, Students.class);
	  Students savedStudent=sudentRepo.save(student);
	  return ResponseEntity.created(new URI(savedStudent.getId().toString())).body(savedStudent);
	}

}
