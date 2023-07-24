package com.education.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "courses")
    @JsonIgnore
    private Set<Student> tutorials = new HashSet<>();
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


    public Set<Student> getTutorials() {
        return tutorials;
    }

    public void setTutorials(Set<Student> tutorials) {
        this.tutorials = tutorials;
    }
}
