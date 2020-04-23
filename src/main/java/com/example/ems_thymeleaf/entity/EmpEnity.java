package com.example.ems_thymeleaf.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ToString
public class EmpEnity {

    private  String id;
    private  String name;
    private  Double salary;
    private  Integer age;
    private  Date bir;
}
