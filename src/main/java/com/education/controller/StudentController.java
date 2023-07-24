package com.education.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.education.model.Student;
import com.education.service.StudentService;
//creating RestController
@RestController
public class StudentController 
{

    @Autowired
    StudentService studentService;

    /**
     *
     * @return
     */
    @GetMapping("/student")
    private List<Student> getAllStudent()
    {
    return studentService.getAllStudent();
    }

    /**
     *
     * @param id
     * @return
     */
    @GetMapping("/student/{id}")
    private Student getStudent(@PathVariable("id") int id)
    {
    return studentService.getStudentById(id);
    }

    /**
     *
     * @param id
     */
    @DeleteMapping("/student/{id}")
    private void deleteStudent(@PathVariable("id") int id)
    {
    studentService.delete(id);
    }

    /**
     *
     * @param student
     * @return
     */
    @PostMapping("/student")
    private int saveStudent(@RequestBody Student student)
    {
    studentService.saveOrUpdate(student);
    return student.getId();
    }

    /**
     *
     * @param student
     * @return
     */
    @PutMapping("/student")
    private int updateStudent(@RequestBody Student student)
    {
        studentService.saveOrUpdate(student);
        return student.getId();
    }
}
