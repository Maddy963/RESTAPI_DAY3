package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Model 
{
	@JsonIgnore
	private int id;
	private String name;
	@JsonProperty("RJ")
	private String dept;
	private int number;
	public int getNumber() 
	{
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Model(int id, String name, String dept, int number) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.number = number;
	}


}
