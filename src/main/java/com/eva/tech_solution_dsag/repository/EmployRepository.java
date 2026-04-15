package com.eva.tech_solution_dsag.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eva.tech_solution_dsag.entity.Employ;

public interface EmployRepository extends JpaRepository<Employ, Long> {
}