package com.example.ems_thymeleaf.dao;

import com.example.ems_thymeleaf.entity.EmpEnity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {

    List<EmpEnity> findAll();

    void  Save(EmpEnity emp);

    void  delete(String id);

    EmpEnity find(String id);

    void update(EmpEnity empEnity);
}
