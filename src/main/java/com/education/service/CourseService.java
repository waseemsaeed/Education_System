package com.education.service;

import com.education.model.Course;
import com.education.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    /**
     *
     * @return
     */
    public List<Course> getAllCourse()
    {
        List<Course> students = new ArrayList<Course>();
        courseRepository.findAll().forEach(student -> students.add(student));
        return students;
    }

    /**
     *
     * @param id
     * @return
     */
    //getting a specific record
    public Course getCourseById(int id)
    {

        return courseRepository.findById(id).get();

    }

    /**
     *
     * @param course
     */
    public void saveOrUpdate(Course course)
    {
        courseRepository.save(course);
    }
    //deleting a specific record

    /**
     *
     * @param id
     */
    public void delete(int id)
    {

        courseRepository.deleteById(id);
    }
}
