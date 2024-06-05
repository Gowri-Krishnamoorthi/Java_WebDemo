package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dc")
public class controller {
   
	@PostMapping
	public String acceptData(@RequestBody String data) {
		System.out.println("Data :" + data);
		return "Data :" +data;
	}
}
