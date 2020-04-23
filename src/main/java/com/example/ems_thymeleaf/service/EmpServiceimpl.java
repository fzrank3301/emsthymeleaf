package com.example.ems_thymeleaf.service;

import com.example.ems_thymeleaf.dao.EmpMapper;
import com.example.ems_thymeleaf.entity.EmpEnity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmpServiceimpl  implements EmpService{

    @Autowired
    EmpMapper empMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<EmpEnity> findAll() {
        List<EmpEnity> all = empMapper.findAll();
        return all;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public void save(EmpEnity emp) {
        emp.setId(UUID.randomUUID().toString());
        empMapper.Save(emp);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public void delete(String id) {
        empMapper.delete(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public EmpEnity find(String id) {
        EmpEnity empEnity = empMapper.find(id);
        return empEnity;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public void update(EmpEnity emp) {
        System.out.printf("START -- INSERT "+ emp.toString());
        empMapper.update(emp);
    }


}
