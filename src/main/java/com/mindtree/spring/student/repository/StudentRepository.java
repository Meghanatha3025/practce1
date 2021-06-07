package com.mindtree.spring.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.spring.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	//public Student deleteById(int userid);
  //  public Student updateStudentById( Student student,int userid);


}
