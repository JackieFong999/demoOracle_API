package com.ocean.demoOracleAPI.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TeacherClassId implements Serializable {

    @Column(name = "STUDENT_ID")
    private Long studentId;

    @Column(name = "CLASS_ID")
    private Long classId;

    public TeacherClassId() {
    }

    public TeacherClassId(Long studentId, Long classId) {
        this.studentId = studentId;
        this.classId = classId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeacherClassId that)) return false;
        return Objects.equals(studentId, that.studentId) &&
               Objects.equals(classId, that.classId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, classId);
    }
}
