package com.education.controller;

import com.education.dto.ApiResponse;
import com.education.dto.CourseAllocationServiceDto;
import com.education.service.CourseAllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseAllocationController {
    @Autowired
    CourseAllocationService courseAllocationService;

    /**
     *
     * @param courseAllocationServiceDto
     * @return
     */
    @PostMapping("/courseAllocate")
    private ApiResponse saveStudent(@RequestBody CourseAllocationServiceDto courseAllocationServiceDto)
    {
        courseAllocationService.allocate(courseAllocationServiceDto);
        return new ApiResponse(100,"Allocation has been done");
    }


    @PutMapping("/courseAllocate")
    private ApiResponse updateStudentAllocation(@RequestBody CourseAllocationServiceDto courseAllocationServiceDto)
    {
        courseAllocationService.updateallocate(courseAllocationServiceDto);
        return new ApiResponse(100,"Allocation has been update");
    }

}
