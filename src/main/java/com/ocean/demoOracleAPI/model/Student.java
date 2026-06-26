package com.ocean.demoOracleAPI.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "TBLSTUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @SequenceGenerator(name = "student_seq", sequenceName = "STUDENT_SEQ", allocationSize = 1)
    @Column(name = "STUDENT_ID")
    private Long studentId;

    @Column(name = "FIRST_NAME", length = 100)
    private String firstName;

    @Column(name = "LAST_NAME", length = 100)
    private String lastName;

    @Column(name = "ENROLLED_DATE")
    private LocalDate enrolledDate;

    public Student() {
    }

    public Student(String firstName, String lastName, LocalDate enrolledDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.enrolledDate = enrolledDate;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
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

    public LocalDate getEnrolledDate() {
        return enrolledDate;
    }

    public void setEnrolledDate(LocalDate enrolledDate) {
        this.enrolledDate = enrolledDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", enrolledDate=" + enrolledDate +
                '}';
    }
}
