package com.springlearning.springboot.tutorial.service;

import com.springlearning.springboot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);
   public List<Department> getAllDepartments();
   public Department getParticularDepartment(Long departmentId);
   public Department deleteParticularDepartment(Long departmentId);
   public Department updateParticularDepartment(Long departmentId,Department department);
}
