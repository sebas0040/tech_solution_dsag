package com.eva.tech_solution_dsag.repository;

import com.eva.tech_solution_dsag.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}