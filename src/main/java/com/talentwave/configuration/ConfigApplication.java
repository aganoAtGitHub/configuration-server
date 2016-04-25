package com.talentwave.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RequestMapping("/config")
@RestController
public class ConfigApplication {

	@RequestMapping(method = RequestMethod.GET)
	public String hello(){
		return "Hello Aman! Greetings from Configured Bootable World. ";
	}
	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}
}
