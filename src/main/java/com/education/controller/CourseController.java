package com.education.controller;

import com.education.model.Course;
import com.education.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    /**
     *
     * @return
     */
    @GetMapping("/course")
    private List<Course> getAllStudent()
    {
        return courseService.getAllCourse();
    }

    /**
     *
     * @param id
     * @return
     */
    @GetMapping("/course/{id}")
    private Course getStudent(@PathVariable("id") int id)
    {
        return courseService.getCourseById(id);
    }

    /**
     *
     * @param id
     */
    @DeleteMapping("/course/{id}")
    private void deleteStudent(@PathVariable("id") int id)
    {
        courseService.delete(id);
    }

    /**
     *
     * @param course
     * @return
     */
    @PostMapping("/course")
    private int saveStudent(@RequestBody Course course)
    {
        courseService.saveOrUpdate(course);
        return course.getId();
    }

    @PutMapping("/course")
    private int updateCourse(@RequestBody Course course)
    {
        courseService.saveOrUpdate(course);
        return course.getId();
    }
}
