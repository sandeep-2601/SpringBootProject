package com.springlearning.springboot.tutorial.controller;

import com.springlearning.springboot.tutorial.entity.Department;
import com.springlearning.springboot.tutorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping(value = "/departments")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }
    @GetMapping(value = "/departments")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping(value="/departments/{id}")
    public Department getParticularDepartment(@PathVariable("id") Long departmentId){
        return departmentService.getParticularDepartment(departmentId);
    }
    @DeleteMapping(value="/departments/{id}")
    public Department deleteParticularDepartment(@PathVariable("id") Long departmentId){
        return departmentService.deleteParticularDepartment(departmentId);
    }

    @PutMapping(value="/departments/{id}")
    public Department deleteParticularDepartment(@PathVariable("id") Long departmentId,@RequestBody Department department){
        return departmentService.updateParticularDepartment(departmentId,department);
    }
}
