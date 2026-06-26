package com.ocean.demoOracleAPI.controller;

import com.ocean.demoOracleAPI.model.TeacherClass;
import com.ocean.demoOracleAPI.service.TeacherClassService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teacher-classes")
public class TeacherClassController {

    private final TeacherClassService teacherClassService;

    public TeacherClassController(TeacherClassService teacherClassService) {
        this.teacherClassService = teacherClassService;
    }

    @GetMapping
    public ResponseEntity<List<TeacherClass>> getAllTeacherClasses() {
        List<TeacherClass> result = teacherClassService.getAllTeacherClasses();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/search/lastname")
    public ResponseEntity<List<TeacherClass>> findByLastName(@RequestParam String lastName) {
        List<TeacherClass> result = teacherClassService.findByLastName(lastName);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/search/firstname")
    public ResponseEntity<List<TeacherClass>> findByFirstName(@RequestParam String firstName) {
        List<TeacherClass> result = teacherClassService.findByFirstName(firstName);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/search/classname")
    public ResponseEntity<List<TeacherClass>> findByClassName(@RequestParam String className) {
        List<TeacherClass> result = teacherClassService.findByClassName(className);
        return ResponseEntity.ok(result);
    }
}
