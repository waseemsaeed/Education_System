package com.education.repository;
import org.springframework.data.repository.CrudRepository;
import com.education.model.Student;
public interface StudentRepository extends CrudRepository<Student, Integer>
{
}
