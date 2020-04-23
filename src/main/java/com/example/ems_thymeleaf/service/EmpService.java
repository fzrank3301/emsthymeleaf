package com.example.ems_thymeleaf.service;

import com.example.ems_thymeleaf.entity.EmpEnity;

import java.util.List;

public interface EmpService {

    List<EmpEnity> findAll();

    void save(EmpEnity emp);

    void delete(String id);

    EmpEnity find(String id);

    void update(EmpEnity emp);

}
