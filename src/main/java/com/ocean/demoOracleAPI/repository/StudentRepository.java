package com.ocean.demoOracleAPI.repository;

import com.ocean.demoOracleAPI.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByLastName(String lastName);

    List<Student> findByFirstName(String firstName);

    List<Student> findByEnrolledDateBetween(LocalDate start, LocalDate end);
}
