package com.ocean.demoOracleAPI.repository;

import com.ocean.demoOracleAPI.model.TeacherClass;
import com.ocean.demoOracleAPI.model.TeacherClassId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherClassRepository extends JpaRepository<TeacherClass, TeacherClassId> {

    List<TeacherClass> findByLastName(String lastName);

    List<TeacherClass> findByClassName(String className);

    List<TeacherClass> findByFirstName(String firstName);
}
