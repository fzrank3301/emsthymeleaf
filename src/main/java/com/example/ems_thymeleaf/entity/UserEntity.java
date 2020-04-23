package com.example.ems_thymeleaf.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class UserEntity {
    private String id;
    private String username;
    private String realname;
    private String password;
    private String sex;
}
