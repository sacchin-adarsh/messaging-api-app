package com.training.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MessagingApiAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		printGreetings();
		
	}
	
	public static void printGreetings()
	{
		System.out.println("Hi Oracle!!!");
	}
	
	@GetMapping("enjoyWeekend")
	public String printName() {
		return "Happy Weekend Sacchin ";
	}
}
