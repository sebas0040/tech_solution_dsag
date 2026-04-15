package com.eva.tech_solution_dsag.service.impl;

import com.eva.tech_solution_dsag.dto.CreateEmployRequest;
import com.eva.tech_solution_dsag.dto.EmployResponse;
import com.eva.tech_solution_dsag.entity.Employ;
import com.eva.tech_solution_dsag.repository.EmployRepository;
import com.eva.tech_solution_dsag.service.EmployService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployServiceImpl implements EmployService {

    private final EmployRepository repository;

    public EmployServiceImpl(EmployRepository repository) {
        this.repository = repository;
    }

    @Override
    public EmployResponse create(CreateEmployRequest request) {

        // DTO → Entity
        Employ employ = new Employ();
        employ.setName(request.getName());
        employ.setEmail(request.getEmail());
        employ.setPosition(request.getPosition());

        // Guardar en BD
        Employ saved = repository.save(employ);

        // Entity → DTO
        return toResponse(saved);
    }

    @Override
    public List<EmployResponse> list() {
        return repository.findAll()
                .stream()
                .map(this::toResponse)
                .toList();
    }

    // Mapper
    private EmployResponse toResponse(Employ employ) {
        EmployResponse response = new EmployResponse();
        response.setId(employ.getId());
        response.setName(employ.getName());
        response.setEmail(employ.getEmail());
        response.setPosition(employ.getPosition());
        response.setCreatedAt(employ.getCreatedAt());
        response.setUpdatedAt(employ.getUpdatedAt());
        return response;
    }
}