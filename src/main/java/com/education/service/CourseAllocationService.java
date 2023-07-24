package com.education.service;

import com.education.dto.CourseAllocationServiceDto;
import com.education.model.Course;
import com.education.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseAllocationService {

    @Autowired
    CourseService courseService;
    @Autowired
    StudentService studentService;

    /**
     *
     * @param courseAllocationServiceDto
     */
    public void allocate(CourseAllocationServiceDto courseAllocationServiceDto)
    {
        Course course=courseService.getCourseById(courseAllocationServiceDto.getCourseId());
        Student student=studentService.getStudentById(courseAllocationServiceDto.getStudentId());

        student.getCourses().add(course);
        studentService.saveOrUpdate(student);
    //    courseAllocationRepository.save(courseAllocation);
    }

    /**
     *
     * @param courseAllocationServiceDto
     */
    public void updateallocate(CourseAllocationServiceDto courseAllocationServiceDto)
    {
        Course course=courseService.getCourseById(courseAllocationServiceDto.getCourseId());
        Student student=studentService.getStudentById(courseAllocationServiceDto.getStudentId());

        student.getCourses().remove(course);
        studentService.saveOrUpdate(student);
        //    courseAllocationRepository.save(courseAllocation);
    }


}
