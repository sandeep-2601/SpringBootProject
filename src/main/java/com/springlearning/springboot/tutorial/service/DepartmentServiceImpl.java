package com.springlearning.springboot.tutorial.service;

import com.springlearning.springboot.tutorial.entity.Department;
import com.springlearning.springboot.tutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartments(){ return departmentRepository.findAll();}

    @Override
    public Department getParticularDepartment(Long departmentId) {return departmentRepository.findById(departmentId).get();}

    @Override
    public Department deleteParticularDepartment(Long departmentId) {
        Department department = departmentRepository.findById(departmentId).get();
        departmentRepository.deleteById(departmentId);
        return department;
    }

    @Override
    public Department updateParticularDepartment(Long departmentId,Department department) {
        Department oldDepartment = departmentRepository.findById(departmentId).get();
        if(Objects.nonNull(department.getDepartmentAddress())&& !"".equalsIgnoreCase(department.getDepartmentAddress()))
            oldDepartment.setDepartmentAddress(department.getDepartmentAddress());
        if(Objects.nonNull(department.getDepartmentCode())&& !"".equalsIgnoreCase(department.getDepartmentCode()))
            oldDepartment.setDepartmentCode(department.getDepartmentCode());
        if(Objects.nonNull(department.getDepartmentName())&& !"".equalsIgnoreCase(department.getDepartmentName()))
            oldDepartment.setDepartmentName(department.getDepartmentName());
        return departmentRepository.save(oldDepartment);
    }

}
