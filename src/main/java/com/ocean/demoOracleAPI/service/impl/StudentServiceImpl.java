package com.ocean.demoOracleAPI.service.impl;

import com.ocean.demoOracleAPI.model.Student;
import com.ocean.demoOracleAPI.repository.StudentRepository;
import com.ocean.demoOracleAPI.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Long id, Student studentDetails) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));

        student.setFirstName(studentDetails.getFirstName());
        student.setLastName(studentDetails.getLastName());
        student.setEnrolledDate(studentDetails.getEnrolledDate());

        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
        studentRepository.delete(student);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> findByLastName(String lastName) {
        return studentRepository.findByLastName(lastName);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> findByFirstName(String firstName) {
        return studentRepository.findByFirstName(firstName);
    }
}
