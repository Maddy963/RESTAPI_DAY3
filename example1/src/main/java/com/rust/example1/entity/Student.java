package com.rust.example1.entity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Student {
	private int id;
	private String name;
	private String dept;
	public Student(int id,String name,String dept){
			this.id = id;
			this.name = name;
			this.dept = dept;}
		public Student() {
		}
		@GetMapping("/message")
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public String getDept() {
			return dept;
		}
		public void setId(int id) {
			this.id=id;
		}
		public void setName(String name) {
			this.name=name;
		}
		public void setDept(String dept) {
			this.dept=dept;
		}
		public String toString() {
			return ("EmployeeId"+id+","+"Name"+name+","+"Department"+dept);
		}
}