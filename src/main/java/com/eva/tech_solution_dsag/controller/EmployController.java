package com.eva.tech_solution_dsag.controller;

import com.eva.tech_solution_dsag.dto.CreateEmployRequest;
import com.eva.tech_solution_dsag.dto.EmployResponse;
import com.eva.tech_solution_dsag.service.EmployService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployController {

    private final EmployService service;

    public EmployController(EmployService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EmployResponse create(@Valid @RequestBody CreateEmployRequest request) {
        return service.create(request);
    }

    // LIST
    @GetMapping
    public List<EmployResponse> list() {
        return service.list();
    }
}