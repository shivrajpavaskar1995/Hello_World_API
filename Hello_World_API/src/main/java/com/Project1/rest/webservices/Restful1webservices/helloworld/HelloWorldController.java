package com.Project1.rest.webservices.Restful1webservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	
	@GetMapping(path="/hello-world")
	public String helloWorld()
	{
		return "Hello World!!";
	}
	
	
}
