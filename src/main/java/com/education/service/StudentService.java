package com.education.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.education.model.Student;
import com.education.repository.StudentRepository;
//defining the business logic
@Service
public class StudentService 
{
@Autowired
StudentRepository studentRepository;
//getting all student records

        /**
         *
         * @return
         */
        public List<Student> getAllStudent()
        {
                List<Student> students = new ArrayList<Student>();
                studentRepository.findAll().forEach(student -> students.add(student));
                return students;
        }

        /**
         *
         * @param id
         * @return
         */
        //getting a specific record
        public Student getStudentById(int id)
        {

            return studentRepository.findById(id).get();

        }

        /**
         *
         * @param student
         */
        public void saveOrUpdate(Student student)
        {
                studentRepository.save(student);
        }

        /**
         *
         * @param id
         */
        //deleting a specific record
        public void delete(int id)
        {

            studentRepository.deleteById(id);
        }
}