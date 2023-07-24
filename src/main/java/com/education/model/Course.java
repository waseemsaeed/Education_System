package com.education.model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table
public class Course {
    @Id
    @GeneratedValue
    @Column
    private int id;
    @Column
    private String courseName;
    @Column
    private double fees;
    @Column
    private Date startDate;
    @Column
    private Date endDate;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students = new ArrayList<>();
    public Course() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
