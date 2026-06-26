package com.ocean.demoOracleAPI.service;

import com.ocean.demoOracleAPI.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getAllStudents();

    Optional<Student> getStudentById(Long id);

    Student createStudent(Student student);

    Student updateStudent(Long id, Student studentDetails);

    void deleteStudent(Long id);

    List<Student> findByLastName(String lastName);

    List<Student> findByFirstName(String firstName);
}
