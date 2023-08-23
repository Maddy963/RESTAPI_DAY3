package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.*;

@RestController
public class Controller 
{
	@GetMapping("/dis")
	public List<Model> info()
	{
		return Arrays.asList(new Model(01,"Madhavan","ECE",6369));	
	}
}
