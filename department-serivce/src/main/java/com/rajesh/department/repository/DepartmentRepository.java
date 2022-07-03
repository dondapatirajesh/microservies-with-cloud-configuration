package com.rajesh.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajesh.department.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	Department findByDepartmentId(Long departmentId);
}