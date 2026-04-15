package com.eva.tech_solution_dsag.service;

import com.eva.tech_solution_dsag.dto.CreateEmployRequest;
import com.eva.tech_solution_dsag.dto.EmployResponse;
import java.util.List;

public interface EmployService {

    EmployResponse create(CreateEmployRequest request);

    List<EmployResponse> list();
}