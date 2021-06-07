package com.mindtree.spring.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.spring.student.entity.Student;
import com.mindtree.spring.student.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	private StudentService service;
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student)
	{
		return service.addStudent(student);
		//fftffgjyfgyg
	}
	@PostMapping("/students")
 public List<Student> saveStudents(@RequestBody List<Student> students)
 {
	 return service.addStudents(students);
 }
	@GetMapping("/getStudents/{id}")
	public Student getStudentById(@PathVariable(value="id") int userid)
	{
		return service.findById(userid);
	}
	
	@DeleteMapping("/getdelete/{id}")
	public String deleteStudentById(@PathVariable(value="id") int userid)
	{
		return service.deleteStudent(userid);
	}
	@PutMapping( "/updatestudent")
	public Student updateStudentById( @RequestBody Student student )
    {
        return service.updateStudentById( student);
    }
	
	
}
