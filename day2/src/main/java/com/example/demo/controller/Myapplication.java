package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myapplication
{
	@Value("${var}")   
	private String name;
	@Value("${varq}")
	@GetMapping("/")
	public String display()
	{
		return "welcome "+name;
	}
}
