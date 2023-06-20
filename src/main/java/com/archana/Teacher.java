package com.archana;

import org.springframework.beans.factory.annotation.Autowired;

public class Teacher {
	
	@Autowired
	Student student;
	public void TeacherMethod(){
		
		System.out.println("hello world");
		System.out.println("------------");
		student.StudentMethod();
	
	}

	
	}

