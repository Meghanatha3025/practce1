package com.mindtree.spring.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.spring.student.entity.Student;
import com.mindtree.spring.student.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repository;

	public Student addStudent(Student student) {
		return repository.save(student);
	}

	public List<Student> addStudents(List<Student> students) {
		return repository.saveAll(students);
	}

	public Student findById(int userid) {
		return repository.findById(userid).orElse(null);
	}

	public String deleteStudent(int userid) {
		repository.deleteById(userid);
		return "product removed :" + userid;
	}

	public Student updateStudentById(Student student) {
		/*
		 * list.forEach(e -> { if( e.getId()==student.getId()) {
		 * e.setName(student.getName()); e.setPlace(student.getPlace()); } });
		 */
		Student stud = repository.findById(student.getId()).orElse(null);
		stud.setName(student.getName());
		stud.setPlace(student.getPlace());
		return repository.save(student);

	}
}
