package com.ocean.demoOracleAPI.service.impl;

import com.ocean.demoOracleAPI.model.TeacherClass;
import com.ocean.demoOracleAPI.repository.TeacherClassRepository;
import com.ocean.demoOracleAPI.service.TeacherClassService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class TeacherClassServiceImpl implements TeacherClassService {

    private final TeacherClassRepository teacherClassRepository;

    public TeacherClassServiceImpl(TeacherClassRepository teacherClassRepository) {
        this.teacherClassRepository = teacherClassRepository;
    }

    @Override
    public List<TeacherClass> getAllTeacherClasses() {
        return teacherClassRepository.findAll();
    }

    @Override
    public List<TeacherClass> findByLastName(String lastName) {
        return teacherClassRepository.findByLastName(lastName);
    }

    @Override
    public List<TeacherClass> findByFirstName(String firstName) {
        return teacherClassRepository.findByFirstName(firstName);
    }

    @Override
    public List<TeacherClass> findByClassName(String className) {
        return teacherClassRepository.findByClassName(className);
    }
}
