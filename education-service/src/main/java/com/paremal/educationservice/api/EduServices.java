package com.paremal.educationservice.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class EduServices {
	private static final Logger LOGGER= LoggerFactory.getLogger(EduServices.class);
	
	@GetMapping("/status")
	public String getMessage() {
		return "this implimentation is success!";
	}

}
