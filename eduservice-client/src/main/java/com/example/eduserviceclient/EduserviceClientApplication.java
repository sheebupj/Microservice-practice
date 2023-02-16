package com.example.eduserviceclient;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.paremal.educationservice.model.StudentDto;


@SpringBootApplication
@RestController
public class EduserviceClientApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EduserviceClientApplication.class);
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/all")
	public List getAllStudents(){
	LOGGER.info("###########################");
		return restTemplate.getForObject("http://educationservice/all", List.class);
		
	}
//	@PostMapping("/addstudent")
//	public StudentDto addStudent(@RequestBody StudentDto studentDto){
//		LOGGER.info("*********************************************************"+studentDto.toString());
//		return  restTemplate.postForObject("http://educationservice/addstudent", studentDto, StudentDto.class);
//	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(EduserviceClientApplication.class, args);
	}
	

}
