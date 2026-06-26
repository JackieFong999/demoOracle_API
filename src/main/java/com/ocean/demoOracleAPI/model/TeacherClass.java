package com.ocean.demoOracleAPI.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

import java.time.LocalDate;

@Entity
@Immutable
@Table(name = "VWTEACHER_CLASS")
public class TeacherClass {

    @EmbeddedId
    private TeacherClassId id;

    @Column(name = "FIRST_NAME", length = 100)
    private String firstName;

    @Column(name = "LAST_NAME", length = 100)
    private String lastName;

    @Column(name = "CLASS_NAME", length = 100)
    private String className;

    public TeacherClass() {
    }

    public TeacherClassId getId() {
        return id;
    }

    public void setId(TeacherClassId id) {
        this.id = id;
    }

    public Long getStudentId() {
        return id != null ? id.getStudentId() : null;
    }

    public Long getClassId() {
        return id != null ? id.getClassId() : null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "TeacherClass{" +
                "studentId=" + getStudentId() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", classId=" + getClassId() +
                ", className='" + className + '\'' +
                '}';
    }
}
