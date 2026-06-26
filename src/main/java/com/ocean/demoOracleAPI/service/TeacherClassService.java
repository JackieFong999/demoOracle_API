package com.ocean.demoOracleAPI.service;

import com.ocean.demoOracleAPI.model.TeacherClass;

import java.util.List;

public interface TeacherClassService {

    List<TeacherClass> getAllTeacherClasses();

    List<TeacherClass> findByLastName(String lastName);

    List<TeacherClass> findByFirstName(String firstName);

    List<TeacherClass> findByClassName(String className);
}
