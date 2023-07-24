package com.education.repository;

import com.education.model.CourseAllocation;
import org.springframework.data.repository.CrudRepository;

public interface CourseAllocationRepository extends CrudRepository<CourseAllocation, Integer> {
}
