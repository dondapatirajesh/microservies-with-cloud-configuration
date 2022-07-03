package com.rajesh.department.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajesh.department.entity.Department;
import com.rajesh.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public Department saveDepartment(Department department) {
		logger.info("Inside saveDepartment method of DepartmentService");
		return departmentRepository.save(department);
	}
	
	public Department findDepartmentById(Long departmentId) {
		logger.info("Inside findDepartmentById method of DepartmentService");
		return departmentRepository.findByDepartmentId(departmentId);
	}
}
